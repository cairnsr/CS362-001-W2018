package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"setTitle","setRecurrence"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}
	/**
	 * Return a randomly selected appointments to recur Weekly,Monthly, or Yearly !.
	 */
	public static int RandomSelectRecur(Random random){
		int[] RecurArray = new int[] {Appt.RECUR_BY_WEEKLY,Appt.RECUR_BY_MONTHLY,Appt.RECUR_BY_YEARLY};// The list of the of setting appointments to recur Weekly,Monthly, or Yearly

		int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
		return RecurArray[n] ; // return the value of the  appointments to recur
	}
	/**
	 * Return a randomly selected appointments to recur forever or Never recur  !.
	 */
	public static int RandomSelectRecurForEverNever(Random random){
		int[] RecurArray = new int[] {Appt.RECUR_NUMBER_FOREVER,Appt.RECUR_NUMBER_NEVER};// The list of the of setting appointments to recur RECUR_NUMBER_FOREVER, or RECUR_NUMBER_NEVER

		int n = random.nextInt(RecurArray.length);// get a random number between 0 (inclusive) and  RecurArray.length (exclusive)
		return RecurArray[n] ; // return appointments to recur forever or Never recur
	}

	/**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;



		 System.out.println("Start testing...");

		 try{
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis(); //10
				 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);

				 int makenull =ValuesGenerator.getRandomIntBetween(random, 1, 90);
				 int startHour=ValuesGenerator.RandInt(random)-10;
				 int startMinute=ValuesGenerator.RandInt(random)-10;
				 int startDay=ValuesGenerator.RandInt(random)-10;
				 //	 int startMonth=ValuesGenerator.RandInt(random)-10;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);

				 startHour=ValuesGenerator.RandInt(random)-10;
				 startMinute=ValuesGenerator.RandInt(random)-10;
				 startDay=ValuesGenerator.RandInt(random)-10;
				 //	 int startMonth=ValuesGenerator.RandInt(random)-10;
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt2 = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);

				 startHour=ValuesGenerator.RandInt(random)-10;
				 startMinute=ValuesGenerator.RandInt(random)-10;
				 startDay=ValuesGenerator.RandInt(random)-10;
				 //	 int startMonth=ValuesGenerator.RandInt(random)-10;
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt3 = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);


				 TimeTable time = new TimeTable();
				 java.util.LinkedList <calendar.Appt> apptlist;

				 GregorianCalendar cal = new GregorianCalendar();
				 CalDay calday = new CalDay(cal);


				// apptlist= calday.getAppts();
				// time.deleteAppt(apptlist, appt);

				 if (makenull >= 1 && makenull <= 5) {
					 appt = null;
				 }

				 calday.addAppt(appt);
				 apptlist= calday.getAppts();

				 makenull =ValuesGenerator.getRandomIntBetween(random, 1, 90);
				 if (makenull >= 1 && makenull <= 5) {
					 apptlist = null;
				 }

				 time.deleteAppt(apptlist, appt2);
				 time.deleteAppt(apptlist, appt);

				 calday.addAppt(appt);
				 calday.addAppt(appt2);



				 apptlist= calday.getAppts();
				 time.deleteAppt(apptlist, appt3);
				 time.deleteAppt(apptlist, appt);
				 time.deleteAppt(apptlist, appt2);


				/*
				 apptlist = null;
				 appt = null;
				 time.deleteAppt(apptlist, appt);
				 */




				 if(!appt3.getValid())continue;
				 for (int i = 0; i < NUM_TESTS; i++) {
					 String methodName = CalDayRandomTest.RandomSelectMethod(random);
					 if (methodName.equals("setTitle")){
						 String newTitle=(String) ValuesGenerator.getString(random);
						 appt3.setTitle(newTitle);
					 }
					 else if (methodName.equals("setRecurrence")){
						 int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 9);
						 int[] recurDays=ValuesGenerator.generateRandomArray(random, sizeArray);
						 if (sizeArray == 3) {
							 recurDays = null;
						 }
						 int recur=CalDayRandomTest.RandomSelectRecur(random);
						 int recurIncrement = ValuesGenerator.RandInt(random);
						 int recurNumber=CalDayRandomTest.RandomSelectRecurForEverNever(random);
						 appt3.setRecurrence(recurDays, recur, recurIncrement, recurNumber);


					 }
				 }


				 cal.set(ValuesGenerator.RandInt(random)-10, ValuesGenerator.RandInt(random)-10, ValuesGenerator.RandInt(random)-10);
				 //cal.set(2018, 1, 27);

				 GregorianCalendar cal2 = new GregorianCalendar();
				 cal2.set(ValuesGenerator.RandInt(random)-10, ValuesGenerator.RandInt(random)-10, ValuesGenerator.RandInt(random)-10);
				 //cal2.set(2018, 1, 25);

				 apptlist= calday.getAppts();
				 time.getApptRange(apptlist, cal2, cal);


				 //time.deleteAppt(apptlist, appt3);



				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			 }

		 }catch(NullPointerException e){

		 }

		 System.out.println("Done testing...");







	 }
	
}
