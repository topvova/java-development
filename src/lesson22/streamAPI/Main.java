package lesson22.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public enum Position {

        DIRECTOR, MANAGER, WORKER
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Matt", "London", 36, 15, Position.MANAGER));
        employees.add(new Employee("Ivan", "Lviv", 55, 27, Position.MANAGER));
        employees.add(new Employee("Mikel", "Marseille", 36, 13, Position.MANAGER));
        employees.add(new Employee("Merry", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("Merry", "London", 25, 6, Position.WORKER));
        employees.add(new Employee("John", "Liverpool", 22, 1, Position.WORKER));
        employees.add(new Employee("Robert", "Manchester", 45, 18, Position.MANAGER));
        employees.add(new Employee("Tom", "London", 37, 19, Position.DIRECTOR));
        employees.add(new Employee("Eva", "Krakow", 29, 6, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Jared", "Manchester", 38, 14, Position.WORKER));
        employees.add(new Employee("Andriy", "Ternopil", 23, 4, Position.WORKER));
        employees.add(new Employee("Marta", "Poltava", 33, 10, Position.DIRECTOR));
        employees.add(new Employee("Emma", "Chicago", 22, 3, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));
        employees.add(new Employee("Emilia", "London", 24, 7, Position.WORKER));

        Stream<Employee> employeesStream = employees.stream();
        long streamLength = employees.stream().count();

        // Print the last four elements of the collection
        employeesStream.skip(streamLength - 4).forEach(System.out::println);

        // Find all managers and directors in which names start at “М”
        employeesStream.filter(x -> !x.getPosition().equals(Position.WORKER))
                .filter(x -> x.getName().charAt(0) == 'M')
                .forEach(System.out::println);

        // Print the names of all managers using the “map” method
        employeesStream.filter(x -> x.getPosition().equals(Position.MANAGER))
                .map(Employee::getName) // method reference
                .forEach(System.out::println);

        // Find all the unique workers who have an experience of more than 5 years
        employeesStream.distinct()
                .filter(x -> x.getPosition().equals(Position.WORKER))
                .filter(x -> x.getWorkExperience() > 5)
                .forEach(System.out::println);

        // Create a new collection that will contain all employees from London
        List<Employee> employeesFromLondon = employeesStream.filter(x -> x.getNativeCity().equals("London"))
                .collect(Collectors.toList());
        for (Employee employee: employeesFromLondon) {
            System.out.println(employee.getName());
        }

        // Print the number of employees over 30 years old
        long employeesOver30 = employeesStream.filter(x -> x.getAge() > 30)
                .count();
        System.out.println(employeesOver30);

        // Find the average work experience of employees.
        Optional<Long> averageExperience = employeesStream.map(Employee::getWorkExperience)
                .reduce((acc, x) -> acc + x)
                .map(x -> x / streamLength);

        System.out.println(averageExperience.isPresent() ? averageExperience.get() : "Not found");

        // Add each employee one year of experience
        employeesStream.peek(x -> x.setWorkExperience(x.getWorkExperience() + 1))
                .forEach(System.out::println);

        // Find all employees not from Manchester, aged 25 to 35 years
        employeesStream.filter(x -> !x.getNativeCity().equals("Manchester"))
                .filter(x -> x.getAge() >= 25)
                .filter(x -> x.getAge() <= 35)
                .forEach(System.out::println);

        // Sort all employees by age
        employeesStream.sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);

    }

}
