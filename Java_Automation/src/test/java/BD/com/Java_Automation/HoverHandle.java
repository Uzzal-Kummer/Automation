package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverHandle extends BaseDriver{
	@Test (priority = 0)
	public void openBrowser() throws InterruptedException {
		
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

  }
	@Test (priority = 1)
	public void hoverTest() throws InterruptedException {
		Actions action = new Actions(driver);
		
		WebElement electronics = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		WebElement latest = driver.findElement(By.xpath("//span[contains(text(),'Latest Mobile Accessories')]"));
		WebElement cable = driver.findElement(By.xpath("//span[contains(text(),'Cable & Converter')]"));
		
		
		action.moveToElement(electronics).perform();
		Thread.sleep(2000);
		action.moveToElement(latest).perform();
		Thread.sleep(2000);

		cable.click();
		Thread.sleep(2000);
		
	}
	@Test (priority = 2)
	public void hoverTest2() throws InterruptedException {
		Actions action = new Actions(driver);
//		WebElement category = driver.findElement(By.xpath("//span[contains(text(),'Categories')]"));
//		WebElement watch = driver.findElement(By.xpath("//span[contains(text(),'Watches, Bags, Jewellery')]"));
//		WebElement mensBag = driver.findElement(By.xpath("//span[contains(text(),\"Men's Bags\")]"));
//		WebElement wallets = driver.findElement(By.xpath("//span[contains(text(),'Women's Bags')]"));
//		action.moveToElement(category).perform();
//		Thread.sleep(2000);
//		action.moveToElement(watch).perform();
//		Thread.sleep(2000);
//		action.moveToElement(mensBag).perform();
//		Thread.sleep(2000);
//		action.moveToElement(wallets).perform();
//		Thread.sleep(2000);
		WebElement category = driver.findElement(By.xpath("//span[contains(text(),'Categories')]"));
		WebElement lifeStyle = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		WebElement furniture = driver.findElement(By.xpath("//span[contains(text(),'Furniture')]"));
		//WebElement homeOffice = driver.findElement(By.xpath("//span[contains(text(),'Home Office')]"));
		action.moveToElement(category).perform();
		Thread.sleep(2000);
		action.moveToElement(lifeStyle).perform();
		Thread.sleep(2000);
		action.moveToElement(furniture).perform();
		Thread.sleep(5000);
		WebElement homeOffice = driver.findElement(By.xpath("//span[contains(text(),'Home Office')]"));
		homeOffice.click();
		Thread.sleep(2000);
	}

}
