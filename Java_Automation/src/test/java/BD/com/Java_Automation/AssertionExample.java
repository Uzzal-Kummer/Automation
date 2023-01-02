package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssertionExample extends BaseDriver{
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	@Test (priority = 1)
	public void alertCheck() throws InterruptedException {
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		
		jsAlert.click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		String resultOk = result.getText();
		if (resultOk.equals("You successfully clicked an alert")) {
			System.out.println("Passed " + resultOk);
		}
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
		
		
		
		
		
	}

}
