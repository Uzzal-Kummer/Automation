package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertExample extends BaseDriver{
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	/*
	 * Assertion is 2 Types. 1.Hard 2.Soft
	 * 1.Hard assertion-----> If any fails occurs then stop the execution.
	 * 2.Soft assertion------> If any fails occurs then doesn't stop the execution it runs other program.
	 */
	@Test (priority = 1)
	public void alertCheck() throws InterruptedException {
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
	
        //Hard Assertion
		  jsAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String resultOk = result.getText();
		Assert.assertEquals(resultOk, "You successfully clicked an aler");
		Thread.sleep(2000);
		
		
		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		String resultCancel = result.getText();
		if (resultCancel.equals("You clicked: Cancel")) {
			System.out.println("Passed " + resultCancel);
		}
		Thread.sleep(2000);
		
		jsPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello World");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		String resultPrompt =result.getText(); 
		if (resultPrompt.equals("You entered: Hello World")) {
			System.out.println("Passed " + resultPrompt);
		}
		Thread.sleep(2000);
		
//	    Soft Assertion
//			    SoftAssert softAsser = new SoftAssert();
//		jsAlert.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		String resultOk = result.getText();
//		softAsser.assertEquals(resultOk, "You successfully clicked an aler");
//		Thread.sleep(2000);
//		
//		
//		jsConfirm.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		String resultCancel = result.getText();
//		if (resultCancel.equals("You clicked: Cancel")) {
//			System.out.println("Passed " + resultCancel);
//		}
//		Thread.sleep(2000);
//		
//		jsPrompt.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("Hello World");
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		String resultPrompt =result.getText(); 
//		if (resultPrompt.equals("You entered: Hello World")) {
//			System.out.println("Passed " + resultPrompt);
//		}
//		Thread.sleep(2000);
		
		//softAsser.assertAll();
		
	}

}
