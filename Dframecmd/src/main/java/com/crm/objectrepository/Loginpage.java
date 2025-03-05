package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.crm.generic.webdriverUtility.WebdriverUtility;
/**
 * @author Prami
 * 
 * contains login page elements and business lib like login
 */
public class Loginpage extends WebdriverUtility {
	WebDriver driver;
	
	//Autohealing (OR)
	@FindAll({@FindBy(name="user_nam"), @FindBy(xpath="//input[@name='user_name']"), @FindBy(xpath="//input[@type='text']")})
	private WebElement usernametxtfield1;
	
	//Autohealing (And)
	@FindBys({@FindBy(name="user_nam"), @FindBy(xpath="//input[@name='user_name']"), @FindBy(xpath="//input[@type='text']")})
	private WebElement usernametxtfield2;
	
	@FindBy(name="user_name")
	private WebElement usernametxtfield;
	
	@FindBy(name="user_password")
	private WebElement userpwdtxtfield;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;

public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

/** 
 * login to application based on below credentials
 * @param url
 * @param username
 * @param pwd
 */
public void login(String url, String username, String pwd) {
	driver.get(url);
	waitforPageLoad(driver);
	usernametxtfield.sendKeys(username);
	userpwdtxtfield.sendKeys(pwd);
	loginbtn.click();
}







}