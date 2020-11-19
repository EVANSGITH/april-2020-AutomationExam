package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategory;
import page.LoginPage;
import util.BrowserFactory;

public class AddCategoryTest {
	WebDriver driver;

	@Test
	public void UserShouldBeAddCategory() throws InterruptedException,IOException {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		AddCategory addCategory = PageFactory.initElements(driver,AddCategory.class);
		 addCategory.AddCategory("WORK");
		 addCategory .clickOnAddcategory();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

		//BrowserFactory.tearDown();
	}

}
