package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtilityClass {
	public String get_Atribute(WebElement element,  String atribute)
	{
		return element.getAttribute(atribute);
	}
	
	public String get_CssValue(WebElement element, String attribute)
	  {
	    return element.getCssValue(attribute);
	  }
	  
	 public List<String> get_TextofElements(List<WebElement> elements)
	  {
	     List<String> datas=new ArrayList<String>();
	     for(WebElement element: elements)
	     {
	       datas.add(element.getText());
	     }
	     
	     return datas;
	  }
	}