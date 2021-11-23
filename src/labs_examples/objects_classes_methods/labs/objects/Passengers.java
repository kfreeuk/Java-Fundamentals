package labs_examples.objects_classes_methods.labs.objects;

public class Passengers {

    private int passengers;

    public Passengers(int passengers) {

        this.passengers = passengers;

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passengers=" + passengers +
                '}';
    }
}