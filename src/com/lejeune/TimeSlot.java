package com.lejeune;

import java.util.Calendar;
import java.util.Scanner;

public class TimeSlot {
	private Calendar startDate;
	private Calendar endDate;
	
	/** Constructor of a time slot with a Start and End date-time
	 * @param startDate
	 * @param endDate
	 */
	public TimeSlot (Calendar startDate, Calendar endDate)
	{
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	/** Returns the start date
	 * @return the start date
	 */
	public Calendar getStartDate() {
		return startDate;
	}
	
	/** Sets a start date (to use in bookings to be saved in bookingbook)
	 * @param startDate
	 */
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	
	/** Returns an end date (to use in bookings to be saved in bookingbook)
	 * @return
	 */
	public Calendar getEndDate() {
		return endDate;
	}
	
	/** Sets or updates the end date
	 * @param endDate
	 */
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	public static TimeSlot createTimeSlot()
	{
		System.out.println("Please enter the start date ? (YYYY/MM/DD HH:MM)");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		Calendar Cal1 = Calendar.getInstance();
		//have to be test
		int years = Integer.parseInt(date.substring(0,3));
		int month = Integer.parseInt(date.substring(5,6));
		int day = Integer.parseInt(date.substring(5,6));
		int hour = Integer.parseInt(date.substring(8,9));
		int minute = Integer.parseInt(date.substring(11,12));
		Cal1.set(years,month,day,hour,minute);
		
		System.out.println("Please enter the end date ? (YYYY/MM/DD HH:MM)");
		sc = new Scanner(System.in);
		 date = sc.nextLine();
		 Calendar Cal2 = Calendar.getInstance();
		//have to be test
		years = Integer.parseInt(date.substring(0,3));
		month = Integer.parseInt(date.substring(5,6));
		day = Integer.parseInt(date.substring(5,6));
		hour = Integer.parseInt(date.substring(8,9));
		minute = Integer.parseInt(date.substring(11,12));
		Cal2.set(years,month,day,hour,minute);
		
		return new TimeSlot(Cal1,Cal2);
		
		
	}

}
