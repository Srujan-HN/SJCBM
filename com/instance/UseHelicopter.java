package com.instance;

class Helicopter {
    String transportType;
    int speed;
    String cities;

    void details() {
        System.out.println("Government or Private: " + transportType + 
                           "\nSpeed: " + speed + 
                           "\nCities covered: " + cities);
    }
}

public class UseHelicopter {
    public static void main(String[] args) {
        Helicopter h = new Helicopter();
        h.transportType = "Government";
        h.speed = 300;
        h.cities = "Delhi";
        h.details();
    }
}