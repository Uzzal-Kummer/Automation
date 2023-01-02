package BD.com.Java_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitInSelenium  extends BaseDriver{
	
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		driver.get("https://qavbox.github.io/demo/delay/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test (priority = 1)
	public void seleniumWaitHandle() throws InterruptedException {
		
//		driver.findElement(By.xpath("//input[@name='commit1']")).click();
//		WebElement textElement = driver.findElement(By.xpath("//body//form//fieldset//div//div//div//h2"));
//		System.out.println(textElement.getText());
		By lateTextBy = By.xpath("//h2[@id='two']");
		By lateTextBy2 = By.xpath("//div[@id='oneMore']//h2[1]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		WebElement lateText = driver.findElement(lateTextBy);
		wait.until(ExpectedConditions.textToBePresentInElement(lateText, "I am here!"));
		System.out.println(lateText.getText());
		
		driver.findElement(By.xpath("//input[@name='commit1']")).click();
		
		WebElement newText = wait.until(ExpectedConditions.visibilityOfElementLocated(lateTextBy2));
		System.out.println(newText.getText());
	}
	
	
}
