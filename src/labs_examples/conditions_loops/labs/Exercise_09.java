package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for(int i = 15; i > 0; i--) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
