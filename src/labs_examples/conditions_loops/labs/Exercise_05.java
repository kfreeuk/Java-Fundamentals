package labs_examples.conditions_loops.labs;


import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 100: ");
        int numberOne = scanner.nextInt();

        System.out.println("Please enter another number between 1 and 100 that is larger than the previous number: ");
        int numberTwo = scanner.nextInt();

        int sumOfNumbers = 0;
        double loopCount = numberTwo;


        for(int i = 1; i <= numberTwo; i++) {
            if(i > numberTwo) {
                break;
            }
            sumOfNumbers = sumOfNumbers + i;
        }
        double average = sumOfNumbers / loopCount;

        System.out.println("The sum is: " + sumOfNumbers);
        System.out.println("The average is: " + average);

        }
    }

