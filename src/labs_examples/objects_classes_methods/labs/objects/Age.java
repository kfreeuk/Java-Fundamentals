package labs_examples.objects_classes_methods.labs.objects;

public class Age {

    private int age;
    private boolean isNew = true;

    public Age(int age, boolean isNew) {

        this.age = age;
        this.isNew = isNew;

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                ", isNew=" + isNew +
                '}';
    }
}
