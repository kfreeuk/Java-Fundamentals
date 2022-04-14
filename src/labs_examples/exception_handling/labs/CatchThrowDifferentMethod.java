package labs_examples.exception_handling.labs;

/*Exercise_06.java - Throw exception in one method and catch it in a different method*/

public class CatchThrowDifferentMethod {

    public static void main(String[] args) {

        try {
            ExceptionSix.firstMethod();
        } catch (ArrayIndexOutOfBoundsException arrIndexExc) {
            System.out.println("Exception caught");
        }
    }
}