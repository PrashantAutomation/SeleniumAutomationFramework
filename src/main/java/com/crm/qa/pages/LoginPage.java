package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory or object repository
	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement login;
	
    @FindBy(name="email")
    WebElement email;
    
    @FindBy(name = "password")
    WebElement pass;
    
    @FindBy(xpath = "//form//div//div[contains(text(),'Login')]")
    WebElement loginButton;
    
    //initializing page objects
    public LoginPage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateLoginPageTitle()
    {
    	return driver.getTitle();
    }
    public HomePage login(String un, String pwd)
    {
    	email.sendKeys(un);
    	pass.sendKeys(pwd);
    	loginButton.click();
    	return new HomePage();
    }
}
