package BD.com.Java_Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample extends BaseDriver{
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After Suite");
	}
	@Test (priority = 1)
	public void test() {
		System.out.println("This is Test");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test");
	}
	@BeforeClass
	public void beforClass() {
		System.out.println("this is before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this before method");
	}
	@AfterMethod
	public void afterMethod() {
			System.out.println("this is after method");
	}
	@Test  (priority = 2)
	public void test2() {
		System.out.println("This is Test2");
	}
	@Test (priority = 0)
	public void test3() {
		System.out.println("This is Test3");
	}

}
