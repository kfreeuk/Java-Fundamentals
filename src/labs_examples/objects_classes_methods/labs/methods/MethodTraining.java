package labs_examples.objects_classes_methods.labs.methods;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class MethodTraining {

    public static void main(String[] args) {
        largestNumber(4, 137, 99, 50);

        consonantCounter("humungous");
        consonantCounter("hypochrondriac");
        System.out.println();

        isPrime(67867965);
        isPrime(79);
        System.out.println();

        int[] intArray = {97, 47, 7, 117, 27, 57, 17, 9997};
        highLowValues(intArray);

        returnIntArrayList(180, 9, 5);

        int[] numberArray = {1, 2, 3, 4, 5, 6,7, 8, 9};
        System.out.println("The original array is: " + numberArray);
        reverseArray(numberArray);
    }

    /* Create a method that will return the largest of 4 numbers (all of which are passed as arguments) */
    public static void largestNumber(int a, int b, int c, int d) {
        System.out.print("Of the numbers " + a + ", " + b + ", " + c + " and " + d + ",");
        if (a > b && a > c && a > d) {
            System.out.println(" the largest number is " + a);
        }
        if (b > a && b > c && b > d) {
            System.out.println(" the largest number is " + b);
        }
        if (c > a && c > b && c > d) {
            System.out.println(" the largest number is " + c);
        }
        if (d > a && d > b && d > c) {
            System.out.println(" the largest number is " + d);
        }
        System.out.println();
    }

    /* Write a method to count all consonants in a String */
    public static void consonantCounter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // Compare each character in word with the characters a, e, i, o, u
            // If no match, increment the count
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(" ");
            } else if (ch != ' ') {
                count++;
            }
        }
        System.out.println("the number of consonants in " + word + " is " + count);
    }


    /* Write a method to determine whether or not a number is prime */
    public static boolean isPrime(int number) {
        // Prime numbers cannot be 0, 1 or even numbers so for-loop starts at 2
        for (int i = 2; i * i <= number; i++) {
            // check that the number is even
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                return false;
            }
        }
        System.out.println(number + " is a prime number");
        return true;
    }

    /*Write a method that will return a small array containing the highest and lowest numbers
    in a given numeric array, which is passed in as an argument*/
    public static void highLowValues(int[] args) {
        int temp = 0;

        // Display elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        // Sort array in ascending order
        // outer loop selects an element
        for (int i = 0; i < args.length; i++) {
            // inner loop compares selected element with the rest of the elements
            for (int j = i + 1; j < args.length; j++) {
                if (args[i] > args[j]) {
                    temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
            System.out.println();
        }
        System.out.println("Array sorted in ascending order: ");
        for (int k = 0; k < args.length; k++) {
            System.out.print(args[k] + " ");

//                int [] sortedArray = args[i];
//                System.out.println(sortedArray[0]);
        }
        System.out.println();
        System.out.println();
        // select first and last numbers in sorted array, save to new array and print to screen
//        System.out.println("The lowest number is " + args[0] + " and the highest number is " + args[args.length - 1]);

        System.out.println("The lowest and highest numbers are: ");
        System.out.println(args[0] + ", " + args[args.length - 1]);
        System.out.println();
    }

    /* Write a method that takes three arguments and returns an Integer Arraylist. */
    /*In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    length of the returned list*/

    public static void returnIntArrayList(int maxNum,int divisor1, int divisor2) {

        // Declare ArrayList outside for loop
         ArrayList<Integer> intArrayList = new ArrayList<>();

//            use for loop to populate ArrayList with numbers between 0 and 29 and print out result
//            for(int i = 0; i < 30; i++) {
//            intArrayList.add(i);
//            System.out.print(i + " ");
//        }
//        System.out.println();

        for (int i = 1; i < maxNum; i++) {
            // check whether i is divisible by divisor1 and divisor2
            if ((i % divisor1 == 0) && (i % divisor2 == 0)) {
            // assign i to new variable 'result'
                int result = i;
        //  populate intArrayList with numbers that are wholly divisible by divisor1 and divisor2 only
                intArrayList.add(result);
                System.out.print(i + " ");
        //  continue for loop until maxNum is reached
                i++;
            }
        }
        System.out.println();

        System.out.println("The length of the returned list is " + intArrayList.size() + " items");
        System.out.println();
    }

        /* Write a method that will reverse an array in place using only one temporary variable
        * and without instantiating a second array */

        public static void reverseArray(int [] array) {

            //  loop through the first half of the array
            for (int i = 0; i < array.length / 2; i++) {
            //  assign first element of array to variable called temp
                int temp = array[i];
            //  assign the last element of the array to the first element
                array[i] = array[array.length - i - 1];
            //  assign temp to the last element of the array
                array[array.length - i - 1] = temp;
            //  repeat the above steps to the half way point of the array by which
            //  time elements at opposite ends of the array have been swapped
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
}




