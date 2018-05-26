package com.lejeune;

import java.util.Scanner;

/**
 * Represents mechanic
 * @author hlejeune
 */
public class Mechanic 
{
	private int id;
	private String firstName;
	private String lastName;
	private boolean MOT;
	private String qualification;
	
	/**
	 * Constructor for mechanic including an ID number
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param mOT
	 */
	public Mechanic(int id, String firstName, String lastName, boolean mOT) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		MOT = mOT;
	}
	
	/**
	 * Constructor for mechanic simplified
	 * @param firstName
	 * @param lastName
	 * @param mOT
	 */
	public Mechanic(String firstName, String lastName ,boolean mOT) {
		this.firstName = firstName;
		this.lastName = lastName;
		MOT = mOT;
	}	
	
	/**
	 * Return id
	 * @return the mechanic id
	 * */
	public int getId() {
		return id;
	}
	
	/**
	 * Updates the ID num (setter)
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Return Mechanic first name
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Updates Mechanic first name (setter)
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Return Mechanic last name
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Updates Mechanic last name (setter)
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**Getter for MOT
	 * @return MOT's state: true or false
	 */
	public boolean isMOT() {
		return MOT;
	}
	
	/**
	 * Updates MOT state to mechanic
	 * @param mOT
	 **/
	public void setMOT(boolean mOT) {
		MOT = mOT;
	}
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	/**
	 * Create mechanic by invoking user input
	 * @return a new mechanic with details given
	 */
	public static Mechanic createMechanic()
	{
		System.out.println("Please enter");
		
		System.out.println("Mechanic first name");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
	
		System.out.println("Mechanic last name");
		sc = new Scanner(System.in);
		String lastName = sc.nextLine();
		
		System.out.println("Mechanic is MOT certified, please enter appropriate number :");
		System.out.println("1 : YES");
		System.out.println("2 : NO");
		sc = new Scanner(System.in);
		int qualif = sc.nextInt();
		boolean MOT=false;
		
		System.out.println(qualif);
		if (qualif==1) {
			MOT=true;
			System.out.println("MOT qualified");
			}
			else if(qualif==2) {
			MOT=false;
			System.out.println("Non-MOT qualified");
			}
			else if (qualif!=1 || qualif!=2) {
			MOT=false;
			System.out.println("This input isn't recognized. Please enter 1 or 2.");
			}
		
		
		return new Mechanic(firstName, lastName,  MOT);
					}
		
		/** Generates a string of mechanic details
		 * @return String
		 */
		public String toString() {
		
		return firstName+"		"+lastName+"		"+MOT;
		
		}
}
