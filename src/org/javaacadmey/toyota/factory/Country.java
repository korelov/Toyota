package org.javaacadmey.toyota.factory;

public enum Country {
    RUSSIA("Россия"),
    USA("Соединённые Штаты Америки"),
    CHINA("Китай");

    private final String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
