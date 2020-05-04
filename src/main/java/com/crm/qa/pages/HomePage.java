package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	//String name = "Prashant Dubey";
	@FindBy(xpath = "//span[contains(text(),'Prashant Dubey')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);		
	}
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public ContactsPage clickContacts()
	{
		contactsLink.click();
		return new ContactsPage();
	}
	public DealsPage clickDeals()
	{
		dealsLink.click();
		return new DealsPage();
	}
	public TasksPage clickTasks()
	{
		tasksLink.click();
		return new TasksPage();
	}
	
}
