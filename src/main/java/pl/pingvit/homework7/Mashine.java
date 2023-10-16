package pl.pingvit.homework7;

public class Mashine {  //
    static final int FIRST_DOOR = 1;
    private String make;  // make - это глагол, он не очень подходит для имени поля. варианты - maker, producer, brand
    private String model;
    private int numberOfDoors;

    public Mashine(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Mashine{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
