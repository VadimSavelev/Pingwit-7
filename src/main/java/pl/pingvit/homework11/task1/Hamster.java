package pl.pingvit.homework11.task1;
public class Hamster extends Pet {
    private final double cheekVolume;
    private final int age;
    public Hamster(String petMame, Long id, Owner owner, double cheekVolume, int age) {
        super(petMame, id, owner);
        this.cheekVolume = cheekVolume;
        this.age = age;
    }
    public double getCheekVolume() {
        return cheekVolume;
    }
    public int getAge() {
        return age;
    }
    public void PrintInfoAboutCat() {
        System.out.printf("This is hamster have cheek volume = %s,age= %s", cheekVolume, age);
    }
}
