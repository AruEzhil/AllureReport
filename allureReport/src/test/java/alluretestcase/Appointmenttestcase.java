package alluretestcase;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import allureReport.ListenerClass;
import allurepage.AppointmentSchedulingpage;
import allurepage.LoginPage;
import allurepage.ManageServiceType;
import baseclass.Commonfunction;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
@Listeners(ListenerClass.class)
//Allure Annotation
//@Description - Detailed Description
//@Severity(SeverityLevel.CRITICAL)
//@Story("Story Description")
//@Step("")
//@Attachment


public class Appointmenttestcase extends Commonfunction {
	@Step("Open url-Enter Password-Enter url-impatient ward-clicl login button")

	public void login() {
		String USE=properties.getProperty("username");
		String PASS=properties.getProperty("password");
		
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.username.sendKeys(USE);
		LoginPage.password.sendKeys(PASS);
		LoginPage.ImpatientWard.click();
		LoginPage.Loginbtn.click();
		
	}
    @Step("click the appointmentbtn and manageservice btn")
	public void schedule() {
		
		
		PageFactory.initElements(driver, AppointmentSchedulingpage.class);
		
		
		
		
		AppointmentSchedulingpage.appointmentbtn.click();
		AppointmentSchedulingpage.manageservice.click();
		
	}
	
	
	
	@Description("Validate the contents of Manage Service Type Table" )
	@Severity(SeverityLevel.CRITICAL)
	@Story("us_001-Login--->schedule---> table")
	@Test
  public void table() {
	login();
	schedule();
		PageFactory.initElements(driver, ManageServiceType.class);
		int headersize=ManageServiceType.header.size();
		System.out.println("header size is="+headersize);
		int rowsize=ManageServiceType.row.size();
		System.out.println("row size is="+rowsize);
		String actual=ManageServiceType.firstrow.getText();
		System.out.println("text is="+actual);
		String expected="Dermatology Details";
		Assert.assertEquals(actual, expected);
			//finally	
		
	
	
	}
}
