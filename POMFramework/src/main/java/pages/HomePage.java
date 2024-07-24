package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver driver;
	By logo=By.xpath("(//img[@src='images/logo.png'])[1]");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean islogoDisplayed()
	{
		
		WebElement logoelement=driver.findElement(logo);
		return logoelement.isDisplayed();
	}
}



/*public HomePage(WebDriver driver)
{
this.driver=driver;

}
public void printTitle() {

System.out.println(driver.getTitle());


}*/