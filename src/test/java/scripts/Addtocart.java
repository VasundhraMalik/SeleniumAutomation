package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Addtocart extends BaseClass {
@Test
public void tc1() throws FileNotFoundException, IOException {

	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.gerasButton();
	s.skillrarydemoApplication();
	
	utilies.switchTabs(driver);
	
	SkillraryDemoLogin d=new SkillraryDemoLogin(driver);
	utilies.mouseHover(driver, d.getCoursebtn());
	d.seleniumtrainingbtn();
	
	AddtocartPage a = new AddtocartPage(driver);
	utilies.doubleClick(driver, a.getAddbtn());
	a.addtocartbutton();
	utilies.alertpopup(driver);
	
	Assert.assertEquals(driver.getTitle(), pdata.getData("addtocarttitle"));
    Reporter.log(driver.getTitle(),true);
	
}

}
