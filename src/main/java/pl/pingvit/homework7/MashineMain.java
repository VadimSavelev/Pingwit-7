package pl.pingvit.homework7;

import static pl.pingvit.homework7.Mashine.FIRST_DOOR;

public class MashineMain {
    public static void main(String[] args) {
        Mashine mashine1 = new Mashine("Audi", "a6", 4);
        Mashine mashine2 = new Mashine("BMW", "X3", 4);
        Mashine mashine3 = new Mashine("Volkswagen", "golf", 2);
        Mashine mashine4 = new Mashine("ford", "Mustang", 2);

        Mashine[] mashines = {mashine1, mashine2, mashine3, mashine4};
        for (Mashine mashine : mashines) {
            System.out.println(mashine.toString());
        }
        for (Mashine mashine : mashines) {
            if (mashine.getMake().equals("Audi")) {
                System.out.println(mashine);
                for (int i = 1; i <= mashine.getNumberOfDoors(); i++) {
                    System.out.println("Door " + i + " opened!");
                }
            }
        }
    }
}