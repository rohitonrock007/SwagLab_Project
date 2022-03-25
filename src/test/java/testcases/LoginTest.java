package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{

	
	@Test
	public void LoginFailiureTest() {
		
//		test = report.startTest("LoginFailiureTest");
		
		LoginPage login = new LoginPage();
		
		login.LoginFunction("standard_user","standard_user");
		
		WebElement ErrorMsg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")); 
		
		String ActualMsg = ErrorMsg.getText();
		
		String ExpMsg = "Epic sadface: Username and password do not match any user in this service";
		
		Assert.assertEquals(ActualMsg, ExpMsg);//hard assertion
	}
//		report.endTest(test);
		
//		if(ActualMsg.equals(ExpMsg)) {
//			System.out.println("TC Passed");
//		}else {
//			System.out.println("TC Failed");
//		}
		
	@Test
	public void LoginSucessTest() {
//		test = report.startTest("LoginSucessTest");
		LoginPage login = new LoginPage();
		login.LoginFunction("standard_user", "secret_sauce");
		
//		report.endTest(test);

	}

	}

