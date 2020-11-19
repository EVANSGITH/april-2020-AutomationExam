package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleKeyValidation extends BasePage{
WebDriver driver;
	
	public ToggleKeyValidation(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.NAME, using = "allbox") WebElement TOOGLE_FIELD_LOCATOR;
	
	
	
	//Interactive Methods
	public void clickOnToggleall() {
		TOOGLE_FIELD_LOCATOR.click();
		
	
	}
	
	


}
