package pl.pingvit.homework7;
public class House {
    private static final String HOUSE_TYPE_INDIVIDUAL = "Индивидуальный";
    private static final String HOUSE_TYPE_APARTMENT = "Многоэтажка";

    private String type;
    private int numberOfFloors;
    private int numberOfResidents;
    private boolean isTheHeatingOn;

    public House() {
    }
    public House(String type, int numberOfFloors, int numberOfResidents, boolean isTheHeatingOn) {
        if (type.equalsIgnoreCase(HOUSE_TYPE_INDIVIDUAL) || type.equalsIgnoreCase(HOUSE_TYPE_APARTMENT)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Недопустимый тип дома");
        }
        this.numberOfFloors = numberOfFloors;
        this.numberOfResidents = numberOfResidents;
        this.isTheHeatingOn = isTheHeatingOn;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
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