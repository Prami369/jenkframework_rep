package com.crm.campaigntest;

import java.io.IOException;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

import com.crm.basetestutility.Basetest;
import com.crm.objectrepository.Homepage;


public class campaignTest extends Basetest{
	

	@Test
	public void navigatetoCampaignPageTest() throws IOException {	
		Homepage hp = new Homepage(driver);
		hp.navigateTocampaignpage();
		
}
	}
