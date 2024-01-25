package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	public void Test1() {
		driver.get("https://www.google.com/");
		System.out.println("Test 1 Title is "+ driver.getTitle());
	}
	
	@Test
	public void Test2() {
		driver.get("https://www.google.com/");
		System.out.println("Test 2 Title is "+ driver.getTitle());
	}
	
	@Test
	public void Test3() {
		driver.get("https://www.google.com/");
		System.out.println("Test 3 Title is "+ driver.getTitle());
	}
	
	@AfterMethod
	public void quite() {
		driver.quit();
	}

}
