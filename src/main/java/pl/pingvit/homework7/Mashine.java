package pl.pingvit.homework7;
public class Mashine {
    public static final int FIRST_DOOR = 1;
    private String make;
    private String model;
    private int numberOfDoors;
    public Mashine() {
    }
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
    public void openingDoors(int numberOfDoors) {
        for (int i = FIRST_DOOR; i <= numberOfDoors; i++) {
            System.out.println("Door " + i + " opened!");
        }
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
