package pl.pingvit.homework7;
import java.util.Arrays;
public class House {
    private HouseType type;
    private int numberOfFloors;
    private int numberOfResidents;
    private boolean isTheHeatingOn;
    public House() {
    }
    public House(HouseType type, int numberOfFloors, int numberOfResidents, boolean isTheHeatingOn) {
        this.type = type;
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
        this.isTheHeatingOn = isTheHeatingOn;
    }
    public HouseType getType() {
        return type;
    }
    public void setType(HouseType type) {
        this.type = type;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public int getNumberOfResidents() {
        return numberOfResidents;
    }
    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }
    public boolean isTheHeatingOn() {
        return isTheHeatingOn;
    }
    public void setTheHeatingOn(boolean theHeatingOn) {
        isTheHeatingOn = theHeatingOn;
    }
    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfResidents=" + numberOfResidents +
                ", isTheHeatingOn=" + isTheHeatingOn +
                '}';
    }
}