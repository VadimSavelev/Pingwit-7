package pl.pingvit.homework6;

public class Parking {
    public static void main(String[] args) {
        Person person1 = new Person("Vadim", "Savelev", "442223344", "savelev@gmail.com");
        Person person2 = new Person("Maksim", "Davidov", "443334455", "davidov@gmail.com");
        Person person3 = new Person("Masha", "Danilova", "444445566", "danilova@gmail.com");
        Person person4 = new Person("Genadiy", "Osipov", "4455556677", "osipov@gmail.com");
        Person person5 = new Person("Foma", "Rezhikov", "446667788", "rezhikov@gmail.com");

        Car car1 = new Car("VS 7777", person1);
        Car car2 = new Car("MD 7776", person2);
        Car car3 = new Car("MD 7775", person3);
        Car car4 = new Car("GO 7774", person4);
        Car car5 = new Car("FR 7773", person5);

        Car[] cars = {car1, car2, car3, car4, car5};
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}