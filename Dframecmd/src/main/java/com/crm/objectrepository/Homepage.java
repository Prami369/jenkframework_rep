package com.crm.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//a[text()='Organizations'])[1]")
	private WebElement orglink;
	
	@FindBy(xpath ="//a[text()='Contacts']")
	private WebElement contactlink;
	
	@FindBy(xpath ="//a[text()='More']")
	private WebElement morelink;
	
	@FindBy(name ="Campaigns")
	private WebElement campaignlink;
	
	@FindBy(xpath ="//span[@class='userName']/../../td[2]")
	private WebElement adminicon;
	
	@FindBy(xpath ="//a[text()='Sign Out']")
	private WebElement signout;
	
	@FindBy(xpath ="//img[@title='vtiger-crm-logo.gif']")
	private WebElement applogo;
	
	public void logout() {
		Actions act = new Actions(driver);
//		adminicon.click();
//		signout.click();
		act.moveToElement(adminicon).perform();
		act.click(signout).perform();
	}

	public WebElement getApplogo() {
		return applogo;
	}

	public void setApplogo(WebElement applogo) {
		this.applogo = applogo;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	
	
	public void navigateTocampaignpage() {
		Actions act = new Actions(driver);
		act.moveToElement(morelink).click(campaignlink).perform();
	}
	
	

}
