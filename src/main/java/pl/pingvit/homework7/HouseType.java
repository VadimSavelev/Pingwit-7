package pl.pingvit.homework7;

public enum HouseType {
    INDIVIDUAL("Индивидуальный"), APARTMENT("Многоэтажка");

    private final String name;

    HouseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
