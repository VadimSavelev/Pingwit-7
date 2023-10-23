package pl.pingvit.homework11.task1;
public class Dog extends Pet {
    private final Double tailLength;
    private final String tongueColor;
    public Dog(String petName, Long id, Owner owner, Double tailLength, String tongueColor) {
        super(petName, id, owner);
        this.tailLength = tailLength;
        this.tongueColor = tongueColor;
    }
    public double getTailLength() {
        return tailLength;
    }
    public String isTongueColor() {
        return tongueColor;
    }
    public void PrintInfoAboutDog() {
        System.out.printf("This is dog have tail length = %s,nose is wet- %s", tailLength, tongueColor);
    }
}
