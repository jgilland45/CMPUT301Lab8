package com.example.lab8;


import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * get if the customlist has a given city
     * add a new city to the list
     * check if the list has that city
     */
    @Test
    void testHasCity() {
        list = MockCityList();
        City city = mockCity();
        list.addCity(city);
        City city2 = new City("Calgary", "Alberta");
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(city2));
    }

    @Test
    void testDeleteCity() {
        list = MockCityList();
        City city = mockCity();
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(mockCity()));
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(mockCity());
        });
    }

//    @Test
//    void testCountCities() {
//        CityList cityList = mockCityList();
//        assertEquals(1, cityList.countCities());
//        City city = new City("Calgary", "Alberta");
//        cityList.add(city);
//        assertEquals(2, cityList.countCities());
//        cityList.delete(city);
//        assertEquals(1, cityList.countCities());
//    }
}
