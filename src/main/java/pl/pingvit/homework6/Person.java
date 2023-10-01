package pl.pingvit.homework6;
public class Person {
    private String name;
    private String surname;
    private String Number;  // плиз названия полей начинай с маленькой буквы
    private String email;
    public Person() {
    }
    public Person(String name, String surname, String number, String email) {
        this.name = name;
        this.surname = surname;
        Number = number;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getNumber() {
        return Number;
    }
    public void setNumber(String number) {
        Number = number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Number='" + Number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
