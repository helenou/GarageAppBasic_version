package com.lejeune;

import java.util.Scanner;

/**
 * Represents a booking
 * @author hlejeune
 */
public class Booking {
	
	private int id;
	private TimeSlot timeslot;
	private Customer customer;
	private JobType jobtype;
	private Mechanic mechanic;
	
	/** Constructor for booking
	 * @param customer
	 * @param jobtype
	 */
	public Booking(Customer customer, JobType jobtype)
	{
		this.customer=customer;
		this.jobtype=jobtype;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	/** Return the assigned timeslot
	 * @return the timeslot for appointment
	 */
	public TimeSlot getTimeslot() {
		return timeslot;
	}
	
	/** Sets the timeslot for appointment
	 * @param timeslot
	 */
	public void setTimeslot(TimeSlot timeslot) {
		this.timeslot = timeslot;
	}
	
	/** Returns the customer
	 * @return the customer who made the booking
	 */
	public Customer getCustomer() {
		return customer;
	}

	/** Sets or update the customer
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	public JobType getJobtype() {
		return jobtype;
	}

	/**Sets or updates the job type requested for booking
	 * @param jobtype
	 */
	public void setJobtype(JobType jobtype) {
		this.jobtype = jobtype;
	}
	
	/** Returns the mechanic who is assigned to booking
	 * @return the mechanic assigned
	 */
	public Mechanic getMechanic() {
		return mechanic;
	}
	
	/** Sets or updates mechanic assigned to booking
	 * @param mechanic
	 */
	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}
	
	/** Generates a String of Booking details
	 * @return details of a booking
	 */
	public String toString(){
		
		return timeslot.toString()+ "  " +customer.toString()+ "  " +jobtype.toString()+ "  " +mechanic.toString();
		
	}
	
	/**
	 * Create a booking from scratch, neither the customer exist, nor the JobType, the time slot is null at this moment
	 * TimeSlot have to be compare in the class contains all Bookings = BookingBook 
	 * @return Booking
	 */
	public static Booking createBooking(){
		return new Booking(Customer.createCustomer(),JobType.createJobType());
	}
	
}
