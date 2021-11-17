package labs_examples.objects_classes_methods.labs.methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int multiply = multiply(12, 6);
        System.out.println(multiply);
        System.out.println();

        int division = divide(45, 3);
        System.out.println(division);
        System.out.println();

        joke("What do you call a cowboy with no legs? A lowdown dirty bum");
        System.out.println();

        System.out.println(secondsInYears(1997));
        System.out.println();

        int varArgs1 = arrayLength(10, 15, 20, 30);
        int varArgs2 = arrayLength(10, 15, 20, 30, 35, 40);
        int varArgs3 = arrayLength(10, 15);
        int varArgs4 = arrayLength(10, 15, 20, 30, 70, 80, 90, 100);
        int varArgs5 = arrayLength(10, 15, 20, 30, 70, 80, 90, 100, 70, 80, 90, 100);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
        public static int multiply(int a, int b) {
            return a * b;
        }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
        public static int divide(int a, int b) {
            return a / b;
        }

    // 3) Create a static void method that will print of joke of your choice to the console
        public static void joke(String quip) {
            System.out.println(quip);
        }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
        public static long secondsInYears(int years) {
            // total number of seconds in a day equals hours times minutes times seconds
            int secondsPerDay = 24 * 60 * 60;
            //  multiply secondsPerDay by number of days in a standard year
            int secondsPerOrdinaryYear = 365 * secondsPerDay;
            //  add extra day's worth of seconds for a leap year
            int secondsPerLeapYear = secondsPerOrdinaryYear + secondsPerDay;

            if (!(years % 4 == 0)) {
                return secondsPerOrdinaryYear;
            } else {
                return secondsPerLeapYear;
            }
        }

    // 5) Create a varargs method that will return the length of the varargs array passed in
        public static int arrayLength(int... values) {
            int length = values.length;
            System.out.println("the length of the array passed in is: " + length);
            return length;
            }
}

