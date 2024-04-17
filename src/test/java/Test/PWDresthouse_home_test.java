package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.PWDresthouse_home_searchpage;

public class PWDresthouse_home_test extends Baseclass {
    @Test
	
	public void search() throws Exception {
		
		 PWDresthouse_home_searchpage ob=new  PWDresthouse_home_searchpage(driver);
		 PWDresthouse_home_searchpage obdate=new  PWDresthouse_home_searchpage(driver);
		 PWDresthouse_home_searchpage obtitle=new  PWDresthouse_home_searchpage(driver);
		 PWDresthouse_home_searchpage obscroll=new  PWDresthouse_home_searchpage(driver);
		 ob.titleverification();
		 ob.search();
		 obdate.datepicker();
		 obscroll.scrolldown();
		
	} 

}
