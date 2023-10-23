package pl.pingvit.homework11.task1;
public class Parrot extends Pet {
    private final String color;
    private final Double wingLength;
    public Parrot(String petName, Long id, Owner owner, String color, Double wingLength) {
        super(petName, id, owner);
        this.color = color;
        this.wingLength = wingLength;
    }
    public String getColor() {
        return color;
    }
    public Double getWingLength() {
        return wingLength;
    }
    public void PrintInfoAboutParrot() {
        System.out.printf("This is parrot is color - %s,is fly %s", color, wingLength);
    }
}
