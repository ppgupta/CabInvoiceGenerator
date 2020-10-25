package com.bridgelabz.cabinvoicegenerator;


public class InvoiceGenerator 
{
	private static final double RATE_PER_MINUTE = 1;
	private static final double RATE_PER_KM = 10;
	private static final double MIN_FARE = 5;

	public double calculateFare(Ride ride) {
		return Math.max(MIN_FARE, ride.getDistance()*RATE_PER_KM + ride.getTime()*RATE_PER_MINUTE);
	}

	public double calculateTotalFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride : rides) {
			totalFare+=calculateFare(ride);
		}
		return totalFare;
	}
}
