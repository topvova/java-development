package lesson5;

import java.util.Arrays;

public class BurrowsWheelerAlgorithm {

    /**
     * Rearranges letters of the string until last letter becomes first
     * @param string input string
     * @return array of transformed strings
     */
    public static String[] transformInputString(String string) {
        int stringLength = string.length();
        String[] result = new String[stringLength];
        result[0] = string;

        for (int i = 1; i < stringLength; i++) {
            result[i] = result[i - 1].substring(1) + result[i - 1].charAt(0);
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }

    /**
     * Sorts the array of strings using Insertion Sort
     * @param stringArray array of strings
     * @return sorted array of strings
     */
    public static String[] insertionSort(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            String element = stringArray[i];
            int location = i - 1;
            while (location >= 0 && stringArray[location].compareTo(element) > 0) {
                stringArray[location + 1] = stringArray[location];
                location--;
            }
            stringArray[location + 1] = element;
        }
//        System.out.println(Arrays.toString(stringArray));
        return stringArray;
    }

    /**
     * Gets the last char of each string and forms the string
     * @param stringArray array of strings
     * @return formed string
     */
    public static String getLastChars(String[] stringArray) {
        int arraySize = stringArray.length;
        String result = "";
        for (int i = 0; i < arraySize; i++) {
            result += stringArray[i].charAt(arraySize - 1);
        }
//        System.out.println(result);
        return result;
    }

}


