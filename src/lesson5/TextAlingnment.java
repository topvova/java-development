package lesson5;

import java.util.*;

public class TextAlingnment {

    /**
     * Row width (chars)
     */
    private static int MaxChars = 75;

    /**
     * Aligns entered text to the RIGHT
     * @param input entered text
     * @return formatted text
     */
    public static StringBuilder format(String input) {
        List<String> strings = splitString(input);
        ListIterator<String> listIterator = strings.listIterator();
        StringBuilder result = new StringBuilder();

        while (listIterator.hasNext()) {
            String string = listIterator.next();

            addLeftPadding(result, MaxChars - string.length());
            result.append(string);
            result.append("\n");
        }
        return result;
    }

    /**
     * Inserts preceding spaces to the string
     * @param to output string
     * @param quantity how many spaces
     */
    private static void addLeftPadding(StringBuilder to, int quantity) {
        for (int i = 0; i <= quantity; i++) {
            to.append(' ');
        }
    }

    /**
     * Splits string into word sequences
     * @param string entered text
     * @return list of strings with limited length
     */
    private static List<String> splitString(String string) {
        List<String> stringsList = new ArrayList<>();
        if (string == null) {
            return stringsList;
        }
        String[] substrings = string.trim().split(" ");

        for (int i = 0; i < substrings.length; ) {
            int freeSpace = MaxChars;
            String sequence = "";

            while (i < substrings.length && freeSpace > substrings[i].length() && sequence.length() <= MaxChars) {
                sequence = sequence.concat(substrings[i]).concat(" ");
                freeSpace -= substrings[i].length() + 1;
                i++;
            }
            stringsList.add(sequence);
        }
        return stringsList;
    }

}
