package pl.pingvit.homework7;
public class MashineMain {
    public static void main(String[] args) {
        Mashine mashine1 = new Mashine("Audi", "a6", 4);
        Mashine mashine2 = new Mashine("BMW", "X3", 4);
        Mashine mashine3 = new Mashine("Volkswagen", "golf", 2);
        Mashine mashine4 = new Mashine("ford", "Mustang", 2);

        Mashine[] mashines = {mashine1, mashine2, mashine3, mashine4};
        for (Mashine mashine : mashines) {
            System.out.println(mashine.toString());
            mashine.openingDoors(mashine.getNumberOfDoors());
        }
    }
}