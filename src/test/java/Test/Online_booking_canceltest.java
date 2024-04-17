package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Online_booking_cancelpage;

public class Online_booking_canceltest extends Baseclass {
	@Test
	public void statuscancelonlinebooking()
	{
		Online_booking_cancelpage obj=new Online_booking_cancelpage(driver);
		obj.status();
	}


}
