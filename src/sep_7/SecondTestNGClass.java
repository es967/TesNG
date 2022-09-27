package sep_7;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtill;

public class SecondTestNGClass extends AppUtill {
@Test
public void addition () throws Throwable
{
driver.findElement(By.name("display")).sendKeys("58942");
Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
Thread.sleep(5000);
driver.findElement(By.name("display")).sendKeys("964");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
Thread.sleep(1000);
String addres = driver.findElement(By.name("display")).getAttribute("value");
Reporter.log(addres,true);
}
@Test
public void division() throws Throwable 
{
driver.findElement(By.name("display")).sendKeys("5846");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
Thread.sleep(1000);
driver.findElement(By.name("display")).sendKeys("54");
Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
Thread.sleep(1000);
String divres = driver.findElement(By.name("display")).getAttribute("value");
Reporter.log(divres,true);
}
@Test
public void mutiplication() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("5894");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("12");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
	String mulres =driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(mulres,true);
}
}
