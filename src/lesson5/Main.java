package lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userInput = getUserInput();

        //System.out.println(Symbol.removeRepeatedSymbolsFromString(userInput));
        //System.out.println(TextAlingnment.format(userInput));

        /*String[] result = BurrowsWheelerAlgorithm.transformInputString(userInput);
        String[] sortedResult = BurrowsWheelerAlgorithm.insertionSort(result);
        System.out.println(BurrowsWheelerAlgorithm.getLastChars(sortedResult));*/
    }

    /**
     * Get the User input
     * @return entered string
     */
    private static String getUserInput() {
        System.out.println("Enter a string sequence, please:\n");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if (inputString.length() == 0) {
            return null;
        }
        return inputString;
    }

}
