package labs_examples.fundamentals.labs;


import java.sql.SQLOutput;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str
        int stringLength = str.length();
        System.out.println(stringLength);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equals = str.equals(str2);
        System.out.println(equals);

        // please concatenate str & str2 and set the result to a new String variable below
        String combinedStrings = (str + " " + str2);
        System.out.println(combinedStrings);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int findLetter = str2.indexOf("o");
        System.out.println(findLetter);

        String substituteLetter = str2.replace("h","j");
        System.out.println(substituteLetter);

        System.out.println(str.contains("ell"));

        System.out.println(str2.contains("!"));

    }


}