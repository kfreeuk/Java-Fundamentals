package labs_examples.objects_classes_methods.labs.objects;

public class ObjectsLabs {

    public static void main(String[] args) {

        Airline myAirline = new Airline("BA", true);
        Country country = new Country("UK");
        Age age = new Age(25, false);
        Passengers passengers = new Passengers(340);
        Airplane myAirplane = new Airplane(myAirline, country, age, passengers);

        System.out.println("This airplane is owned by " + myAirplane.getAirline().getAirline() + " which is based in " +
                "the " + myAirplane.getCountry().getCountry() + ". The craft is " + myAirplane.getAge().getAge() + " " +
                "years old and carries " + myAirplane.getPassengers().getPassengers() + " passengers.");

        myAirplane.fuelCapacity = 500000.57;
        myAirplane.currentFuelLevel = 48750.33;

        System.out.println("This airplane's fuel capacity is " + myAirplane.getFuelCapacity() + " gallons");

        System.out.println(myAirline.toString());
        System.out.println(country.toString());
        System.out.println(age.toString());
        System.out.println(passengers.toString());
        System.out.println(myAirplane.toString());
    }
}