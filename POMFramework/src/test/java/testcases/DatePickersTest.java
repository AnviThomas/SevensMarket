package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.DatePickers;

public class DatePickersTest extends BaseClass{
DatePickers datepicker;
	@Test
	public void verifydatepickerpage()
	{
		datepicker=new DatePickers(driver);
		datepicker.clickondatepickers();
		
	}
	@Test
	public void validateLogoAttribute()
	{
		
		datepicker=new DatePickers(driver);
		datepicker.clickondatepickers();
		
		String Actualdata=datepicker.getSrcoflogo();
		System.out.println(Actualdata);
		String Expecteddata="https://selenium.qabible.in/images/logo.png";
		Assert.assertEquals(Actualdata, Expecteddata);
	}
	
}
