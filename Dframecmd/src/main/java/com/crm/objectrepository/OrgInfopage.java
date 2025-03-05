package com.crm.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgInfopage {

	WebDriver driver;
	
	public OrgInfopage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className  ="dvHeaderText")
	private WebElement orgHeader;
	
	@FindBy(xpath ="//span[contains(@id,'dtlview_Organization')]")
	private WebElement orgname;

	@FindBy(id ="mouseArea_Industry")
	private WebElement industryname;
	
	@FindBy(id ="mouseArea_Type")
	private WebElement accType;
	
	@FindBy(id ="mouseArea_Phone")
	private WebElement mobNum ;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgHeader() {
		return orgHeader;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getIndustryname() {
		return industryname;
	}

	public WebElement getAccType() {
		return accType;
	}

	public WebElement getMobNum() {
		return mobNum;
	}
}
