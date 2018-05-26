package com.lejeune;

import java.util.Scanner;

/**
 * Represents vehicle
 * @author hlejeune
 */
public class Vehicle {
	
	private String regNum;
	private String make;
	private String model;
	
	/** Constructor for vehicle
	 * @param regNum
	 * @param make
	 * @param model
	 */
	public Vehicle(String regNum, String make, String model) {
		this.regNum = regNum;
		this.make = make;
		this.model = model;
	}

	/** Returns vehicle registration
	 * @return the vehicle registration number
	 */
	public String getRegNum() {
		return regNum;
	}

	/** Sets or updates the vehicle registration number
	 * @param regNum
	 */
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	/** Return the name of vehicle make
	 * @return the vehicle make
	 */
	public String getMake() {
		return make;
	}

	/**  Sets or updates vehicle make
	 * @param make
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/** Returns the name of vehicle model
	 * @return the vehicle model
	 */
	public String getModel() {
		return model;
	}

	/** Sets or updates vehicle model
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * Create vehicle by invoking user input
	 * @return a new vehicle with these details
	 */
	public static Vehicle createVehicle()
	{
		System.out.println("Please enter");
		
		System.out.println("Vehicle Registration");
		Scanner sc = new Scanner(System.in);
		String regNum = sc.nextLine();
		
		System.out.println("Vehicle Make");
		sc = new Scanner(System.in);
		String make = sc.nextLine();
		
		System.out.println("Vehicle Model");
		sc = new Scanner(System.in);
		String model = sc.nextLine();
		
		return new Vehicle(regNum,make,model);
	}
	
	/** Generates a String of vehicle details
	 * @return String
	 */
	public String toString(){
		
		return regNum+ "  " +make+ "  "+model;
	
	}

}
