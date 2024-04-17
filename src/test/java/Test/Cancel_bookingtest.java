package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Cancel_bookingpage;

public class Cancel_bookingtest extends Baseclass {
@Test
	
	public void onlinebooking() throws Exception 
	{

		Cancel_bookingpage obj1= new Cancel_bookingpage(driver);
		obj1.cancelbooking();
		
		
	}

}
