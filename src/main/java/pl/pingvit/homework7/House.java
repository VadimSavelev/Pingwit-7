package pl.pingvit.homework7;

import java.util.Arrays;

public class House {
    private static final String HOUSE_TYPE_INDIVIDUAL = "Индивидуальный";
    private static final String HOUSE_TYPE_APARTMENT = "Многоэтажка";

    //private String type;

    private HouseType type;
    private int numberOfFloors;
    private int numberOfResidents;
    private boolean isTheHeatingOn;
    static int sumOfResidentsOfHighRiseBuildings = 0;

    public House() {
    }

    public House(HouseType type, int numberOfFloors, int numberOfResidents, boolean isTheHeatingOn) {
        /*
        если использовать enum -  такая проверка становится не нужна
        if (type.equalsIgnoreCase(HOUSE_TYPE_INDIVIDUAL) || type.equalsIgnoreCase(HOUSE_TYPE_APARTMENT)) {
            this.type = type;
        } else {
            throw new IllegalArgumentException("Недопустимый тип дома");
        }*/
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

    public static int countingResidentsOfMultiStoreyBuildings(House[] houses) {
        // плиз, создай отдельный класс, к примеру HouseStatisticsService, и вынеси в него этот метод.
        // + сделай плиз этот метод нестатическим. пока что делаем все методы нестатическими
        for (House house : houses) {
            //if (HOUSE_TYPE_APARTMENT.equals(house.getType())) {
            if (HouseType.APARTMENT.equals(house.getType())) {
                sumOfResidentsOfHighRiseBuildings += house.getNumberOfResidents();
            }
        }
        return sumOfResidentsOfHighRiseBuildings;
    }

    public static void printInformationAboutIndividualHouses(House[] houses) {
        // плиз, создай отдельный класс, к примеру HouseStatisticsService, и вынеси в него этот метод.
        // + сделай плиз этот метод нестатическим. пока что делаем все методы нестатическими
        System.out.println("individual houses :");
        for (House house : houses) {

            //if (HOUSE_TYPE_INDIVIDUAL.equals(house.getType())) {
            if (HouseType.INDIVIDUAL.equals(house.getType())) {
                System.out.println(house.toString());
            }
        }
    }

    public static void turnOnTheHeating(House[] houses) {
        // плиз, создай отдельный класс, к примеру HouseStatisticsService, и вынеси в него этот метод.
        // + сделай плиз этот метод нестатическим. пока что делаем все методы нестатическими
        for (House house : houses) {

            if (house.getNumberOfFloors() > 5) {
                if (!house.isTheHeatingOn()) {
                    house.setTheHeatingOn(true);
                    System.out.println("включили отопление в домах : " + house.toString());
                }
            }
        }
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