package allurepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id="username")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="Inpatient Ward")
	public static WebElement ImpatientWard;
	
	@FindBy(id="loginButton")
	public static WebElement Loginbtn;

}
