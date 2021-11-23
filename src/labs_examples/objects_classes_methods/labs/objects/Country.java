package labs_examples.objects_classes_methods.labs.objects;

public class Country {

    private String country;

    public Country(String country){

        this.country = country;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                '}';
    }
}
