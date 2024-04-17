package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Booking_page;

public class Booking_test extends Baseclass {
	@Test
	public void checkbooking() throws Exception {
		
		Booking_page obj=new Booking_page(driver);
		obj.clickbookng();
		Booking_page obj1=new Booking_page(driver);
		obj1.checkbookingpage();
		
		
		
		
		 
		 
		 
	}

}
