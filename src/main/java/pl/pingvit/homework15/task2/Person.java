package pl.pingvit.homework15.task2;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private DayOfWeek favouriteDayOfWeek;
    public Person(String name, String surname, LocalDate dateOfBirth, DayOfWeek favouriteDayOfWeek) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.favouriteDayOfWeek = favouriteDayOfWeek;
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
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public DayOfWeek getFavouriteDayOfWeek() {
        return favouriteDayOfWeek;
    }
    public void setFavouriteDayOfWeek(DayOfWeek favouriteDayOfWeek) {
        this.favouriteDayOfWeek = favouriteDayOfWeek;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", favouriteDayOfWeek=" + favouriteDayOfWeek +
                '}';
    }
}
