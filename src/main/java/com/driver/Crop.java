package com.driver;

public class Crop {
	private String name;
    private double latitude;
    private double longitude;

    public Crop() {
    	// your code goes here
    }

    public Crop(String name, double latitude, double longitude) {
    	// your code goes here
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
    	// your code goes here
        return name;
    }

    public void setName(String name) {
    	// your code goes here
        this.name = name;
    }

    public double getLatitude() {
    	// your code goes here
        return latitude;
    }

    public void setLatitude(double latitude) {
    	// your code goes here
        this.latitude = latitude;
    }

    public double getLongitude() {
    	// your code goes here
        return longitude;
    }

    public void setLongitude(double longitude) {
    	// your code goes here
        this.longitude=longitude;
    }

    @Override
    public String toString() {
    	// your code goes here
        return "Crop{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
