package pl.pingvit.homework21;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class FootballApplication {
    public static void main(String[] args) {
        List<FootballClub> footballClubsList = new ArrayList<>();
        FootballClub footballClub1 = new FootballClub("Barcelona", "Spain", "Barcelona");
        FootballClub footballClub2 = new FootballClub("Arsenal", "England", "London");
        FootballClub footballClub3 = new FootballClub("Gomel", "Belarus", "Gomel");
        FootballClub footballClub4 = new FootballClub("Real Madrid", "Spain","Madrid");

        footballClubsList.add(footballClub1);
        footballClubsList.add(footballClub2);
        footballClubsList.add(footballClub3);
        footballClubsList.add(footballClub4);

        Set<String> uniqueCountries = extractCountries(footballClubsList);

        System.out.println("unique Countries : "+uniqueCountries);
    }
    public static Set<String> extractCountries(List<FootballClub> footballClubs) {
        Set<String> countries = new HashSet<>();
        for (FootballClub footballClub : footballClubs) {
            countries.add(footballClub.getCountry());
        }
        return countries;
    }
}



