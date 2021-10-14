package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayLists
 * <p>
 * Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 * Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 * typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 * shows a list of methods.
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(60);
        nums.add(70);
        nums.add(80);
        nums.add(90);

        // Print out array
        if (!nums.isEmpty()) {
            for (int single : nums) {
                System.out.print(single + " ");
            }
            System.out.println();

            // Access the third item in the array
            System.out.println();
            System.out.println(nums.get(2));

            // Add the number 100 to the end of the array and print out amended array
            System.out.println();
            nums.add(100);
            if (!nums.isEmpty()) {
                for (int single : nums) {
                    System.out.print(single + " ");
                }
                System.out.println();

                // Check the size of the array
                System.out.println();
                System.out.println(nums.size());
            }
            System.out.println();

            // Remove an element from the array and print out amended array
            nums.remove(5);
            for (int single : nums) {
                System.out.print(single + " ");
            }
            System.out.println();

        }
    }
}