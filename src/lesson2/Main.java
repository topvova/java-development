package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printFibonacciSequence(50);

        int[] userInput = getUserNumbers();
        System.out.println(Arrays.toString(userInput));
        System.out.println(Arrays.toString(selectionSort(userInput)));

        printPrimeNumbers(userInput);
        printDividedByPrevious(userInput);
    }

    public static void printFibonacciSequence(int count) {
        long prev = 1L, next = 1L, result;
        String output = prev + " " + next + " ";

        for (int i = 2; i < count; i++) {
            result = prev + next;
            prev = next;
            next = result;

            output += result + " ";
        }

        System.out.print(output + "\n");
    }

    private static int[] getUserNumbers() {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        int i = 0;

        do {
            System.out.println("Enter a number, please:");
            int current = input.nextInt();

            if (getDigitCount(current) == 5) {
                nums[i] = current;
            } else {
                System.out.println("Number must have 5 digits!");
                continue;
            }

            i++;

        } while (i < nums.length);

        return nums;
    }

    private static int getDigitCount(int number) {
        final int sizeTable[] = {9, 99, 999, 9999, 99999, 999999,
                9999999, 99999999, 999999999, Integer.MAX_VALUE};
        int i = 0;

        while (number > sizeTable[i]) {
            i++;
        }

        return ++i;
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    private static void printPrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;

            for (int j = 0; j < i; j++) {

                if (arr[i] % arr[j] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void printDividedByPrevious(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDivided = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] % arr[j] == 0) {
                    isDivided = true;
                    break;
                }
            }

            if (isDivided) {
                System.out.println(arr[i] + " ");
            }
        }
    }

}
