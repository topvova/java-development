package lesson5;

public class Symbol {

    /**
     * Removes repeated symbols from string
     * @param input entered text
     * @return text without repeated symbols
     */
    public static StringBuilder removeRepeatedSymbolsFromString(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = 1; j < charArray.length; i++, j++) {
            char current = charArray[i];
            char next = charArray[j];

            if (!(next == current)) {
                result.append(current);
            }
            if (j == charArray.length - 1) {
                result.append(next);
            }
            current = next;
        }
        return result;
    }
}
