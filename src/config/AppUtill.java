package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtill {
public static WebDriver driver;
@BeforeMethod
public static void setUp() throws Throwable
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://calc.qedgetech.com/");
	Thread.sleep(5000);
	}
@AfterMethod
public static void teraDown()
{
 driver.close();
}
}