package BD.com.Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends BaseDriver {
  @Test  (priority = 0)
	public void locator() throws InterruptedException {
		driver.get(yahooUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
  
  @Test (priority = 1)
  public void testLocator() throws InterruptedException {
	
	  WebElement id = driver.findElement(By.id("login-username"));
	  id.sendKeys("uzzal@yahoo.com");
	  Thread.sleep(2000);
	  id.clear();
	  
	  WebElement className = driver.findElement(By.className("phone-no"));
	  className.sendKeys("uzzal2@yahoo.com");
	  Thread.sleep(2000);
	  className.clear();
	  
	  WebElement name = driver.findElement(By.name("username"));
	  name.sendKeys("uzzal3@yahoo.com");
	  Thread.sleep(2000);
	  name.clear();
//	  linkText: By.linkText("value")
	  WebElement linkText = driver.findElement(By.linkText("Forgot username?"));
	  linkText.click();
	  Thread.sleep(2000);
	  
//	  Name Locator = By.name("value")
	  
	  WebElement name2 = driver.findElement(By.name("username"));
	  name2.sendKeys("01631230372");
	  Thread.sleep(2000);
	  name2.clear();
	  
//	  WebElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
//	  continueBtn.click();
//	  Thread.sleep(2000);
	  
	  
//	  css id = By.cssSelector("#Id_value")
	  WebElement cssId = driver.findElement(By.cssSelector("#username"));
	  cssId.sendKeys("1942950469");
	  Thread.sleep(2000);
	  cssId.clear();
	  
//	  cssClass = By.cssSelector(".class_value")
	  WebElement cssClass = driver.findElement(By.cssSelector(".phone-no"));
	  cssClass.sendKeys("1631230372");
	  Thread.sleep(2000);
	  cssClass.clear();
	  
//	  XPath: Xpath=//tagname[@attribute='value']
	  
	  WebElement xpath1 = driver.findElement(By.xpath("//input[@name ='username']"));
	  xpath1.sendKeys("11111111");
	  Thread.sleep(3000);
	  xpath1.clear();
	  
	  WebElement xpath2 = driver.findElement(By.xpath("//input[@type ='text']"));
	  xpath2.sendKeys("2222222");
	  Thread.sleep(3000);
	  xpath2.clear();
	  
	  WebElement yahoo = driver.findElement(By.cssSelector(".logo"));
	  yahoo.click();
	  Thread.sleep(3000);
	  
	  WebElement signIN = driver.findElement(By.cssSelector("._yb_w7iux"));
	  signIN.click();
	  Thread.sleep(3000);
	  
//	  Contains: Xpath=//[contains(@type,'value')]
	  
	  WebElement inputField = driver.findElement(By.xpath("//input[contains(@class,'phone-no')]"));
	  inputField.sendKeys("uzzal4@yahoo.com");
	  Thread.sleep(3000);
	  
	  
//	  Contains: Xpath=//*[contains(@type,'sub')]
	  WebElement nextBtn = driver.findElement(By.xpath("//*[contains(@id,'login-signin')]"));
	  nextBtn.click();
	  Thread.sleep(2000);
	  
//	  Xpath=//*[@type='value1' or/and @name='value2']
	  
	  WebElement password = driver.findElement(By.xpath("//input[@type = 'password' or @id = 'login-passwd' or @name='password']"));
	  password.sendKeys("12345");
	  Thread.sleep(2000);
	  
	  
	  WebElement next = driver.findElement(By.xpath("//button[@type = 'submit' and @id = 'login-signin' and @name='verifyPassword']"));
	  next.click();
	  Thread.sleep(2000);
}
}
