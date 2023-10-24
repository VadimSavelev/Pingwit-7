package pl.pingvit.homework11.task1;
public class Pet {
    private final String name;
    private final Long id;
    private final Owner owner;
    public Pet(String name, Long id, Owner owner) {
        this.name = name;
        this.id = id;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
    public Long getId() {
        return id;
    }
    public Owner getOwner() {
        return owner;
    }
    public final String allInformationAboutPet() {
        return String.format("Pet %s is %s %s.Info about owner: %s,%s",
                name,
                owner.name(),
                owner.surname(),
                owner.phoneNumber(),
                owner.email());
    }
    @Override
    public String toString() {
        return "Pet{" +
                "petMame='" + name + '\'' +
                ", id=" + id +
                ", owner=" + owner +
                '}';
    }
}
