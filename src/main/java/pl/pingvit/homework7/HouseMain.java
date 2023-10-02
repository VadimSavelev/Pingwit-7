package pl.pingvit.homework7;
import java.lang.reflect.Type;
public class HouseMain {
    public static void main(String[] args) {
        House[] houses = new House[5];
        houses[0] = new House("Индивидуальный", 1, 5, true);
        houses[1] = new House("Многоэтажка", 6, 60, false);
        houses[2] = new House("Индивидуальный", 1, 10, false);
        houses[3] = new House("Многоэтажка", 9, 90, true);
        houses[4] = new House("Многоэтажка", 11, 110, false);

        int totalResidentsInMultiStoryHouses = House.countingResidentsOfMultiStoreyBuildings(houses);
        System.out.println("Общее количество жителей в многоэтажных домах: " + totalResidentsInMultiStoryHouses);

        House.printInformationAboutIndividualHouses(houses);

        House.turnOnTheHeating(houses);
    }
}