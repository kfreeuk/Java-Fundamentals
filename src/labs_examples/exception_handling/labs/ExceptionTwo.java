package labs_examples.exception_handling.labs;

/*Exercise_02.java - Try-Catch with multiple catches*/

public class ExceptionTwo {

            public static void exceptionHandlerTwo(int [] scores) {
            try {
                int x = scores[1] / scores[3];

            } catch (ArrayIndexOutOfBoundsException arrIndexExc) {
                System.out.println("This falls outside of the maximum number of scores");
            } catch (ArithmeticException aeExc) {
                System.out.println("Division by zero not allowed");
            } catch (Exception exc) {
                System.out.println("ERROR!");
            }
            System.out.println("Program complete");
        }
    }

