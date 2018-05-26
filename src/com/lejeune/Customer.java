package com.lejeune;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents customer
 * @author hlejeune
 */
public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private int contactNumber;
	private ArrayList<Vehicle> vehicleList;
	
	/**
	 * Constructor for Customer including an ID
	 * @param customerID
	 * @param firstName
	 * @param lastName
	 * @param contactNumber
	 * @param vehicleList
	 */
	public Customer(int id, String firstName, String lastName,
			int contactNumber, ArrayList<Vehicle> vehicleList) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.vehicleList = vehicleList;
	}
	
	/**
	 * Constructor for Customer simplified
	 */
	public Customer(String firstName, String lastName,
			int contactNumber, ArrayList<Vehicle> vehicleList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.vehicleList = vehicleList;
	}
	
	/**Returns an ID to identify customer (getter)
	 * @return given customer id 
	 */
	public int getId() {
		return id;
	}

	/** Updates or sets customer ID
	 * @param ID customer
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/** Returns the first name of the customer
	 * @return customer first name 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**Updates or sets customer first name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/** Returns the customer last name
	 * @return customer last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/** Updates or sets the customer last name
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/** Returns the customer contact number
	 * @return customer contact number
	 */
	public int getContactNumber() {
		return contactNumber;
	}
	
	/** Updates (setter) for customer contact number
	 *@param contactNumber
	 */
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	/** Return customer vehicle
	 *@return vehicle(s) list for related customer 
	 */
	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}
	
	/** Updates vehicle(s) for customer (setter)
	 * @param vehicleList
	 */
	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	
	/**
	 * Create customer by invoking user input
	 * @return a new customer with these details
	 */
	public static Customer createCustomer()
	{
		System.out.println("Please enter");
		
		System.out.println("Customer firstname");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		
		System.out.println("Customer lastname");
		sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		
		//System.out.println("Customer contact number");
		//sc = new Scanner(System.in);
		//int contactNumber = sc.nextInt();
		//int contactNumber = Integer.parseInt(sc.nextLine());
		/** under modif 
		*/
		 sc = new Scanner(System.in);
		 int contactNumber;
		    do {
		        System.out.println("Customer contact number");
		        while (!sc.hasNextInt()) {
		            System.out.println("That's not a number! Please enter valid data (numbers)");
		            sc.next(); // this is important!
		        }
		        contactNumber = sc.nextInt();
		    } while (contactNumber <= 0);
		    System.out.println("Thank you! Got " + contactNumber);
		
		
		
	
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(Vehicle.createVehicle());
		
		return new Customer(firstName,lastName,contactNumber,vehicleList);
	}
	
	/**Generates a string of linked vehicle(s) details
	 * @return details for vehicle
	 */	
	private String DisplayVehicleList()
	{
		String ret="";
		for(int i=0;i<vehicleList.size();i++)
		{
			ret=vehicleList.get(i).getRegNum()+"	"+vehicleList.get(i).getMake()+"    "+vehicleList.get(i).getModel()+ "\n";
		}
		
		return ret;
	}
	
	/** Generates a string of customer details
	 * @return customer details
	 */
	public String toString() {
		
		return firstName+"		"+lastName+"		"+contactNumber+"	 "+this.DisplayVehicleList();
		
	}

}
