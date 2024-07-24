package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class DatePickers {
	WebDriver  driver;
	//pagefactory method
	@FindBy(xpath="//a[contains(text(),'Date Pickers')]")
	WebElement datepickerslink;
	@FindBy(xpath="//img[@src='images/logo.png'])[1]")
	WebElement datepickerlogo;
	
	UtilityClass utilities= new UtilityClass();
	public DatePickers(WebDriver driver)
	{
		//can be used inside constructor and method but one more code is given
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickondatepickers()
	{
		datepickerslink.click();
	}
	public String getSrcoflogo()
	{
		return utilities.get_Atribute(datepickerlogo, "src");
	}
}
