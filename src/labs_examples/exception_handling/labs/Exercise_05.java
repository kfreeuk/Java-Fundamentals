package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

       int [] testArray = {0, 1, 2, 3, 4, 5 };

        try {
            int a = divide(testArray[3], testArray[0]);
        } catch (ArithmeticException exc) {
            System.out.println("Cannot divide by 0");
        }
        System.out.println("Program finished");
    }

    public static int divide(int x, int y) throws ArithmeticException{
        return x / y;
    }

}