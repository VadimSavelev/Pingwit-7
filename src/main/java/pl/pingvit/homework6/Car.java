package pl.pingvit.homework6;
public class Car {
    private String registrationNumber;
    private Person person;
    public Car() {
    }
    public Car(String registrationNumber, Person person) {
        this.registrationNumber = registrationNumber;
        this.person = person;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", person=" + person +
                '}';
    }
}

