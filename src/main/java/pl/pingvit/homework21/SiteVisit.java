package pl.pingvit.homework21;
import java.util.Objects;
public class SiteVisit {
    String userName;
    String nameOfTheSiteVisited;
    public SiteVisit(String userName, String nameOfTheSiteVisited) {
        this.userName = userName;
        this.nameOfTheSiteVisited = nameOfTheSiteVisited;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getNameOfTheSiteVisited() {
        return nameOfTheSiteVisited;
    }
    public void setNameOfTheSiteVisited(String nameOfTheSiteVisited) {
        this.nameOfTheSiteVisited = nameOfTheSiteVisited;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SiteVisit siteVisit)) return false;
        return Objects.equals(userName, siteVisit.userName) && Objects.equals(nameOfTheSiteVisited, siteVisit.nameOfTheSiteVisited);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userName, nameOfTheSiteVisited);
    }
    @Override
    public String toString() {
        return "SiteVisit{" +
                "userName='" + userName + '\'' +
                ", nameOfTheSiteVisited='" + nameOfTheSiteVisited + '\'' +
                '}';
    }
}
