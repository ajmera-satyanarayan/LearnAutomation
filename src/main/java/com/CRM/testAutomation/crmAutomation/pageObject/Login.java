package com.CRM.testAutomation.crmAutomation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	WebDriver driver;
	
	@FindBy(xpath="//input[@ng-model='User.Username']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@ng-model='User.Password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@ng-click='authenticate()']")
	WebElement LoginButton;
	
	@FindBy(xpath="//center[@class='valid_error']")
	WebElement AuthenticationFailedMessage;
	
}
