package alluretestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import allurepage.ManageServiceType;
import baseclass.Commonfunction;

public class ManageTableTestcase extends Commonfunction {
	
	
	public void table() {
		
		PageFactory.initElements(driver, ManageServiceType.class);
		int headersize=ManageServiceType.header.size();
		System.out.println("header size is="+headersize);
		int rowsize=ManageServiceType.row.size();
		System.out.println("row size is="+rowsize);
		String text=ManageServiceType.firstrow.getText();
		System.out.println("text is="+text);
		if(text.contains("Derma")) {
		  System.out.println("true");
		}else
		{
			System.out.println("false");
		}
		
		
		
		
	}

}
