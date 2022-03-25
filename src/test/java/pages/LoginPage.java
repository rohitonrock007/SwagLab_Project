package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {

WebDriver driver=BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	//=============WebElement=============Page Factory====
//	@FindBy(className="login")
//	WebElement LoginLink;
	
	@FindBy(name="user-name")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="login-button")
	WebElement LoginBtn;
	
//	@FindBy(className="rememberMe")
//	WebElement RememberMe;
	
	//constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
public void LoginFunction(String UserNameval, String Passwordval) {
		
	
		
//	LoginLink.click();
//	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	UserName.sendKeys(UserNameval);
	test.log(LogStatus.PASS, "Enter UserName", "Name Entered successfully");
	Password.sendKeys(Passwordval);
	test.log(LogStatus.PASS, "Enter Password", "Password Entered successfully");
//	RememberMe.click();
//	test.log(LogStatus.PASS, "Click on Rememberme", "Rememberme clicked successfully");
	LoginBtn.click();
	test.log(LogStatus.PASS, "Click on Loginbtn", "Loginbtn clicked successfully");
	
}
	
}
