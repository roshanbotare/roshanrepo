package com.nt.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import com.nt.service.CalcalutionService;

@DisplayName("CalulationTest class")
@TestMethodOrder(value =OrderAnnotation.class) 
public class CalulationTest {	
private static CalcalutionService service;	
	
   @BeforeAll
	public static  void setUpOnce() {
		System.out.println("CalulationTest.setUpOnce() method ::");
		service=new CalcalutionService();
	}
	
	@Test
	@Order(1)
	@DisplayName("testing with small integer number")
	public void testAdditionWithSmallNumber() {
		System.out.println("CalulationTest.testAdditionWithSmallNumber()  ");
		int actual = service.addintion(10, 10);
		int expected = 20;
		assertEquals(expected, actual, " may be reuslt not match   ");
    }
	
	@Test
	@Order(2)
	@DisplayName("testing with Big integer number")
	public void testAdditionWithBigNumber() {
		System.out.println("CalulationTest.testAdditionWithBigNumber()  ");
		int actual = service.addintion(100, 100);
		int expected = 200;
		assertEquals(expected, actual, " may be reuslt not match   ");
   }
	
	@Test
	@Order(4)
	@DisplayName("testing with zero ")
	public void testAdditionWithZero() {
		System.out.println("CalulationTest.testAdditionWithZero()  ");
		int actual = service.addintion(0, 0);
		int expected = 0;
		assertEquals(expected, actual, " may be reuslt not match   ");

	 }

	
	@Test
	@Order(3)
	@DisplayName("testing with nigative number ")
	public void testAdditionWithNigativeNumber() {
		System.out.println("CalulationTest.testAdditionWithZero()  ");
		int actual = service.addintion(-12, -12);
		int expected = -24;
		assertEquals(expected, actual, " may be reuslt not match   ");

	}

	
	@AfterAll
	  public static void clearOnce() {
		  System.out.println("CalulationTest.clearOnce() method :: ");
		  service=null;
	  }
	

}
