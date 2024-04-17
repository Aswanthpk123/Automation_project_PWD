package Test;

import org.testng.annotations.Test;

import Base_class.Baseclass;
import Pages.Feedback_page;

public class Feedback_test extends Baseclass {
	@Test
	public void feedbacktest()
	{
		Feedback_page obj=new Feedback_page(driver);
		obj.gotofeedback();
	}

}
