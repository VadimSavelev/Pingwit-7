package pl.pingvit.homework21;
import java.util.Objects;
public class FootballClub {
    public String ClubName; // поля принято именовать с маленькой буквы, поправь плиз
    public String country;
    public String city;
    public FootballClub(String clubName, String country, String city) {
        ClubName = clubName;
        this.country = country;
        this.city = city;
    }
    public String getClubName() {
        return ClubName;
    }
    public void setClubName(String clubName) {
        ClubName = clubName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
       @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballClub that)) return false;
        return Objects.equals(ClubName, that.ClubName) && Objects.equals(country, that.country) && Objects.equals(city, that.city);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ClubName, country, city);
    }
    @Override
    public String toString() {
        return "FootballClub{" +
                "ClubName='" + ClubName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
