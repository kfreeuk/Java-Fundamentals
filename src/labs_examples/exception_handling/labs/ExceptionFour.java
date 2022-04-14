package labs_examples.exception_handling.labs;

/*Exercise_04.java - Nested Try-Catch*/

public class ExceptionFour {
    public static void nestedTry(int[] numItems) {
        try {
            int x = numItems[10];
        } catch (ArrayIndexOutOfBoundsException aiobExc) {
            System.out.println("This number is not part of the array");
        }
        try {
            int x = numItems[2] / numItems[3];
        } catch (ArithmeticException aeExc) {
            System.out.println("Division by zero is not permitted");
        }
        System.out.println("Program complete");
    }


}





