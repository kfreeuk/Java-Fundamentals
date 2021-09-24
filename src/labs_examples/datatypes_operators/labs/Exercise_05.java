package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        if (a & b){
            System.out.println("this is false as a is true and b is false");
        }
        if (a && b){
            System.out.println("this is false as a is true but b is false");
        }
        if (a || b){
            System.out.println("this is true as only a or b is true");
        }
        if (a ^ b){
            System.out.println("this is true as either a or b can be true but not at the same time");
        }
        if (!a == b){
            System.out.println("this is true as a does not equal b");
        }
    }

}

