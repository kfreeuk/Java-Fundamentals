package labs_examples.objects_classes_methods.labs.methods;

/**
 * Create a recursive method named factorial that will return the factorial of any number passed to it.
 *
 * For instance, after creating the factorial method, uncomment the two lines in the main() method. When you run
 * it, it should print 120. It should also work for any other number you pass it.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
        int x = recursiveFactorial(5);
        System.out.println(x);
        x = recursiveFactorial(3);
        System.out.println(x);
        x = recursiveFactorial(1);
        System.out.println(x);
    }

    public static int recursiveFactorial(int number) {
        // base case
        if (number == 1) {
            return 1;
        } else {
            return (number * recursiveFactorial(number - 1));
        }
    }
}

