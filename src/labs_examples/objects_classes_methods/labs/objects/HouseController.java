package labs_examples.objects_classes_methods.labs.objects;

public class HouseController {

    public static void main(String[] args) {
        House firstHouse = new House();
        House secondHouse = new House("detached", "two", true, true);
        House thirdHouse = new House("one", false);

//        System.out.println("The second house is " + secondHouse.getType() + " and has " + secondHouse.getStoreys() +
//                " storeys");
//        System.out.println("The third house has " + thirdHouse.getStoreys() + " storey");

        System.out.println("The first house is " + firstHouse);
        System.out.println("The second house is " + secondHouse.type + " and has " + secondHouse.storeys + " storeys" );
        System.out.println("The third house has " + thirdHouse.storeys + " storey");
    }
}
