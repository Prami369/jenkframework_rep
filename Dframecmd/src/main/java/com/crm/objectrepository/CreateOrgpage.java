package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateOrgpage {

WebDriver driver;
	
	public CreateOrgpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="phone")
	private WebElement mobnumtextfield;
	
	@FindBy(name="industry")
	private WebElement industryDrpdown;
	
	@FindBy(name="accounttype")
	private WebElement accTypeDrpdown;
	
	@FindBy(xpath ="//input[@name='accountname']")
	private WebElement orgnametxtfield;
	
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	
	public void createOrg(String orgname) {
		orgnametxtfield.sendKeys(orgname);
		savebtn.click();
	}
	
	public void createOrg(String orgname, String mobnum) {
		orgnametxtfield.sendKeys(orgname);
		mobnumtextfield.sendKeys(mobnum);
		savebtn.click();
	}
	
	public void createOrg(String orgname, String industry, String type) {
		orgnametxtfield.sendKeys(orgname);
		Select indusDp=new Select(industryDrpdown);
		indusDp.selectByVisibleText(industry);
		Select acctypeDp=new Select(accTypeDrpdown);
		acctypeDp.selectByVisibleText(type);
		savebtn.click();
	}
	
	
	
	
}
