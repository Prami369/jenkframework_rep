package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfopage {
WebDriver driver;
	
	public ContactInfopage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="dtlview_Support Start Date")
	private WebElement actstartDate;
	
	@FindBy(id ="dtlview_Support End Date")
	private WebElement actendDate;

	@FindBy(id ="dtlview_Last Name")
	private WebElement actlastname;
	
	@FindBy(id ="mouseArea_Organization Name")
	private WebElement actorgnameinContact;
	
	@FindBy(className ="dvHeaderText")
	private WebElement contactHeader;
	
	
	public WebElement getContactHeader() {
		return contactHeader;
	}

	public WebElement getActstartDate() {
		return actstartDate;
	}

	public WebElement getActendDate() {
		return actendDate;
	}

	public WebElement getActlastname() {
		return actlastname;
	}

	public WebElement getOrgnameincontact() {
		return actorgnameinContact;
	}

}
