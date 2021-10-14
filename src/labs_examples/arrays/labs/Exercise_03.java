package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */
import java.util.Arrays;

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] threeTimesTable = new int[5][5];
        int multiples = 1;

        for (int i = 0; i < threeTimesTable.length; i++) {
            for (int x = 0; x < threeTimesTable[i].length; x++) {
                threeTimesTable[i][x] = multiples * 3;
                multiples++;
                System.out.print(threeTimesTable[i][x] + " ");
            }
            System.out.println();
        }
        }
    }



