package com.bridgelabz.cabinvoicegenerator;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {
	Map<String,Ride[]> ridemap;

	public RideRepository() {
		this.ridemap = new HashMap<>();
	}

	public void insertNewRider(String id, Ride[] rides) {
		ridemap.put(id,rides);
	}
}
