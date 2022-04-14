package labs_examples.exception_handling.labs;

/*Exercise_03.java - Try-Catch-Finally*/
public class ExceptionThree {

    public static void exceptionHandlerThree(String [] names) {
        try {
            String name = names[7];
        } catch (ArrayIndexOutOfBoundsException arrIndexExc) {
            System.out.println("This is not a day of the week");
            System.out.println("Error caught");
        } finally {
            System.out.println("This prints every time");
        }
        System.out.println("Program complete");
    }
}
