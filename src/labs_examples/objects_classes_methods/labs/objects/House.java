package labs_examples.objects_classes_methods.labs.objects;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class House {

   String type;
   String storeys;
   Boolean isDetached;
   Boolean hasGarage;

    public House() {}

    public House(String type, String storeys, Boolean isDetached, Boolean hasGarage){
        this.type = type;
        this.storeys = storeys;
        this.isDetached = isDetached;
        this.hasGarage = hasGarage;
    }

    public House(String storeys, Boolean isDetached) {
        this.storeys = storeys;
        this.isDetached = isDetached;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStoreys() {
        return storeys;
    }

    public void setStoreys(String storeys) {
        this.storeys = storeys;
    }

    public Boolean getDetached() {
        return isDetached;
    }

    public void setDetached(Boolean detached) {
        isDetached = detached;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", storeys='" + storeys + '\'' +
                ", isDetached=" + isDetached +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
