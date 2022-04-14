package labs_examples.exception_handling.labs;

/*Exercise_01.java - Simple Try-Catch*/
/*Catch ArrayIndexOutOfBoundsException*/

public class ExceptionOne {

        public static void exceptionHandlerOne(String [] names) {
            try {
                String name = names[6];
                /*Will throw an ArrayIndexOutOfBoundsException*/
                /*String name = names[3];*/
                /*No exception so output will be "Program complete"*/
            } catch (ArrayIndexOutOfBoundsException arrIndexExc) {
                System.out.println("This name is not in the list");
                System.out.println("Error caught");
            }
            System.out.println("Program complete");
        }
    }

