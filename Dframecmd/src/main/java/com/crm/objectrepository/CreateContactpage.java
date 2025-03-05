package com.crm.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.generic.webdriverUtility.WebdriverUtility;

public class CreateContactpage extends WebdriverUtility{
	WebDriver driver;

	public CreateContactpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='account_name']/..//img[@title='Select']")
	private WebElement orgnamelukup;
	
	@FindBy(name = "lastname")
	private WebElement lastnametxtfield;

	@FindBy(id = "jscal_field_support_start_date")
	private WebElement startDatetxtfield;

	@FindBy(id = "jscal_field_support_end_date")
	private WebElement endDatetxtfield;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	@FindBy(id = "search_txt")
	private WebElement searchtextfield;

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}
	public WebElement getOrgnamelukup() {
		return orgnamelukup;
	}
	public WebElement getLastnametxtfield() {
		return lastnametxtfield;
	}
	public WebElement getStartDatetxtfield() {
		return startDatetxtfield;
	}
	public WebElement getEndDatetxtfield() {
		return endDatetxtfield;
	}

	public void createContact(String lastname) {
		lastnametxtfield.sendKeys(lastname);
		savebtn.click();
	}

	public void createContact(String lastname, String startdate, String enddate) {
		lastnametxtfield.sendKeys(lastname);
		startDatetxtfield.clear();
		startDatetxtfield.sendKeys(startdate);
		endDatetxtfield.clear();
		endDatetxtfield.sendKeys(enddate);
		savebtn.click();
	}

	public void createContact(String lastname, String orgname) {
		lastnametxtfield.sendKeys(lastname);
		orgnamelukup.click();
		switchTonewWindow(driver, "Accounts&action");
		searchtextfield.sendKeys(orgname, Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='" + orgname + "']")).click();
		switchTonewWindow(driver, "Contacts&action");
		savebtn.click();

	}

}
