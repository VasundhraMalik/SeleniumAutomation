package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(xpath="//option[@value='category.php?category=testing']")
	private WebElement testingdrp;
	
	public SkillraryDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void coursetab() {
		coursebtn.click();
	}

	
	public WebElement getCoursebtn() {
		return coursebtn;
	}

	public void seleniumtrainingbtn() {
		seleniumtraining.click();
		
	}
	
	public void testingdrp() {
		testingdrp.click();
	}
}
