package lesson8.generics;

public class PrimePredicate implements UnaryPredicate<Integer> {

    public boolean test(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }

}
