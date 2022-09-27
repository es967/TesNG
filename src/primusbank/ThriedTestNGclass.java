package primusbank;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.AppUtil1;

public class ThriedTestNGclass extends AppUtil1 {
	@Test
	public void Branch() throws Throwable
	{
    driver.findElement(By.xpath("(//img)[5]")).click();
      Thread.sleep(5000);
	}
@Test
public void Role() throws Throwable
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Thread.sleep(5000);
  }
@Test
public void users() throws Throwable
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Thread.sleep(5000);
}
@Test
public void Employees() throws Throwable
{
	driver.findElement(By.xpath("(//img)[8]")).click();
	Thread.sleep(5000);
}
}