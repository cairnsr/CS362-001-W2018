package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

		 TimeTable time = new TimeTable();

		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
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

		 startHour=21;
		 startMinute=30;
		 startDay=25;
		 startMonth=01;
		 startYear=2018;
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

		 java.util.LinkedList <calendar.Appt> appts2;
		 int day=23;
		 int month=9;
		 int year=2018;
		 GregorianCalendar cal = new GregorianCalendar();
		 cal.set(2018, 1, 27);
		 day = 27;
		 GregorianCalendar cal2 = new GregorianCalendar();
		 cal2.set(2018, 1, 25);


		 CalDay calday = new CalDay(cal);
		 CalDay calday2 = new CalDay(cal2);

		 calday.addAppt(appt);
		 calday2.addAppt(appt3);
		 appts2= calday.getAppts();
		 appts2= calday2.getAppts();

		 assertTrue(calday.isValid());
		 assertTrue(calday2.isValid());
		 time.getApptRange(appts2, cal2, cal);



	 }
	 @Test
	  public void test02()  throws Throwable  {

		 TimeTable time = new TimeTable();

		 int startHour=21;
		 int startMinute=30;
		 int startDay=29;
		 int startMonth=01;
		 int startYear=2018;
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


		 startHour=21;
		 startMinute=30;
		 startDay=28;
		 startMonth=01;
		 startYear=2018;
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

		 java.util.LinkedList <calendar.Appt> appts2;
		 int day=23;
		 int month=9;
		 int year=2018;

		 day = 21;
		 GregorianCalendar cal2 = new GregorianCalendar();
		 GregorianCalendar cal = new GregorianCalendar();
		 cal.set(2018, 1, 27);
		 cal2.set(2018, 1, 25);


		 CalDay calday = new CalDay(cal);

		 CalDay calday2 = new CalDay(cal2);

		 calday.addAppt(appt);
		 calday2.addAppt(appt3);
		 appts2= calday.getAppts();
		 appts2= calday2.getAppts();

		 assertTrue(calday.isValid());
		 assertTrue(calday2.isValid());
		 time.getApptRange(appts2, cal2, cal);



	 }
//add more unit tests as you needed
@Test
	public void test03()  throws Throwable  {

	TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=29;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=28;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
	java.util.LinkedList <calendar.Appt> appts4;
		int day=23;
		int month=9;
		int year=2018;

		day = 21;
		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

	cal.set(2018, 1, 27);
	cal2.set(2018, 1, 25);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);

		calday.addAppt(appt);
		calday2.addAppt(appt3);
		appts2= calday.getAppts();
		appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal, cal2);
		appts2= time.deleteAppt(appts2, appt);

	assertEquals(appts4, appts2);


	}

	@Test
	public void test04()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=29;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=28;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;
		int day=23;
		int month=9;
		int year=2018;

		day = 21;
		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 27);
		cal2.set(2018, 1, 25);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);

		calday.addAppt(appt);
		calday2.addAppt(appt3);
		appts2= calday.getAppts();
		appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);

		time.deleteAppt(appts2, appt);

		appts2 = null;
		appts2= time.deleteAppt(appts2, appt);

		assertEquals(appts4, appts2);


	}

	@Test
	public void test05()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=39;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=28;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;
		int day=23;
		int month=9;
		int year=2018;

		day = 21;
		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 27);
		cal2.set(2018, 1, 25);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);

		calday.addAppt(appt);
		calday2.addAppt(appt3);
		appts2= calday.getAppts();
		appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);

		time.deleteAppt(appts2, appt);

		appt = null;
		time.deleteAppt(appts2, appt);


		assertEquals(appts4, appts2);


	}

	@Test
	public void test06()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=28;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=27;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;

		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 30);
		cal2.set(2018, 1, 25);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);

		calday.addAppt(appt);
		calday.addAppt(appt3);

		startDay = 29;
		appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		calday.addAppt(appt);

		appts2= calday.getAppts();
		//appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);

		time.deleteAppt(appts2, appt);



		//assertEquals(appts4, appts2);


	}

	@Test
	public void test07()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=18;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=17;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;

		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 30);
		cal2.set(2018, 1, 15);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);

		int recurdays[] = null;
		int recurby = 1;
		int recurinc = 1;
		int recurnnum= 1;
		appt.setRecurrence(recurdays, recurby, recurinc, recurnnum);
		appt.isRecurring();

		calday.addAppt(appt);
		calday.addAppt(appt3);



		appts2= calday.getAppts();
		//appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);

		time.deleteAppt(appts2, appt);



		//assertEquals(appts4, appts2);


	}
	@Test
	public void test08()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=18;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=17;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;

		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 30);
		cal2.set(2018, 1, 15);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);

		int recurdays[] = new int [1];
		int recurby = 1;
		int recurinc = 1;
		int recurnnum= 1;
		appt.setRecurrence(recurdays, recurby, recurinc, recurnnum);
		appt.isRecurring();

		calday.addAppt(appt);
		calday.addAppt(appt3);



		appts2= calday.getAppts();
		//appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);

		time.deleteAppt(appts2, appt);



		//assertEquals(appts4, appts2);


	}

	@Test
	public void test09()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=70;
		int startDay=18;
		int startMonth=01;
		int startYear=2018;
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


		startHour=21;
		startMinute=30;
		startDay=17;
		startMonth=01;
		startYear=2018;
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

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;

		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 30);
		cal2.set(2018, 1, 15);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal);
		appts2= calday.getAppts();
		time.getApptRange(appts2, cal2, cal);

		int recurdays[] = new int [1];
		int recurby = 1;
		int recurinc = 1;
		int recurnnum= 1;
		appt.setRecurrence(recurdays, recurby, recurinc, recurnnum);
		appt.isRecurring();

		calday.addAppt(appt);
		calday.addAppt(appt3);




		//appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);


		int pv[] = new int [1];
		time.permute(appts2, pv);

		time.deleteAppt(appts2, appt);


	}


}
