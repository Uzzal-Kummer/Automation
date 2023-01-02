package BD.com.Java_Automation;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class TostHandle  extends BaseDriver{
	
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		driver.get("https://member.daraz.com.bd/user/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@Test (priority = 1)
	public void tostHandle() throws InterruptedException {
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Please enter your password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userName.sendKeys("0123456");
		Thread.sleep(2000);
		password.sendKeys("55555");
		Thread.sleep(5000);
		login.click();
		Thread.sleep(2000);
		WebElement toastMessage = driver.findElement(By.className("next-feedback-content"));
		
		assertEquals(toastMessage.getText(), "Please enter a valid phone number.");
		Thread.sleep(2000);
	}
}
