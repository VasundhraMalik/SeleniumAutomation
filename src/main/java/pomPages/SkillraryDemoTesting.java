package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoTesting {

	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbicon;
	
	public SkillraryDemoTesting(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void fbicon() {
		fbicon.click();
	}
	
}
