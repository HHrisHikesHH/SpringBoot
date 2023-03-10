package com.test.Restaurant.model;

public class Restaurant {
    private String name;
    private String location;
    private long number;
    private String cuisine;
    private int totalStaff;
    private double rating;
    private int budget;

    public Restaurant(String name, String location, long number, String cuisine, int totalStaff, double rating, int budget) {
        this.name = name;
        this.location = location;
        this.number = number;
        this.cuisine = cuisine;
        this.totalStaff = totalStaff;
        this.rating = rating;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", number=" + number +
                ", cuisine='" + cuisine + '\'' +
                ", totalStaff=" + totalStaff +
                ", rating=" + rating +
                ", budget=" + budget +
                '}';
    }
}
