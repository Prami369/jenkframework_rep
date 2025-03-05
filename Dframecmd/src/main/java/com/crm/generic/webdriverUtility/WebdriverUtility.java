package com.crm.generic.webdriverUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	public void waitforPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void WaitforElementToBePresent(WebDriver driver, WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchTonewWindow(WebDriver driver, String partialurl) {
		Set<String> ids = driver.getWindowHandles();
		for(String id: ids) {	
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains(partialurl)) {
				break;
			}
		}
	}
	
	public void ToSelectByvtext(WebElement ele, String text) {
		Select dp = new Select(ele);
		dp.selectByVisibleText(text);
	}
	public void ToSelectByindex(WebElement ele, int index) {
		Select dp = new Select(ele);
		dp.selectByIndex(index);
	}
	public void ToSelectByvalue(WebElement ele, String value) {
		Select dp = new Select(ele);
		dp.selectByValue(value);
	}
	
	public void switchToFrameByIndex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameByWebElement(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void switchToFrameBynameORId(WebDriver driver, String nameORId) {
		driver.switchTo().frame(nameORId);
	}
	
	public void moveToElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void doubleClickonElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public void rightclickOnElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	public void clickOnElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
	}
	
	public void clickandHold(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.clickAndHold(ele).perform();
	}
	
	
	
	
	
}
