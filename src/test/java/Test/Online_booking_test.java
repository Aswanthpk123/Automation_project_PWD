package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Online_booking_page;

public class Online_booking_test extends Baseclass {
	@Test
	public void onlinetest() throws Exception 
	{
		 Online_booking_page ob=new  Online_booking_page(driver);
		 ob.onlinebooking();
	}

}
