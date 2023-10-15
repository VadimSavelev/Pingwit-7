package pl.pingvit.homework7;

import java.util.Arrays;

public class HouseCatalog {
    private String city;
    private String districtName;
    private String[] houseCatalog;

    public HouseCatalog() {
    }

    public HouseCatalog(String city, String districtName, String[] houseCatalog) {
        this.city = city;
        this.districtName = districtName;
        this.houseCatalog = houseCatalog;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String[] getHouseCatalog() {
        return houseCatalog;
    }

    public void setHouseCatalog(String[] houseCatalog) {
        this.houseCatalog = houseCatalog;
    }

    @Override
    public String toString() {
        return "HouseCatalog{" +
                "city='" + city + '\'' +
                ", districtName='" + districtName + '\'' +
                ", houseCatalog=" + Arrays.toString(houseCatalog) +
                '}';
    }
}
