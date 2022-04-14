package labs_examples.exception_handling.labs;

/*Exercise_06.java - Throw exception in one method and catch it in a different method*/

public class ExceptionSix {

    public static void firstMethod() throws ArrayIndexOutOfBoundsException {
        /*catch exception thrown from secondMethod*/
        /*pass exception up to main method to be handled*/
        secondMethod();
    }


    public static void secondMethod() throws ArrayIndexOutOfBoundsException {
        String[] girlsNames = {"Jillian", "Heather", "SarahBeth", "Adriene", "Kassandra"};

        try {
            String name = girlsNames[6];
            /*Will throw an ArrayIndexOutOfBoundsException*/
        } catch (ArrayIndexOutOfBoundsException arrIndexExc) {
            System.out.println("Exception caught in secondMethod");
            System.out.println("Throw exception back to firstMethod");
            /*throw exception to firstMethod()*/
            throw arrIndexExc;
        }
        System.out.println("Program complete");
    }
}