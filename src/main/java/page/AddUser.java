package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddUser {
WebDriver driver;
	
	public AddUser(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.NAME, using = "data") WebElement ADDNAME_FIELD_LOCATOR;
     @FindBy(how =How.XPATH,using="/html/body/div[4]/input[2]")WebElement ADDUSER_FIELD_LOCATOR;
	
	
	//Interactive Methods
	public void AddCategory(String NAME) {
		ADDNAME_FIELD_LOCATOR.sendKeys(NAME);
	}

	public void clickOnAddcategory() {
		ADDUSER_FIELD_LOCATOR.click();
		
	}


}
