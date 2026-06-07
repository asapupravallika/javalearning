package com.codegnan.fundamentals;

import java.util.Scanner;

public class ParkingFeeCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String vehicleType = sc.next().toLowerCase();
		int arrivalTime = sc.nextInt();
		int departureTime = sc.nextInt();
		
		int rate = 0;
		
		if(vehicleType.equals("car")) {
			rate = 50;
		} else {
			if(vehicleType.equals("bike")) {
				rate = 30;
			}
			else {
				rate = 100;
			}
		}
		int duration = 0;
		if(arrivalTime > departureTime) {
			duration = (24 - arrivalTime) + departureTime;
		} else {
			duration = departureTime - arrivalTime;
		}
		
		double totalParkingFee = duration * rate;
		if(duration > 5) {
			totalParkingFee -= totalParkingFee * 0.20;
		} else {
			totalParkingFee += 0;
		}
		
		double surcharge = 0;
		
		if(arrivalTime >=18 || departureTime<8 || departureTime>=18 || arrivalTime<8) {
			surcharge = totalParkingFee * 0.50;
		} else {
			surcharge = 0;
		}
		
		double finalFee = totalParkingFee + surcharge;
		
		System.out.println("Total parking fee: " + finalFee);
		System.out.println("Explanation: ");
		System.out.println("Parking Duration: " + duration + " hours");
		System.out.println("Fee after Discount: " + totalParkingFee);
		System.out.println("Night surcharge: " + surcharge);
		System.out.println("Final fee: " + finalFee);
		
		sc.close();
	}

}
