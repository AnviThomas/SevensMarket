package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePage {
	WebDriver driver;
	By table = By.xpath("//a[contains(text(),'Table')]");
	By tabletitle = By.xpath("//div[contains(text(),'Table with Pagination Example')]");

	@FindBy(xpath = "//div[@id='dtBasicExample_wrapper']//tbody//tr//td[1]")
	List<WebElement> tNameElements;
	@FindBy(xpath = "//a[@class='nav-link']")
	List<WebElement> headerLinkElements;

	UtilityClass utilityclass = new UtilityClass();

	public TablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickonTable() {
		WebElement tableelement = driver.findElement(table);
		tableelement.click();
	}

	public String getTabletitle() {
		WebElement title = driver.findElement(tabletitle);

		return title.getText();
	}

	public List<String> getNames() {
		List<String> names = new ArrayList<String>();
		names = utilityclass.get_TextofElements(tNameElements);
		return names;
	}

	public List<String> printHeaderLinkElements() {
		List<String> headers = new ArrayList<String>();
		headers = utilityclass.get_TextofElements(headerLinkElements);
		return headers;
	}

	public void getOfficeofperson(String personname) {
		List<String> names = new ArrayList<String>();
		names = utilityclass.get_TextofElements(tNameElements);

		int index = 0;
		for (index = 0; index < tNameElements.size(); index++) {
			if (personname.equals(names.get(index))) {
				index++;
				break;
			}
		}
		
		WebElement officeelement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[3]"));
		System.out.println(officeelement.getText());
		
	}
	public String getageofperson(String personname)
	
	{
		List<String> names = new ArrayList<String>();
		names = utilityclass.get_TextofElements(tNameElements);
		
		int index = 0;
		for (index = 0; index < tNameElements.size(); index++) {
			if (personname.equals(names.get(index))) {
				index++;
				break;
			}
		}
	
		WebElement ageelement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[4]"));
	return ageelement.getText();
	}
	
	
	}