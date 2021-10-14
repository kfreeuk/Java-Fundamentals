package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int number3 = scanner.nextInt();
        System.out.println("Enter a fourth number: ");
        int number4 = scanner.nextInt();
        System.out.println("Enter a fifth number: ");
        int number5 = scanner.nextInt();
        System.out.println("Enter a sixth number: ");
        int number6 = scanner.nextInt();
        System.out.println("Enter a seventh number: ");
        int number7 = scanner.nextInt();
        System.out.println("Enter an eighth number: ");
        int number8 = scanner.nextInt();
        System.out.println("Enter a ninth number: ");
        int number9 = scanner.nextInt();
        System.out.println("Enter a tenth number: ");
        int number10 = scanner.nextInt();

        int [] userNumber = {number, number2, number3, number4, number5, number6, number7, number8, number9, number10};

        int sum = 0;

        for (int user : userNumber) {
            sum += user;
        }
        System.out.println(sum);

        int average = sum / userNumber.length;
        System.out.println(average);
    }

}