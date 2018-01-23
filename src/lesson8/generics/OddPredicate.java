package lesson8.generics;

public class OddPredicate implements UnaryPredicate<Integer> {

    public boolean test(Integer number) {
        return number % 2 != 0;
    }

}
