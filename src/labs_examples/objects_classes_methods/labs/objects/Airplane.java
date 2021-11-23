package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    double fuelCapacity;

    double currentFuelLevel;

    Airline airline;

    Country country;

    Age age;

    Passengers passengers;

    public Airplane(Airline airline, Country country, Age age, Passengers passengers) {

        this.airline = airline;

        this.country = country;

        this.age = age;

        this.passengers = passengers;

    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", airline=" + airline +
                ", country=" + country +
                ", age=" + age +
                ", passengers=" + passengers +
                '}';
    }
}