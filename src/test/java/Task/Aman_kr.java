package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aman_kr {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String Url = "https://demoqa.com/automation-practice-form";
		driver.get(Url);
//		String Page_Source = driver.getPageSource();
//		String pageSource=driver.findElement(By.tagName("body")).getText();
//		System.out.println("Page source is: " +pageSource);
//		WebElement.getAttribute("innerHTML");
		driver.getCurrentUrl();
		System.out.println("Current Url is: " + Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 
		

	}

	@Test
	public void Registration_Form() throws Exception {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Aman");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Singhalaman0123@gmail.com");
		Thread.sleep(2000);

//		Radio buttons---> Select gender
		WebElement Male = driver.findElement(By.cssSelector("[for='gender-radio-1']"));
		WebElement Female = driver.findElement(By.cssSelector("[for='gender-radio-2']"));
		WebElement Others = driver.findElement(By.cssSelector("[for='gender-radio-3']"));
		Male.click();
		Thread.sleep(1000);
		Female.click();
		Thread.sleep(1000);
		Others.click();
		Male.click();

//		Enter Phone number...........
		WebElement Ph_no = driver.findElement(By.xpath("//input[@id='userNumber']"));
		Ph_no.sendKeys("1234567899");
		Thread.sleep(2000);

//		Enter Date of birth...........
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Thread.sleep(2000);
		WebElement Month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select select = new Select(Month);
		select.selectByVisibleText("August");
//		select.selectByVisibleText("")
		Thread.sleep(2000);
		WebElement Year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select select1 = new Select(Year);
		select1.selectByVisibleText("1998");
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--005']")).click();
		Thread.sleep(2000);

//		Enter Subjects...
		WebElement sub = driver.findElement(By.cssSelector(".subjects-auto-complete__value-container"));
		Actions actions = new Actions(driver);
		actions.moveToElement(sub).click().sendKeys("Maths").build().perform();
		actions.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		actions.moveToElement(sub).click().sendKeys("English").build().perform();
		actions.sendKeys(Keys.RETURN);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
//		CheckBox-->Hobbies
		WebElement sports = driver.findElement(By.xpath("//label[.='Sports']"));
		Actions actions11 = new Actions(driver);
		actions11.moveToElement(sports).click().build().perform();
		actions11.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		WebElement music = driver.findElement(By.xpath("//label[.='Music']"));
		Actions actions12 = new Actions(driver);
		actions12.moveToElement(music).click().build().perform();
		actions12.sendKeys(Keys.RETURN);
//		Choose file........
		WebElement choose_file = driver.findElement(By.cssSelector("#uploadPicture"));

//		path of the file to be selected......
		choose_file.sendKeys("C:\\Users\\Aman.1.Kumar\\Pictures\\Screenshots\\Screenshot (67).png");
		Thread.sleep(2000);

//		Enter Address.....
		driver.findElement(By.xpath("//textarea[@id='currentAddress']"))
				.sendKeys("ITS Engineering College,Greater Noida,201310");

//		Select State-----Dropdown
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,350)", "");
		WebElement State = driver.findElement(
				By.xpath("//div[@class=' css-yk16xz-control']//div[@class=' css-tlfecz-indicatorContainer']"));
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(State).click().sendKeys("NCR").build().perform();
		actions111.sendKeys(Keys.RETURN).build().perform();

		Thread.sleep(3000);

//		Select city--------Dropdown
		WebElement City = driver
				.findElement(By.xpath("//div[@id='city']//div[@class=' css-tlfecz-indicatorContainer']"));

		Actions actions2 = new Actions(driver);
		actions2.moveToElement(City).click().sendKeys("Noida").build().perform();
		actions2.sendKeys(Keys.RETURN).build().perform();
		Thread.sleep(3000);

//		submit form.......

		driver.findElement(By.cssSelector("#submit")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
