package com.crm.orgtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.basetestutility.Basetest;
import com.crm.objectrepository.CreateOrgpage;
import com.crm.objectrepository.Homepage;
import com.crm.objectrepository.OrgInfopage;
import com.crm.objectrepository.Orgpage;

import java.io.IOException;
import java.lang.reflect.Method;
import org.openqa.selenium.By;


public class OrganizationmoduleTest extends Basetest {

//

	@Test(groups = "regression")
	public void CreateOrgwithPhonenum(Method test) throws IOException {
		String orgname = "fhfd47785" + jutil.getRandomNumber();
		String mobnum = eutil.getDtaFromExcel("sheet2", 5, 3);

		Homepage hp = new Homepage(driver);
		hp.getOrglink().click();

		Orgpage orgpage = new Orgpage(driver);
		orgpage.getCreateOrglink().click();

		CreateOrgpage createorgpage = new CreateOrgpage(driver);
		createorgpage.createOrg(orgname, mobnum);

		OrgInfopage orgInfopage = new OrgInfopage(driver);
		Assert.assertEquals(orgInfopage.getOrgname().getText().trim(), orgname);
		Assert.assertEquals(orgInfopage.getMobNum().getText().trim(), mobnum);
		Reporter.log(test.getName() + " verified==pass", true);
	}

	@Test(groups = "regression")
	public void CreateOrgwithIndustry(Method test) throws IOException {
		String orgname = "fhfd47785" + jutil.getRandomNumber();
		String industryName = eutil.getDtaFromExcel("sheet2", 3, 3);
		String industrytype = eutil.getDtaFromExcel("sheet2", 3, 4);

		Homepage hp = new Homepage(driver);
		hp.getOrglink().click();

		Orgpage orgpage = new Orgpage(driver);
		orgpage.getCreateOrglink().click();

		CreateOrgpage createorgpage = new CreateOrgpage(driver);
		createorgpage.createOrg(orgname, industryName, industrytype);

		OrgInfopage orgInfopage = new OrgInfopage(driver);
		Assert.assertEquals(orgInfopage.getOrgname().getText().trim(), orgname);
		Assert.assertEquals(orgInfopage.getIndustryname().getText().trim(), industryName);
		Assert.assertEquals(orgInfopage.getAccType().getText().trim(), industrytype);
		Reporter.log(test.getName() + " verified==pass", true);
	}


	@Test
	public void verifylogo(Method test) throws IOException, InterruptedException {
		Homepage hp = new Homepage(driver);
		Assert.assertTrue(hp.getApplogo().isDisplayed());
		Reporter.log(test.getName() + " verified==pass", true);
	}

}
