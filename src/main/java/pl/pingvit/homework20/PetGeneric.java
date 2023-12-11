package pl.pingvit.homework20;
import pl.pingvit.homework11.task1.Pet;

import java.util.Arrays;
public class PetGeneric<T extends Pet> {
    private T[] pets;
    public PetGeneric(T[] pets) {
        this.pets = pets;
    }
    public T[] getPets() {
        return pets;
    }
    @Override
    public String toString() {
        return "PetGeneric{" +
                "pets=" + Arrays.toString(pets) +
                '}';
    }
}
