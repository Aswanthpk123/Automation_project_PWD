package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Payment_status_page;

public class Payment_status_test extends Baseclass {
	@Test
	public void transactionstest() 
	{
		Payment_status_page obj=new Payment_status_page(driver);
		obj.failedtransaction();
		Payment_status_page ob=new Payment_status_page(driver);
		ob.successtransaction();
		
	}

}
