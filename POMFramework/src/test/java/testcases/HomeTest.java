package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass{

	HomePage homepage;
	
	@Test
	public void verifylogo() {
		
		homepage=new HomePage(driver);
		//System.out.println(driver.getTitle());
		
	Assert.assertTrue(homepage.islogoDisplayed());
	}
}
