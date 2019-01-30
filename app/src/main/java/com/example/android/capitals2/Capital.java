package com.example.android.capitals2;

public class Capital {

    private String cityName;
    private String countryName;

    public Capital(String city, String country){
        cityName = city;
        countryName = country;
    }

    public String getCityName(){
        return cityName;
    }

    public String getCountryName(){
        return countryName;
    }

}
