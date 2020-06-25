package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class Duke {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.gecko.driver", "E:\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/"); 
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys("umawasarmol@gmail.com");
	driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("gaurav");
	//driver.findElement(By.xpath("//*[@id = 'u_0_2']")).click();
	
	driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("gaurav");
	driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("phuse");
	driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("pune");
	
	Select select = new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("20");
	
	Select select2 = new Select(driver.findElement(By.id("month")));
	
     select2.selectByVisibleText("Mar");
	
	Select yer = new Select(driver.findElement(By.id("year")));
	
	yer.selectByVisibleText("2000");

	driver.findElement(By.id("u_0_a")).click();
	
	driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();
	
	
	}	
	

}
