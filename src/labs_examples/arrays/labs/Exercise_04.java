package labs_examples.arrays.labs;
import java.util.Arrays;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        String [] [] irregArray = {
                {"apple", "pear"},
                {"peach", "mango", "melon"},
                {"avocado", "tomato", "kumquat"}
        };
        for(String [] outer : irregArray) {
            for(String fruit : outer) {
                System.out.print(fruit + ", ");
            }
            System.out.println();
        }
    }

}
