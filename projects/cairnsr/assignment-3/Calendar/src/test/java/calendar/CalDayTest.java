package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	@Test
	public void test01()  throws Throwable  {

		int day=11;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2018, 1, 11);

		CalDay calday = new CalDay(cal);
		assertTrue(calday.isValid());
		assertEquals(11, calday.getDay());
		assertEquals(1, calday.getMonth());
		assertEquals(2018, calday.getYear());

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
		java.util.LinkedList <calendar.Appt> appts2;

		calday.addAppt(appt);

		appts2= calday.getAppts();


		assertTrue(appt.getValid());
		//assertEquals(appts2, calday.appts);

	}
	@Test
	public void test02()  throws Throwable  {
		int day=23;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();


		CalDay calday = new CalDay(cal);

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
		java.util.LinkedList <calendar.Appt> appts2;


		String convert;
		convert = calday.toString();

		assertTrue(appt.getValid());
		//assertEquals(" --- 9/23/2018 ---  --- --------Appointments-------- --- ", convert);

	}
	//add more unit tests as you needed
	@Test
	public void test03()  throws Throwable  {
		int day=23;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();

		CalDay calday = new CalDay(cal);

		Iterator<?> getit;

		getit = calday.iterator();

		//assertEquals(null, getit);

	}

	@Test
	public void test04()  throws Throwable  {
		int day=23;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();

		CalDay calday = new CalDay();

		Iterator<?> getit;

		getit = calday.iterator();

		assertEquals(null, getit);

	}
	@Test
	public void test05()  throws Throwable  {

		int day=29;
		int month=1;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();


		CalDay calday = new CalDay(cal);
		//assertTrue(calday.isValid());
		//assertEquals(29, calday.getDay());
		//assertEquals(1, calday.getMonth());
		//assertEquals(2018, calday.getYear());

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
		java.util.LinkedList <calendar.Appt> appts2;


		startHour = 20;
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		startHour = 23;
		Appt appt4 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		calday.addAppt(appt);
		calday.addAppt(appt3);
		calday.addAppt(appt4);

		appts2= calday.getAppts();
		String convert;
		convert = calday.toString();

		assertTrue(appt.getValid());
		//assertEquals(" --- 9/23/2018 ---  --- --------Appointments-------- --- ", convert);
		//assertEquals(appts2, calday.appts);

	}

	/*
	@Test
	public void test06()  throws Throwable  {

		int day=23;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();


		CalDay calday = new CalDay(cal);
		assertTrue(calday.isValid());
		//assertEquals(23, calday.getDay());
		//assertEquals(9, calday.getMonth());
		assertEquals(2018, calday.getYear());

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
		java.util.LinkedList <calendar.Appt> appts2;
		appt = null;

		calday.addAppt(appt);

		appts2= null;


		assertTrue(appt.getValid());
		//assertEquals(appts2, calday.appts);

	}

*/
	@Test
	public void test07()  throws Throwable  {

		GregorianCalendar cal = new GregorianCalendar();

		CalDay calday = new CalDay();

		String convert;
		convert = calday.toString();

		//assertEquals(" --- 9/23/2018 ---  --- --------Appointments-------- --- ", convert);

	}
	@Test
	public void test08()  throws Throwable  {

		int day=23;
		int month=9;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();


		CalDay calday = new CalDay(cal);
		assertTrue(calday.isValid());
		//assertEquals(23, calday.getDay());
		//assertEquals(9, calday.getMonth());
		assertEquals(2018, calday.getYear());

		int startHour=31;
		int startMinute=70;
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
		java.util.LinkedList <calendar.Appt> appts2;



		appts2= calday.getAppts();


		assertFalse(appt.getValid());
		calday.addAppt(appt);
		//assertEquals(appts2, calday.appts);

	}

	@Test
	public void test09()  throws Throwable  {

		int day=29;
		int month=1;
		int year=2018;
		GregorianCalendar cal = new GregorianCalendar();


		CalDay calday = new CalDay(cal);
		//assertTrue(calday.isValid());
		//assertEquals(29, calday.getDay());
		//assertEquals(1, calday.getMonth());
		//assertEquals(2018, calday.getYear());

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
		java.util.LinkedList <calendar.Appt> appts2;


		startHour = 20;
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		startHour = 23;
		Appt appt4 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		calday.addAppt(appt);
		calday.addAppt(appt3);
		calday.addAppt(appt4);

		appts2= calday.getAppts();
		String convert;

		int size;

		size = calday.getSizeAppts();

		assertTrue(appt.getValid());

		assertEquals(3, size);

		cal.set(0, 0, 0);
		calday = new CalDay(cal);
		convert = calday.toString();
		//assertEquals("", convert);
	}


}
