package pl.pingvit.homework20;
import pl.pingvit.homework11.task1.Cat;
import pl.pingvit.homework11.task1.Owner;
import pl.pingvit.homework11.task1.Parrot;
import pl.pingvit.homework11.task1.Pet;

import java.math.BigDecimal;
import java.util.Arrays;
public class PetGenericMain {
    public static void main(String[] args) {
        PetGeneric<Pet> petGeneric = new PetGeneric<>(new Pet[]{
                new Cat("Myrzik", 2L, new Owner("vadim", "savelev", "1213412", "sdfsf@mail.com"), "visloyhiy", new BigDecimal(23)),
                new Parrot("Chik-Chirik", 4l, new Owner("Aleksandr", "Aleksandrov", "2345678", "aleks@mail.ru"), "red", 5.7)});
        System.out.println(Arrays.toString(petGeneric.getPets()));
    }
}
