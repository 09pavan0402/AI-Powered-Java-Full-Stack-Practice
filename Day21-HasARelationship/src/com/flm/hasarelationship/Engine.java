package com.flm.hasarelationship;

public class Engine {
	
	String fuelType;
	int capacity;
	public Engine() {
		
	}
	public Engine(String fuelType, int capacity) {
		super();
		this.fuelType = fuelType;
		this.capacity = capacity;
	}
	@Override
    public String toString() {
        return "Engine [fuelType=" + fuelType + ", capacity=" + capacity + "]";
    }
	
}
