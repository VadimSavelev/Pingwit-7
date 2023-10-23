package pl.pingvit.homework11.task1;
import java.math.BigDecimal;
public class Cat extends Pet {
    private final String breed;
    private final BigDecimal weight;
    public Cat(String petMame, Long id, Owner owner, String breed, BigDecimal weight) {
        super(petMame, id, owner);
        this.breed = breed;
        this.weight = weight;
    }
    public String getBreed() {
        return breed;
    }
    public BigDecimal getWeight() {
        return weight;
    }
    public void PrintInfoAboutCat() {
        System.out.printf("This is cat breed - %s,weight= %s", breed, weight);
    }
}
