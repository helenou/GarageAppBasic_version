package com.lejeune;

import java.util.Scanner;

public class JobType 
{
	private int id;
	private String name;
	
	/**
	 * Constructor for Job Type
	 * @param name
	 */
	public JobType(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	/** Returns the job type name 
	 * @return the job type
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static JobType createJobType()
	{
		System.out.println("Please enter");
		
		System.out.println("Job type:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		return new JobType(name);
	}
	
public String toString() {
		
		return name;
	}
}
