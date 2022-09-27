package sep6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class FirstTestNGclass {
	WebDriver driver;
	@BeforeTest
public void beforeTest() throws Throwable {
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://primusbank.qedgetech.com/");
Thread.sleep(5000);
Reporter.log("Running in precondition",true);
}
 @Test
  public void pbanking() throws Throwable {
driver.findElement(By.xpath("(//img)[4]")).click();
Thread.sleep(5000);
Reporter.log("Executing pbanking test",true);
 }
  @Test
  public void cbanking() throws Throwable {
driver.findElement(By.xpath("(//img)[5]")).click();
Thread.sleep(5000);
Reporter.log("Executing cbanking test",true);
  }
  @Test
  public void ibanking() throws Throwable {
 driver.findElement(By.xpath("(//img)[6]")).click();
 Thread.sleep(5000);
 Reporter.log("Executing ibanking test",true);
  }
  @AfterTest
  public void afterTest() {
driver.close();
Reporter.log("Running in postcondition",true);
  }
  }
