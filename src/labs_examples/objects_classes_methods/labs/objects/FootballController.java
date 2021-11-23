package labs_examples.objects_classes_methods.labs.objects;

public class FootballController {

    public static void main(String[] args) {
        Team f = new Team("Aston Villa");
        League l = new League("Premier");

        System.out.println(f.getName() + " is in the " + l.getDivision() + " division" );
    }
}
