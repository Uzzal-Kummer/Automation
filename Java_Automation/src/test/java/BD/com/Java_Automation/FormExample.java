package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormExample extends BaseDriver{
	 @Test (priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	 @Test (priority = 1)
	public void formFillUp() throws InterruptedException {
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement  email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement  mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		WebElement  subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		WebElement  currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement genderBtn = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		
		firstName.sendKeys("Uzzal");
		Thread.sleep(2000);
		lastName.sendKeys("Mondal");
		Thread.sleep(2000);
		email.sendKeys("uzzal@gmail.com");
		Thread.sleep(2000);
		mobile.sendKeys("01631230372");
		Thread.sleep(2000);
		subject.sendKeys("SQA");
		Thread.sleep(2000);
		currentAddress.sendKeys("Dhaka,Bangladesh");
		Thread.sleep(2000);
		genderBtn.click();
		Thread.sleep(2000);
	}
	
}
