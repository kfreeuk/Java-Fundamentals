package labs_examples.exception_handling.labs;

/*Exercise_07.java - Create Custom Exception*/

import java.util.Scanner;

public class ExceptionSeven {
    public static void main(String[] args) {
        try {
            testMethod();
        } catch (OverweightException e) {
            System.out.println(e.toString());
        }
    }
    public static void testMethod() throws OverweightException {
        anotherTestMethod();
    }

    public static void anotherTestMethod() throws OverweightException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Does the item weight more than 100 tonnes? Yes or No");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Yes")) {
            throw new OverweightException();
        }
        System.out.println("Program ended");
    }


}
