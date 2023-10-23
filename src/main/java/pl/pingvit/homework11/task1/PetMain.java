package pl.pingvit.homework11.task1;
import java.math.BigDecimal;
public class PetMain {
    public static void main(String[] args) {
        Owner owner1 = new Owner("vadim", "savelev", "1213412", "sdfsf@mail.com");
        Owner owner2 = new Owner("maks", "Ivanov", "3463434", "ivanov@gmail.com");
        Owner owner3 = new Owner("Aleksandr", "Aleksandrov", "2345678", "aleks@mail.ru");
        Owner owner4 = new Owner("roman", "romov", "1212122", "romov@gmail.com");

        Cat cat = new Cat("Myrzik", 2L, owner1, "visloyhiy", new BigDecimal(23));
        Dog dog = new Dog("Tyzik", 3L, owner2, 7.5, "black");
        Parrot parrot = new Parrot("Chik-Chirik", 4l, owner3, "red", 5.7);
        Hamster hamster = new Hamster("bory", 5L, owner4, 6.4, 2);

        Pet[] pets = {cat, dog, parrot, hamster};
        for (Pet pet : pets) {
            System.out.println(pet.AllInformationAboutPet());
        }
    }
}

