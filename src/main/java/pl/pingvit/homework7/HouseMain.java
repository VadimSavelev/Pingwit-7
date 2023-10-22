package pl.pingvit.homework7;

import java.lang.reflect.Type;

public class HouseMain {
    public static void main(String[] args) {
        House[] houses = new House[5];
        houses[0] = new House(HouseType.INDIVIDUAL, 1, 5, true);
        houses[1] = new House(HouseType.APARTMENT, 6, 60, false);
        houses[2] = new House(HouseType.INDIVIDUAL, 1, 10, false);
        houses[3] = new House(HouseType.APARTMENT, 9, 90, true);
        houses[4] = new House(HouseType.APARTMENT, 11, 110, false);

        HouseStatisticsService houseStatisticsService=new HouseStatisticsService();
        int totalResidentsInMultiStoryHouses = houseStatisticsService.countingResidentsOfMultiStoreyBuildings(houses);
        System.out.println("Общее количество жителей в многоэтажных домах: " + totalResidentsInMultiStoryHouses);

        houseStatisticsService.printInformationAboutIndividualHouses(houses);

        houseStatisticsService.turnOnTheHeating(houses);
    }
}