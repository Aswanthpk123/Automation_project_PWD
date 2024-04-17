package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Online_booking_page {
WebDriver driver;
	
	By Booking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]/a/strong");
	By onlinebooking=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div/nav/div/div[2]/div/div/ul/li[3]"
			+ "/div/div/div/div[1]/ul/li[4]/a");
	
	public Online_booking_page (WebDriver driver) {
		this.driver=driver;
	}
	public void onlinebooking() throws Exception
	{
		driver.findElement(Booking).click();
		driver.findElement(onlinebooking).click();
		driver.navigate().back();
			
  }

}
