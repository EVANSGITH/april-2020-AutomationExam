package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategory;
import page.AddUser;
import page.LoginPage;
import util.BrowserFactory;

public class AddUserTest {
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToAddUser() throws InterruptedException,IOException {

		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);

		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(10000);
		AddUser adduser = PageFactory.initElements(driver,AddUser.class);
		 adduser.AddCategory("DANIEL");
		 adduser .clickOnAddcategory();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		

		//BrowserFactory.tearDown();
	}

}
