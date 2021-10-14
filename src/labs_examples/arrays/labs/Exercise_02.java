package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("The index of your number is " + i);
            }
        }
    }
}