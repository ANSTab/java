package com.tabachenko.task8;

public class CountryInfo {


    private String countryName;
    private int regionCount;
    private int cityCount;

    public CountryInfo(String countryName, int regionCount, int cityCount) {
        this.countryName = countryName;
        this.regionCount = regionCount;
        this.cityCount = cityCount;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getRegionCount() {
        return regionCount;
    }

    public void setRegionCount(int regionCount) {
        this.regionCount = regionCount;
    }

    public int getCityCount() {
        return cityCount;
    }

    public void setCityCount(int cityCount) {
        this.cityCount = cityCount;
    }

    @Override
    public String toString() {
        return "CountryInfo{" +
                "countryName='" + countryName + '\'' +
                ", regionCount=" + regionCount +
                ", cityCount=" + cityCount +
                '}';
    }
}
