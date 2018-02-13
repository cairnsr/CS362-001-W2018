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
	/*
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

		//	assertTrue(calday.isValid());
		//	assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal, cal2);
		appts2= time.deleteAppt(appts2, appt);

		assertEquals(appts4, appts2);


	}
	*/

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

		//assertEquals(appts4, appts2);


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


		//assertEquals(calday.getAppts(), appts2);


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

		assertEquals(appt3, time.permute(appts2, pv).get(0));
		time.permute(appts2, pv);

		time.deleteAppt(appts2, appt);


	}

	@Test
	public void test10()  throws Throwable  {

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
		CalDay calday2 = new CalDay(cal2);


		calday.addAppt(appt);
		//calday.addAppt(appt3);
		appts2= calday.getAppts();
		//appts4= calday2.getAppts();

		LinkedList<CalDay> list;

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		list = time.getApptRange(appts2, cal2, cal);

		//time.deleteAppt(appts2, appt);

		//appt = null;
		//time.deleteAppt(appts2, appt);


		//assertEquals(1, calday.getAppts().size());

		//assertEquals(list.get(0), calday2);



	}
	@Test
	public void test11()  throws Throwable  {

		TimeTable time = new TimeTable();


		int startHour=11;
		int startMinute=30;
		int startDay=27;
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

		startHour=16;
		startMinute=30;
		startDay=27;
		startMonth=01;
		startYear=2018;
		title="Birthday Party";
		description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt8 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		java.util.LinkedList <calendar.Appt> appts2;
		java.util.LinkedList <calendar.Appt> appts4;
		java.util.LinkedList <calendar.Appt> appts0;
		int day=23;
		int month=9;
		int year=2018;


		GregorianCalendar cal2 = new GregorianCalendar();
		GregorianCalendar cal = new GregorianCalendar();

		cal.set(2018, 1, 27);
		cal2.set(2018, 1, 25);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal2);

		calday.addAppt(appt3);
		calday.addAppt(appt);
		calday.addAppt(appt8);



		appts4= calday.getAppts();
		appts2= calday.getAppts();
		appts0= calday.getAppts();
		//appts4= calday2.getAppts();

		LinkedList<CalDay> list;

		//assertTrue(calday.isValid());
		//assertTrue(calday2.isValid());
		//list = time.getApptRange(appts2, cal2, cal);

		//time.deleteAppt(appts2, appt);

		//appt = null;
		//time.deleteAppt(appts2, appt);


		//assertEquals(1, calday.getAppts().size());
		//assertEquals(list.get(0), calday2);
		appts0= time.deleteAppt(appts2, appt8);
		//appts4.remove(1);
		//assertEquals(null, appts2);

		assertEquals(appts2.get(0), appts4.get(0));
		//assertEquals("dasfsa", appts4.get(0));
		assertEquals(appts2.get(1), appts4.get(1));
		//assertEquals("sadf", appts4.get(1));
		//assertEquals(appts0, appts2);
		assertEquals(appts2, appts0);

		time.deleteAppt(appts2, appt8);
//	1/28/2018 at 9:30pm ,Birthday Party, This is my birthday party.(..)




	}
	@Test
	public void test12()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=11;
		int startMinute=50;
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
		/*
		appts2= calday.getAppts();
		time.getApptRange(appts2, cal2, cal);

		int recurdays[] = new int [1];
		int recurby = 1;
		int recurinc = 1;
		int recurnnum= 1;
		appt.setRecurrence(recurdays, recurby, recurinc, recurnnum);
		appt.isRecurring();
*/
		calday.addAppt(appt);
		calday.addAppt(appt3);
		appts2= calday.getAppts();




		//appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		time.getApptRange(appts2, cal2, cal);


		int pv[] = new int [1];
		pv[0] = 1;

		//assertEquals("  ", time.permute(appts2, pv));
		//time.permute(appts2, pv);




	}

	public void test13()  throws Throwable  {

		TimeTable time = new TimeTable();


		int startHour=21;
		int startMinute=30;
		int startDay=27;
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

		startHour=22;
		startMinute=30;
		startDay=29;
		startMonth=01;
		startYear=2018;
		title="Birthday Party";
		description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt5 = new Appt(startHour,
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

		cal.set(2018, 1, 30);
		cal2.set(2018, 1, 25);


		CalDay calday = new CalDay(cal);
		CalDay calday2 = new CalDay(cal2);


		calday.addAppt(appt);
		calday.addAppt(appt3);
		calday.addAppt(appt5);
		appts2= calday.getAppts();
		//appts4= calday2.getAppts();

		LinkedList<CalDay> list;

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());

		list = time.getApptRange(appts2, cal2, cal);
		LinkedList<CalDay> merp = new LinkedList<CalDay>();
		merp.add(calday2);


		//time.deleteAppt(appts2, appt);

		//appt = null;
		//time.deleteAppt(appts2, appt);


		//assertEquals(calday, list);

		assertEquals(list, merp);
		list = time.getApptRange(appts2, cal, cal2);
		LinkedList<GregorianCalendar> bleh = new LinkedList<GregorianCalendar>();
		assertEquals(bleh, list);



	}
	@Test
	public void test14()  throws Throwable  {

		TimeTable time = new TimeTable();

		int startHour=21;
		int startMinute=30;
		int startDay=18;
		int startMonth=01;
		int startYear=2018;
		String title="Party";
		String description="party.";
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
		title="Party";
		description="party.";
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


		CalDay calday = new CalDay(cal2);
		CalDay calday2 = new CalDay(cal);

		int recurdays[] = new int [1];
		int recurby = 1;
		int recurinc = 1;
		int recurnnum= 1;
		appt.setRecurrence(recurdays, recurby, recurinc, recurnnum);
		appt.isRecurring();

		calday.addAppt(appt);
		//calday.addAppt(appt3);



		appts2= calday.getAppts();
		//appts4= calday2.getAppts();

		assertTrue(calday.isValid());
		assertTrue(calday2.isValid());
		//time.getApptRange(appts2, cal2, cal);
		//LinkedList<CalDay> merp = new LinkedList<CalDay>();
		//merp.add(calday);

		//assertEquals(calday, time.getApptRange(appts2, cal2, cal).get(0));



		//assertEquals(appts4, appts2);


	}
}
