package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtil1 {
	
public static WebDriver driver;
@BeforeSuite
public static void setUp() throws Throwable
{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
	driver.findElement(By.cssSelector("#login")).click();
	Thread.sleep(5000);
}
@AfterSuite
public void tearDown()
{
	driver.close();
}
}