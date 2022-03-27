package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHand {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String Url = "https://demoqa.com/browser-windows";
		driver.get(Url);
		driver.getCurrentUrl();
		System.out.println("Current Url is: " + Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void window() {
		
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();	
		
		
	}
	
	
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
