package com.example.lab8;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * This is the constructor to create a new City object.
     * @param city
     *  This is the city name of the new city.
     * @param province
     *  This is the province name of the new city.
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This method is a getter for the city name.
     * @return
     *  Returns the name of the city.
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * This method is a getter for the province name.
     * @return
     *  Returns the name of the province.
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * This is a method that comes from implementing the Comparable interface.
     * This compares the given city to this city, and returns true if they share the same name.
     * @param city
     *  This is the city that is being compared to this city.
     * @return
     *  Returns true if the given city name matches this city name, otherwise returns false.
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * This is a method that determines equality of City objects.
     * A city is considered equal if they share the same city name and province name.
     * @param o
     *  This is the object to compare to this object (City).
     * @return
     *  Returns true if the given city name matches this city name, otherwise returns false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * This creates the hash of the City object.
     * @return
     *  Returns the hash code of this City object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}