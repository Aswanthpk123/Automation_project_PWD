package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cancel_bookingpage {
WebDriver driver;
	
	By Booking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	
	By cancelbooking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]"
			+ "/div/div/div/div[1]/ul/li[5]/a");
	
	public Cancel_bookingpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	

	
	public void cancelbooking() throws Exception
	{
	 driver.findElement(Booking).click();
	 driver.findElement(cancelbooking).click();
	 driver.findElement(By.id("applnBookingID")).sendKeys("125636985478569");	
	 driver.findElement(By.xpath("//*[@id=\"btn_get_otp\"]"));
	 driver.navigate().back();
	 
	}


}
