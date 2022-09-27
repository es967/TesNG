package sep8;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectHRM {
	WebDriver  driver;
	Properties p;
	@BeforeSuite
	public void setUp() throws Throwable, Throwable {
		p= new Properties();
		p.load(new FileInputStream("C:\\Users\\Eswar Reddy\\eclipse-workspace\\TestNG_framework\\orange.properties"));
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(p.getProperty("Url"));
	     }
	    @Test
	    public void login () throws Throwable {
		driver.findElement(By.xpath(p.getProperty("rulle"))).sendKeys(p.getProperty("username"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("con"))).sendKeys(p.getProperty("Password"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("action"))).click();
	    Thread.sleep(400);
	    }
	    @Test
		public void user() throws Throwable {
		driver.findElement(By.xpath(p.getProperty("Admin"))).click();
		Thread.sleep(1000);
		// system users
		driver.findElement(By.xpath(p.getProperty("system"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("system"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("search"))).sendKeys(p.getProperty("name"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("move"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("emp"))).sendKeys(p.getProperty("employee"));
		Thread.sleep(500);
		driver.findElement(By.xpath(p.getProperty("click"))).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(p.getProperty("srech"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("remove"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("Add"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(p.getProperty("custo"))).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(p.getProperty("myname"))).sendKeys(p.getProperty("empname"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("usename"))).sendKeys(p.getProperty("Uname"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("tuse"))).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(p.getProperty("passcode"))).sendKeys(p.getProperty("paswd"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("conpass"))).sendKeys(p.getProperty("Conip"));
		Thread.sleep(1000);
		driver.findElement(By.xpath(p.getProperty("save"))).click();
	     Thread.sleep(1000);
	     
	     }
	     @Test
	     public void hrm () throws Throwable {
	    Actions ac = new Actions(driver);
	    // move to mouse
	    ac.moveToElement(driver.findElement(By.xpath(p.getProperty("jobtitle")))).contextClick().perform();
	    Thread.sleep(400);
	     }
		@AfterTest
        public void teardown() {
        driver.close();
}
}

