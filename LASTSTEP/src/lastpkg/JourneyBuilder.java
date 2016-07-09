package lastpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JourneyBuilder {
	
	
	FirefoxDriver f;
	@BeforeMethod
	public void betmet(){
		
		f=new FirefoxDriver();
		f.get("https://mc.s1.qa3.exacttarget.com");
		
	}
	
	@Test
	public void lastMethod(){
		f.findElementById("username").sendKeys("DB500.ent2.s1qa3@v5.com");
		f.findElementById("password").sendKeys("testing1!");
		f.findElementByXPath("//input[@value='Login']").click();
		
		f.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Actions act=new Actions(f);
		
		act.moveToElement(f.findElementByXPath("//div[@class='mc-app-switcher-container']/ul[1]/li[2]/ul[1]/li[2]/div[1]/span[1]")).perform();
		f.findElementByXPath("//span[text()='Journey Builder']").click();
		try{
			
			f.findElementByXPath(".//*[@id='add-program']").click();
		}
		
		catch(Exception e){
			
			f.switchTo().frame("canvas-c8c802af-5390-4e47-b0d9-b199f21ca301");
			f.findElementByXPath("//button[text()='Get Started']").click();
			f.findElementByXPath(".//*[@id='add-program']").click();
		}
		
		act.dragAndDrop(f.findElementByXPath("//div[@class='activity-list']/div[2]/div[1]/div[1]/div[1]"), f.findElementByXPath("//div[@class='canvas-scroll-pane']/div[1]/div[1]/div[1]/div[1]/div[1]")).perform();
		
		
		
	//	f.switchTo().frame("canvas-c8c802af-5390-4e47-b0d9-b199f21ca301");
		//f.findElementByXPath(".//*[@id='add-program']").click();
		
		
		
		
	}

}
