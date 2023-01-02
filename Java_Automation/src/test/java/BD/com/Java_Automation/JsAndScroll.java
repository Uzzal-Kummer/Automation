package BD.com.Java_Automation;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Argument;

public class JsAndScroll  extends BaseDriver{
	
	@Test (priority = 0)
	public void scrollUaingJs() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement maouseHover = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mousehover")));
		
		js.executeScript("arguments[0].scrollIntoView()", maouseHover);
		Thread.sleep(5000);
	}
	
	
}
