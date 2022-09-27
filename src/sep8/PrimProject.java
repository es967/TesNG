package sep8;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PrimProject {
WebDriver driver;
Properties p;
@BeforeTest
public void setUp() throws Throwable, Throwable
{     
	p= new Properties();
	p.load(new FileInputStream("C:\\Users\\Eswar Reddy\\eclipse-workspace\\TestNG_framework\\Primus.properties"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("Url"));
}
@Test
public void login() throws Throwable
{
driver.findElement(By.xpath(p.getProperty("objuser"))).sendKeys(p.getProperty("username"));
Thread.sleep(5000);
driver.findElement(By.xpath(p.getProperty("objpass"))).sendKeys(p.getProperty("password"));
Thread.sleep(5000);
driver.findElement(By.xpath(p.getProperty("objlogin"))).click();
Thread.sleep(5000);
}
@AfterTest
public void tearDown()
{
	driver.quit();
}
}