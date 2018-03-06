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

    }

}
