package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardAction extends BaseDriver{
	@Test  (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test  (priority = 1)
	public void copyPaste() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		//WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		fullName.sendKeys("uzzal kummer mondal");
		email.sendKeys("jffjl");
		currentAddress.sendKeys("palash,narsingdi");
		Thread.sleep(2000);
		
		//Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		//copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		//tab
		action.sendKeys(Keys.TAB);
		action.build().perform();
		//paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
	}
}
