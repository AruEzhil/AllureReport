package allurepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.qameta.allure.Step;

public class AppointmentSchedulingpage {
	
	
	
		

		@FindBy(id="appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
		public static WebElement appointmentbtn;
		
		@FindBy(id=("appointmentschedulingui-manageAppointmentTypes-app"))
		public static WebElement manageservice;
	

}
