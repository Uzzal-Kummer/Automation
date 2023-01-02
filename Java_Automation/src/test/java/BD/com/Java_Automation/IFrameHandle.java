package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameHandle  extends BaseDriver{
	
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test (priority = 1)
	public void handleIFrame() throws InterruptedException {
		
		//WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(iFrame);
		driver.switchTo().frame(0);
		
		WebElement newWorkRadioButoon =getElement(By.xpath("//label[normalize-space()='New York']"));
		
		newWorkRadioButoon.click();
		Thread.sleep(2000);
		
//		WebElement parisRadioButton = driver.findElement(By.xpath("//label[normalize-space()='Paris']"));
//		parisRadioButton.click();
		clickOnElement(By.xpath("//label[normalize-space()='Paris']"));
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
//		WebElement normalText = driver.findElement(By.xpath("//p[@class='desc']"));
//		
//		System.out.println(normalText.getText());
		System.out.println(getElementText(By.xpath("//p[@class='desc']")));
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	private String getElementText(By locator) {
		return getElement(locator).getText();
	}
}
