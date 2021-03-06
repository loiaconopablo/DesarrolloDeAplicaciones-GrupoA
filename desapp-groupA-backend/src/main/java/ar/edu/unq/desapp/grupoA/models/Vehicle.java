package ar.edu.unq.desapp.grupoA.models;

import java.util.ArrayList;
import java.util.List;


public class Vehicle {

    private String brand;
    private int capacity;
    private List<Score> scores;

    public Vehicle(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
        this.scores = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Score> getScores() {
        return scores;
    }
}
