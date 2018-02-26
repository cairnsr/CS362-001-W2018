package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
		 appt.toString();

	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour = 24;
		 int startMinute=55;
		 int startDay=22;
		 int startMonth=8;
		 int startYear=2018;
		 String title = "asdf";
		 String description = "asdf";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 // assertions
		/* assertTrue(appt.getValid());
		 assertEquals(24, appt.getStartHour());
		 assertEquals(55, appt.getStartMinute());
		 assertEquals(22, appt.getStartDay());
		 assertEquals(8, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("asdf", appt.getTitle());
		 assertEquals("asfd", appt.getDescription());
		*/
	 }
//add more unit tests as you needed

public void test03()  throws Throwable  {
	int startHour=05;
	int startMinute=60;
	int startDay=21;
	int startMonth=11;
	int startYear=2018;
	String title="Herp";
	String description="Merp Derp Berp";
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
			startMinute ,
			startDay ,
			startMonth ,
			startYear ,
			title,
			description);

	// assertions
	assertTrue(appt.getValid());
		 assertEquals(05, appt.getStartHour());
		 assertEquals(60, appt.getStartMinute());
		 assertEquals(21, appt.getStartDay());
		 assertEquals(11, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Herp", appt.getTitle());
		 assertEquals("Merp Derp Berp", appt.getDescription());

}
	@Test
	public void test04()  throws Throwable {
		int startHour = 05;
		int startMinute = 6;
		int startDay = 21;
		int startMonth = 11;
		int startYear = 2018;
		String title = "Herp";
		String description = "Merp Derp Berp";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		// assertions
		assertTrue(appt.getValid());
		assertEquals(05, appt.getStartHour());
		assertEquals(6, appt.getStartMinute());
		assertEquals(21, appt.getStartDay());
		assertEquals(11, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("Herp", appt.getTitle());
		assertEquals("Merp Derp Berp", appt.getDescription());

		startHour = 05;
		startMinute = 6;
		startDay = 21;
		startMonth = 11;
		startYear = 2018;
		title = "Birthday Party";
		description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		// assertions
		assertTrue(appt.getValid());
		assertEquals(05, appt2.getStartHour());
		assertEquals(6, appt2.getStartMinute());
		assertEquals(21, appt2.getStartDay());
		assertEquals(11, appt2.getStartMonth());
		assertEquals(2018, appt2.getStartYear());
		assertEquals("Birthday Party", appt2.getTitle());
		assertEquals("This is my birthday party.", appt2.getDescription());

		int compareint;
		String words;
		compareint= appt.compareTo(appt2);

		assertEquals(0, compareint);

		words = appt.toString();
		//assertEquals("21/11/2018 at 05:6am ,Herp, Merp Derp Berp", words);


	}
	@Test
	public void test05()  throws Throwable  {
		int startHour=21;
		int startMinute=30;
		int startDay=35;
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
		// assertions
		/*
		assertTrue(appt.getValid());
		assertEquals(21, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(35, appt.getStartDay());
		assertEquals(01, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	*/
	}


	@Test
	public void test06()  throws Throwable  {
		int startHour = 12;
		int startMinute=15;
		int startDay=12;
		int startMonth=00;
		int startYear=2018;
		String title = "asdf";
		String description = "asdff";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(12, appt.getStartHour());
		assertEquals(15, appt.getStartMinute());
		assertEquals(12, appt.getStartDay());
		assertEquals(00, appt.getStartMonth());
		assertEquals(2018, appt.getStartYear());
		assertEquals("asdf", appt.getTitle());
		assertEquals("asdff", appt.getDescription());

	}


@Test
public void test07()  throws Throwable  {
	int startHour = 22;
	int startMinute=65;
	int startDay=22;
	int startMonth=8;
	int startYear=2018;
	String title = null;
	String description = null;
	//Construct a new Appointment object with the initial data
	Appt appt = new Appt(startHour,
			startMinute ,
			startDay ,
			startMonth ,
			startYear ,
			title,
			description);
	// assertions
	appt.toString();
/*
	assertTrue(appt.getValid());
	assertEquals(22, appt.getStartHour());
	assertEquals(65, appt.getStartMinute());
	assertEquals(22, appt.getStartDay());
	assertEquals(8, appt.getStartMonth());
	assertEquals(2018, appt.getStartYear());
*/
	//assertEquals("", appt.getTitle());
	//assertEquals("", appt.getDescription());

}
	@Test
	public void test08()  throws Throwable  {
		int startHour = 21;
		int startMinute=50;
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
		startHour = 11;
		startMinute=40;
		startDay=25;
		startMonth=11;
		startYear=2019;

		appt.setStartHour(startHour);
		appt.setStartMinute(startMinute);
		appt.setStartDay(startDay);
		appt.setStartMonth(startMonth);
		appt.setStartYear(startYear);

		// assertions
		assertTrue(appt.getValid());
		//assertEquals(11, appt.getStartHour());
		//assertEquals(40, appt.getStartMinute());
		//assertEquals(25, appt.getStartDay());
		//assertEquals(11, appt.getStartMonth());
		//assertEquals(2019, appt.getStartYear());
		//assertEquals("Birthday Party", appt.getTitle());
		//assertEquals("This is my birthday party.", appt.getDescription());
	}

	@Test
	public void test09()  throws Throwable  {
		int startHour = 0;
		int startMinute=50;
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
		appt.toString();

		int recurdays[] = null;
		int recurby = 1;
		int recurinc = 1;
		int recurnnum= 1;
		appt.setRecurrence(recurdays, recurby, recurinc, recurnnum);
		appt.isRecurring();

		// assertions
		assertTrue(appt.getValid());
		//assertEquals(11, appt.getStartHour());
		//assertEquals(40, appt.getStartMinute());
		//assertEquals(25, appt.getStartDay());
		//assertEquals(11, appt.getStartMonth());
		//assertEquals(2019, appt.getStartYear());
		//assertEquals("Birthday Party", appt.getTitle());
		//assertEquals("This is my birthday party.", appt.getDescription());
	}



}
