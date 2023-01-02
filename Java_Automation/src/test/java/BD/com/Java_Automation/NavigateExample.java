package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateExample extends BaseDriver{
	@Test (priority = 0)
	public void OpenBrowser() throws InterruptedException {
		driver.get(chalDalUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test (priority = 1)
	public void navigate() throws InterruptedException {
		WebElement Offers = driver.findElement(By.xpath("//span[contains(text(),'Offers')]"));
		Offers.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
