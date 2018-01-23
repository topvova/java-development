package lesson8.generics;

public class PalindromePredicate implements UnaryPredicate<String> {

    public boolean test(String string) {
        String reverseString = new StringBuilder(string).reverse().toString();

        return string.equals(reverseString);
    }

}
