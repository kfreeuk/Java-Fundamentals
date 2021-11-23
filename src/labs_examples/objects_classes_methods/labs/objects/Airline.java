package labs_examples.objects_classes_methods.labs.objects;

public class Airline {

        private String airline;
        private boolean isInternational;

        public Airline(String airline, boolean isInternational){

            this.airline = airline;

        }


    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "airline='" + airline + '\'' +
                ", isInternational=" + isInternational +
                '}';
    }
}
