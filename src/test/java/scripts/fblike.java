package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryDemoTesting;
import pomPages.SkillraryLoginPage;

public class fblike extends BaseClass{
	@Test
	
	public static void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrarydemoApplication();
		
		utilies.switchTabs(driver);
				
		SkillraryDemoLogin d=new SkillraryDemoLogin(driver);
		d.testingdrp();
		
		SkillraryDemoTesting td=new SkillraryDemoTesting(driver);
		td.fbicon();
		
			
		
		
		
		
		
		
	}
	

}
