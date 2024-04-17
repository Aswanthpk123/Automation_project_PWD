package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Rest_house_page;

public class Rest_house_test extends Baseclass {
	@Test
	public void clickresthousetest() {
		Rest_house_page obj=new Rest_house_page(driver);
		obj.clickresthouse();
		Rest_house_page obj1=new Rest_house_page(driver);
		obj1.choosedistrict();
		Rest_house_page obj2=new Rest_house_page(driver);
		obj2.resthouseroom();
		Rest_house_page obj3=new Rest_house_page(driver);
		obj3.googlemapopen();
		
		
	}

}
