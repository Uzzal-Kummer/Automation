package BD.com.Java_Automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class WindowHandle  extends BaseDriver{
	
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
	}
	
	@Test (priority = 1)
	public void handleIFrame() throws InterruptedException {
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(2000);
//		
//		driver.get("https://google.com");
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(2000);
//		driver.get(chalDalUrl);
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getWindowHandle());
		
		
		
		WebElement openTab = driver.findElement(By.xpath("//a[@id='opentab']"));
		openTab.click();
		Thread.sleep(5000);
		
    	WebElement openWindow = driver.findElement(By.xpath("//button[@id='openwindow']"));
		openWindow.click();
		Thread.sleep(5000);
		List<String> wHandleList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wHandleList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		driver.switchTo().window(wHandleList.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
		driver.switchTo().window(wHandleList.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		
	}
}
