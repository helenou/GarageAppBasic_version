package com.lejeune;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Represents BookingBook (Appointments book)
 * @author hlejeune
 */
public class BookingBook implements Serializable
{

	private String Name;
	private ArrayList<Booking> bookingList = new ArrayList<Booking>();
	private ArrayList<Customer> customersList = new ArrayList<Customer>();
	private ArrayList<Mechanic> mechanicsList = new ArrayList<Mechanic>();
	private ArrayList<JobType> jobTypesList = new ArrayList<JobType>();
	
	//inheritance have to be used.
	private int bookingListHighID()
	{
		int highID=0;
		for(int i=0;i<bookingList.size();i++)
		{
			if(bookingList.get(i).getId()>highID)
			{
				highID=bookingList.get(i).getId();
			}
		}
		return highID;
	}
	
	//inheritance have to be used.
	private int customersListHighID()
	{
		int highID=0;
		for(int i=0;i<customersList.size();i++)
		{
			if(customersList.get(i).getId()>highID)
			{
				highID=customersList.get(i).getId();
			}
		}
		return highID;
	}
	
	//inheritance have to be used.
	private int mechanicsListHighID()
	{
		int highID=0;
		for(int i=0;i<mechanicsList.size();i++)
		{
			if(mechanicsList.get(i).getId()>highID)
			{
				highID=mechanicsList.get(i).getId();
			}
		}
		return highID;
	}
	
	//inheritance have to be used.
	private int jobTypesListHighID()
	{
		int highID=0;
		for(int i=0;i<jobTypesList.size();i++)
		{
			if(jobTypesList.get(i).getId()>highID)
			{
				highID=jobTypesList.get(i).getId();
			}
		}
		return highID;
	}
	

	public void insertCustomer()
	{
		Customer customer = Customer.createCustomer();
		//increment higher id to set id
		customer.setId(this.customersListHighID()+1);
		customersList.add(customer);
	}
	
	public void displayCustomers()
	{
		for(int i=0;i<customersList.size();i++)
		{
			System.out.println(customersList.get(i).toString());
		}
	}
	
	public void insertMechanic()
	{
		Mechanic mechanic = Mechanic.createMechanic();
		//increment higher id to set id
		mechanic.setId(this.mechanicsListHighID()+1);
		mechanicsList.add(mechanic);
	}
	
	public void displayMechanics()
	{
		for(int i=0;i<mechanicsList.size();i++)
		{
			System.out.println(mechanicsList.get(i).toString());
		}
	}
	
	public void insertJobType()
	{
		JobType jobType = JobType.createJobType();
		//increment higher id to set id
		jobType.setId(this.jobTypesListHighID()+1);
		jobTypesList.add(jobType);
	}
	
	public void displayJobTypes()
	{
		for(int i=0;i<jobTypesList.size();i++)
		{
			System.out.println(jobTypesList.get(i).toString());
		}
	}
	
	/** Method to insert a new booking in the bookingbook
	 */
	public void insertBooking()
	{
	Booking booking = Booking.createBooking();
		//increment higher id to set id
		booking.setId(this.bookingListHighID()+1);
		bookingList.add(booking);
	}
	
	/* method to display bookings 
	public void displayBookings()
	{
		for(int i=0;i<bookingList.size();i++)
		{
			System.out.println(bookingList.get(i).toString());
		}
	} */
	
	/**
	 * Add a booking to the booking area with confirm of the time slot
	 * @return
	 */
	public void addBooking()
	{
		
		boolean added = false;
	}
	
	/**
	 * TODO : Check if the timeSlot TS is not in conflict with the existing Bookings TimeSlot
	 */
	private boolean TypeSlotTaken(TimeSlot TS)
	{
		return true;
	}
	
	
	public Booking returnBooking(Booking boo)
	{
		return boo;
	}
	
	public static void main(String[] args) {
		BookingBook boo = new BookingBook();
		
		boolean wayout = false;
		while(wayout == false)
		{
			int i = 0;
			System.out.println("Menu : ");
			System.out.println("1/ Add customer");
			System.out.println("2/ Add mechanic");
			System.out.println("3/ Add jobType");
			System.out.println("4/ display customers");
			System.out.println("5/ display mechanic");
			System.out.println("6/ display jobtype");
			System.out.println("7/ Add a booking");
		/*	System.out.println("8/ Display a booking");*/
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			switch (i) 
			{ 
			case 1: boo.insertCustomer(); break; 
			case 2: boo.insertMechanic(); break; 
			case 3: boo.insertJobType(); break;
			case 4: boo.displayCustomers();break;
			case 5: boo.displayMechanics();break;
			case 6: boo.displayJobTypes();break;
			case 7: boo.insertBooking();break;
		/*	case 8: boo.displayBookings();break;*/
			default: 
				System.out.println("choix default");
			}
		}

	}
	
	/** Serialization to save objects' states between sessions
	 * @param boo
	 */
	public static void serialiser(BookingBook boo) 
	{
        try {
                FileOutputStream fout = new FileOutputStream("auth.bin");
                ObjectOutputStream oout = new ObjectOutputStream(fout);
                oout.writeObject(boo);
                oout.close();
                fout.close();
        } catch (IOException ioe) {
                ioe.printStackTrace();
        }
	}
        
    public static BookingBook deserialiser() 
    {
    	BookingBook user = null;
        try {
                FileInputStream fin = new FileInputStream("auth.bin");
                ObjectInputStream oin = new ObjectInputStream(fin);
                user = (BookingBook) oin.readObject();
                oin.close();
                fin.close();
        } catch (ClassNotFoundException nfe) {
                nfe.printStackTrace();
        } catch (IOException ioe) {
                ioe.printStackTrace();
        }
        return user;
    }
}
