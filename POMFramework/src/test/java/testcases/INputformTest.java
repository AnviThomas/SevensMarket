package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputPage;

public class INputformTest extends BaseClass{
InputPage inputpage;

@Test
public void verifyheader()
{
	inputpage=new InputPage(driver);
	inputpage.clickoninputform();
	
	String ExpectedHeader="Single Input field";
	String ActualHeader=inputpage.getinputformheader();
	Assert.assertEquals(ActualHeader, ExpectedHeader);
}
}
