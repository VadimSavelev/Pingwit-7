package pl.pingvit.homework11.task1;
public class Pet {
    private final String petName;
    private final Long id;
    private final Owner owner;
    public Pet(String petName, Long id, Owner owner) {
        this.petName = petName;
        this.id = id;
        this.owner = owner;
    }
    public String getPetName() {
        return petName;
    }
    public Long getId() {
        return id;
    }
    public Owner getOwner() {
        return owner;
    }
    public final String AllInformationAboutPet() {
        return String.format("Pet %s is %s %s.Info about owner: %s,%s",
                petName,
                owner.name(),
                owner.surname(),
                owner.phoneNumber(),
                owner.email());
    }
    @Override
    public String toString() {
        return "Pet{" +
                "petMame='" + petName + '\'' +
                ", id=" + id +
                ", owner=" + owner +
                '}';
    }
}
