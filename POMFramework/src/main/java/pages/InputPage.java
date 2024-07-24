package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputPage {

	WebDriver  driver;
	By inputformlink=By.xpath("//a[contains(text(),'Input Form')]");
	By inputheader=By.xpath("//a[contains(text(),'Single Input Field')]");
	
	public InputPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickoninputform()
	{
		WebElement inputelement=driver.findElement(inputformlink);
		inputelement.click();
	}
	public String getinputformheader()
	{
		WebElement header=driver.findElement(inputheader);
		return header.getText();
	}
}
