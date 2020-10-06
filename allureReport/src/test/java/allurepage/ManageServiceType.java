package allurepage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ManageServiceType {
	
	@FindBys(@FindBy(tagName="th"))
	public static List<WebElement> header;
	
	@FindBys(@FindBy(tagName="tr"))
	public static List<WebElement> row;
	
	@FindBy(xpath="//table[@id='appointmentTypesTable']/tbody/tr/td[1]")
	public static WebElement firstrow;
	
	

}
