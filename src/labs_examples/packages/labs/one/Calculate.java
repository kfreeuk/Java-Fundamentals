package labs_examples.packages.labs.one;

/*import package two into package one*/
import labs_examples.packages.labs.two.Hours;

/*Create two classes, one of which is protected*/
 class Calculate {
    public int multiply(int a, int b){
        return a*b;
    }

   protected int addition(int x, int y, int z) {
         return x + y + z;
   }

    public static void main(String[] args) {
        /*Create new Calculate object*/
        Calculate testMultiply = new Calculate();
        /*Implement multiply method on Calculate object*/
        int exampleMultiply = testMultiply.multiply(3, 6);
        System.out.println(exampleMultiply);
        /*Implement addition method on Calculate object*/
        int exampleAddition = testMultiply.addition(4, 5, 6);
        System.out.println(exampleAddition);


        /*After importing package two, create new Hours object*/
        Hours obj = new Hours();
        double payRate = obj.pay(12.75, 5);
        System.out.println("This job pays £" + payRate);
        /*isDoubleTime cannot be accessed in this class as it is
        a protected method from package two*/
//        obj.isDoubleTime();

    }
}
