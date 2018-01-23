package lesson8.generics;

import java.util.Collection;

public final class Algorithm {

    public static <T> int countIf(Collection<T> collection, UnaryPredicate<T> unaryPredicate) {
        int counter = 0;
        for (T element : collection) {
            if (unaryPredicate.test(element)) {
                counter++;
            }
        }
        return counter;
    }

}
