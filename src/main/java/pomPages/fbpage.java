package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbpage {
	
	@FindBy(xpath="((//button[@type='submit'])[2]")
	private WebElement likeicon;
	
	public fbpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void likeicon() {
		likeicon.click();
		
	}

}
