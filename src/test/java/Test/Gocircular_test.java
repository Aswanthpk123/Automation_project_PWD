package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Gocircular_page;

public class Gocircular_test extends Baseclass {
	@Test
	public void gocirculartest() throws Exception {
		
		 Gocircular_page ob=new  Gocircular_page(driver);
		 ob.clickgocircular();
		 Gocircular_page obj=new  Gocircular_page(driver);
		 obj.Goorder();
		 Gocircular_page obc=new  Gocircular_page(driver);
		 obc.circulars();
		 
	}

}
