package lesson8.generics;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Collection<Integer> ints = new ArrayList<>();
        Collection<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ints.add(i);
            System.out.print(i + ", ");
        }
        System.out.println();

        strings.add("word");
        strings.add("abba");
        strings.add("palindrome");
        strings.add("racecar");

        PrimePredicate prime = new PrimePredicate();
        OddPredicate odd = new OddPredicate();
        PalindromePredicate palindrome = new PalindromePredicate();

        System.out.println(Algorithm.countIf(ints, prime));
        System.out.println(Algorithm.countIf(ints, odd));
        System.out.println(Algorithm.countIf(strings, palindrome));

    }
}
