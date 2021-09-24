package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        float radius = 3.14f;
        int height = 5;
        float pi = 3.14f;

        float volume = pi * (radius * radius) * height;
        System.out.println("The volume of the cylinder is " + volume + ".");

        float surfaceArea = (2 * pi * radius) * (height + radius);
        System.out.println("The surface area of the cylinder is " + surfaceArea + ".");
    }
}