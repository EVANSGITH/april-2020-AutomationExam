package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategory;
import page.LoginPage;
import util.BrowserFactory;

public class AddDuplicateCategoryValidationTest {
	public static WebDriver driver;

	@Test
	public void UserShouldNotBeAbleToAddDuplicateCategory() throws InterruptedException,IOException {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		AddCategory addCategory = PageFactory.initElements(driver,AddCategory.class);
		 addCategory.AddCategory("WORK");
		 addCategory .clickOnAddcategory();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
//	public static void takeScreenshotAtEndOfTest() throws IOException {
//		TakesScreenshot ts = ((TakesScreenshot) driver);
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		String currentDir = System.getProperty("user.dir");
//		FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//
//	}
}
