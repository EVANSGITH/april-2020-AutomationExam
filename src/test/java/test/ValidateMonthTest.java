package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ValidateMonth;
import util.BrowserFactory;

public class ValidateMonthTest {
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToSeeAllTwelveMonth() throws InterruptedException,IOException {

		driver = BrowserFactory.init();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		ValidateMonth validatemonth = PageFactory.initElements(driver, ValidateMonth.class);
		 validatemonth.clickONDUEMONTH();
		 validatemonth.clickOnJAN();
		 Thread.sleep(1000);
		 validatemonth.clickOnFeb();
		 Thread.sleep(1000);
		 validatemonth.clickOnMar();
		 Thread.sleep(1000);
		 validatemonth.clickOnApril();
		 Thread.sleep(1000);
		 validatemonth.clickOnMay();
		 Thread.sleep(1000);
		 validatemonth.clickOnJun();
		 Thread.sleep(1000);
		 validatemonth.clickOnJul();
		 Thread.sleep(1000);
		 validatemonth.clickOnAug();
		 Thread.sleep(1000);
		 validatemonth.clickOnSep();
		 Thread.sleep(1000);
		 validatemonth.clickOnOct();
		 Thread.sleep(1000);
		 validatemonth.clickOnNov();
		 Thread.sleep(1000);
		 validatemonth.clickOnDec();
		 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	}

}
