package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepo {
	@FindBy(id="login-link") WebElement lnkLogin;
	@FindBy(xpath="//input[@type='text']") WebElement tfieldUsername;
	@FindBy(xpath="//input[@type='password']") WebElement tfieldPassword;
	@FindBy(xpath="//button[contains(.,'Submit')]") WebElement btnSubmit;
	@FindBy(id="logout-trigger") WebElement lnkLogout;
	
	ObjectRepo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fillLogin(String uname,String pwd)
	{
		lnkLogin.click();
		tfieldUsername.sendKeys(uname);
		tfieldPassword.sendKeys(pwd);
		btnSubmit.click();
	}

}





		
	




