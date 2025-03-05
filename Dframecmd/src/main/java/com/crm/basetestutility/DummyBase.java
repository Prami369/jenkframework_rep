package com.crm.basetestutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DummyBase {
	
	@BeforeClass
	public void ConfigBC(){
		System.out.println("BC");
	}
	
	@AfterClass
	public void ConfigAC(){
		System.out.println("AC");
	}
	
	@AfterMethod
	public void ConfigAM(){
		System.out.println("AM");
	}
	
	@BeforeMethod
	public void ConfigBM(){
		System.out.println("BM");
	}
	
	@BeforeSuite
	public void ConfigBS(){
		System.out.println("BS");
	}
	
	@AfterSuite
	public void ConfigAS(){
		System.out.println("AS");
	}
	
	@AfterTest
	public void ConfigAT(){
		System.out.println("AT");
	}
	
	@BeforeTest
	public void ConfigBT(){
		System.out.println("BT");
	}

	public void demo() {
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./advanceReports/report.html");
		spark.config().setDocumentTitle("CRM test suit result");
		spark.config().setReportName("crm report");
//		spark.config().setTheme(null)
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("os", "window-10");
		report.setSystemInfo("browser", "chrome-10");
		ExtentTest test =report.createTest("");
		test.log(Status.INFO, "login to app");
	}
}
