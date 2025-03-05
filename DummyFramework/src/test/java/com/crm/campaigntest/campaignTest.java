package com.crm.campaigntest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.basetestutility.Basetest;
import com.crm.generic.fileUtility.ExcelUtility;
import com.crm.generic.fileUtility.PropFileutility;
import com.crm.generic.webdriverUtility.JavaUtility;
import com.crm.generic.webdriverUtility.WebdriverUtility;
import com.crm.objectrepository.Homepage;
import com.crm.objectrepository.Loginpage;

public class campaignTest extends Basetest{
	

	@Test
	public void navigatetoCampaignPageTest() throws IOException {	
		Homepage hp = new Homepage(driver);
		hp.navigateTocampaignpage();
	//	
}}
