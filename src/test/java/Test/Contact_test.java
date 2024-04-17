package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Contact_page;

public class Contact_test extends Baseclass {
	@Test
	public void gotocontacttest()
	{
		
		Contact_page obj=new Contact_page (driver);
		obj.gotocontact();
	}

}
