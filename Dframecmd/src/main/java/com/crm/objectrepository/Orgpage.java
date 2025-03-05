package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orgpage {
	WebDriver driver;
	
	public Orgpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrglink;
	
	@FindBy(xpath ="//input[@name='search_text']")
	private WebElement orgSeachbox;
	
	@FindBy(xpath ="//select[@id='bas_searchfield']")
	private WebElement orgSearchDrpdown;
	
	@FindBy(xpath ="//input[@value=' Search Now ']")
	private WebElement searchbtn;
	
	

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getOrgSeachbox() {
		return orgSeachbox;
	}

	public WebElement getOrgSearchDrpdown() {
		return orgSearchDrpdown;
	}

	public WebElement getCreateOrglink() {
		return createOrglink;
	}
	

}
