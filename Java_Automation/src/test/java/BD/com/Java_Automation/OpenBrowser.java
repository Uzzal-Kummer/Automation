package BD.com.Java_Automation;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OpenBrowser extends BaseDriver{
	
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(chalDalUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@Test (priority = 1)
	public void offers() throws InterruptedException {
		WebElement offer = driver.findElement(By.xpath("//span[contains(text(),'Offers')]"));
		offer.click();
		Thread.sleep(5000);
	}
	@Test (priority = 2)
	public void signIn() throws InterruptedException {
		WebElement signBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		signBtn.click();
		Thread.sleep(5000);
	}
	@Test
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
		
		String mainTitle = "Online Grocery Shopping and Delivery in Bangladesh | Buy fresh food items, personal care, baby products and more";
		if (title.equals(mainTitle)) {
			System.out.println("Verified");
		}

	}
}
