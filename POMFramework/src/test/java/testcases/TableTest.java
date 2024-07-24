package testcases;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;

import pages.TablePage;


public class TableTest extends BaseClass{ 
	
		TablePage tablepage;
		@Test

		public void verifytableheader()

		{
			tablepage=new TablePage(driver);
			tablepage.clickonTable();
			String actualtitle="Table with Pagination Example";
			String expectedtitle=tablepage.getTabletitle();
			
			Assert.assertEquals(actualtitle, expectedtitle);
		}
		
		@Test
		  public void verifyTableNames()
		  {
		    tablepage=new TablePage(driver);
		    tablepage.clickonTable();
		    List<String> actualTableNames=tablepage.getNames();
		    System.out.println(actualTableNames);
		    List<String> expectedTableNames=Arrays.asList("Tiger Nixon", "Garrett Winters", "Ashton Cox", "Cedric Kelly", "Airi Satou", "Brielle Williamson", "Herrod Chandler", "Rhona Davidson", "Colleen Hurst", "Sonya Frost");
		    Assert.assertEquals(actualTableNames, expectedTableNames);
		  
		  }
		@Test
		  public void verifyHeaders()
		  {
		    tablepage=new TablePage(driver);
		    List<String> actualHeaders=tablepage.printHeaderLinkElements();
		    System.out.println(actualHeaders);
		    List<String> expectedHeaders=Arrays.asList("HOME", "INPUT FORM", "DATE PICKERS", "TABLE", "PROGRESS BARS", "ALERTS AND MODALS", "LIST BOX", "OTHERS");
		    Assert.assertEquals(actualHeaders, expectedHeaders);
		    }
		@Test
		public void getOfficeofperson()
		{
			tablepage=new TablePage(driver);
			tablepage.clickonTable();
			tablepage.getOfficeofperson("Ashton Cox");
			
		}
		@Test
		public void getageofperson()
		{
			tablepage=new TablePage(driver);
			tablepage.clickonTable();
			String actual=tablepage.getageofperson("Brielle Williamson");
			String expected="61";
			System.out.println(actual);
			Assert.assertEquals(actual, expected);
			
		}
}