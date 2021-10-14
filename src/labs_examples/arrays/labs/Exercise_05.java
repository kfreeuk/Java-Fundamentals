package labs_examples.arrays.labs;
import java.util.Arrays;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        String [] phoneticAlphabet = { "alpha", "bravo", "charlie", "delta", "epsilon", "foxtrot", "gamma", "hotel",
                "india", "juliet", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra",
                "tango", "uniform", "victor", "whisky", "xray", "yankee", "zebra"} ;


        for (int i = phoneticAlphabet.length - 1; i >=0; i-=2) {
            System.out.print(phoneticAlphabet[i] + ", ");
    }
    }

}
