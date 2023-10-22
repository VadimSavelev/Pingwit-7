package pl.pingvit.homework7;
public class HouseStatisticsService {
    static int sumOfResidentsOfHighRiseBuildings = 0;
    public int countingResidentsOfMultiStoreyBuildings(House[] houses) {
        for (House house : houses) {
            //if (HOUSE_TYPE_APARTMENT.equals(house.getType())) {
            if (HouseType.APARTMENT.equals(house.getType())) {
                sumOfResidentsOfHighRiseBuildings += house.getNumberOfResidents();
            }
        }
        return sumOfResidentsOfHighRiseBuildings;
    }
    public void printInformationAboutIndividualHouses(House[] houses) {
        System.out.println("individual houses :");
        for (House house : houses) {
            //if (HOUSE_TYPE_INDIVIDUAL.equals(house.getType())) {
            if (HouseType.INDIVIDUAL.equals(house.getType())) {
                System.out.println(house.toString());
            }
        }
    }
    public void turnOnTheHeating(House[] houses) {
        for (House house : houses) {
            if (house.getNumberOfFloors() > 5) {
                if (!house.isTheHeatingOn()) {
                    house.setTheHeatingOn(true);
                    System.out.println("включили отопление в домах : " + house.toString());
                }
            }
        }
    }
}
