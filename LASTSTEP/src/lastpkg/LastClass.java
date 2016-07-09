package lastpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LastClass {
	
	FirefoxDriver f;
	@BeforeMethod
	public void betmet(){
		
		f=new FirefoxDriver();
		f.get("https://mc.s1.qa3.exacttarget.com");
		
	}
	
	@Test
	public void lastMethod() throws InterruptedException{
		f.findElementById("username").sendKeys("mohit_ent2.s1qa3.v5@etsf.com");
		f.findElementById("password").sendKeys("testing3!");
		f.findElementByXPath("//input[@value='Login']").click();
		
		f.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Actions act=new Actions(f);
		act.moveToElement(f.findElementByXPath("//div[@class='mc-app-switcher-container']/ul[1]/li[2]/ul[1]/li[4]/div[1]/span[1]")).perform();
		f.findElementByXPath("//span[text()='Contact Builder']").click();
		
		
		f.findElementByXPath("//span[text()='Data Sources']").click();
		
		f.switchTo().frame(1);
		f.findElementByXPath("//div[@class='text-center']/div[1]/label[2]").click();
		
		f.findElementByXPath("//div[@class='data-source-header']/div[1]/strong[1]").click();
		
		f.findElementByXPath("//div[@class='repeater-header text-center']/div[1]/label[2]").click();
		
		f.findElementByXPath("//input[@type='search']").sendKeys("CaseSolution");
		f.findElementByXPath("//div[@id='entity-search']/span[1]/button[1]").click();
		
		f.findElementByXPath("//button[text()='Synchronize']").click();
		//f.switchTo().defaultContent();
		f.switchTo().activeElement();
		
		//f.findElementByXPath("//input[@type='search']").sendKeys("mohit");

		
		f.findElementByXPath("//div[@class='repeater-list']/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]").click();
		f.findElementById("btnNext").click();
		f.findElementById("btnSave").click();
		Actions act1 = new Actions(f);
		act1.sendKeys(Keys.ENTER).perform();
	/*	Actions act1 = new Actions(f);
		act1.sendKeys(Keys.TAB).perform();
		act1.sendKeys(Keys.TAB).perform();
		act1.sendKeys(Keys.RETURN).perform();*/
		Thread.sleep(10000);
		
		for (String winhandle: f.getWindowHandles())
		{
		f.switchTo().window(winhandle);
		}
		
		//f.switchTo().frame(f.findElementByXPath("//button[text()='OK']"));
		//f.switchTo().defaultContent();
		//f.switchTo().frame("app-preload");
		f.findElementByXPath("//button[text()='OK']").click();
		
		

		
	}
	
	@AfterMethod
	public void aftmet() throws InterruptedException{
		Thread.sleep(20000);
		//f.quit();
	}


}
