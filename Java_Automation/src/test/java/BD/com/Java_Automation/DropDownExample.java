package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExample extends BaseDriver{
	@Test (priority = 0)
	public void showBrowser() throws InterruptedException {
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test (priority = 1)
	public void dropDown() throws InterruptedException {
		
		WebElement gender = driver.findElement(By.xpath("//select[@name ='sgender']"));
		
		Select select = new Select(gender);
		select.selectByValue("male");
		Thread.sleep(2000);
		select.selectByVisibleText("Female");
		Thread.sleep(2000);
		select.selectByIndex(3);
		Thread.sleep(5000);
		select.deselectAll();
		
	}

}
