package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DoPratice {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","E:\\\\driver\\\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_m")).sendKeys("samyak");
		driver.findElement(By.id("u_0_o")).sendKeys("more");
		driver.findElement(By.cssSelector("#u_0_r")).sendKeys("123");
		driver.findElement(By.name("reg_passwd__")).sendKeys("akoal");
		//driver.findElement(By.xpath("//input[contains@type,'radio']")).click();

		Select select = new Select(driver.findElement(By.cssSelector("#day")));
		select.selectByValue("25");
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Feb");
		Select select2 = new Select(driver.findElement(By.xpath("//*[contains@title,'year']")));
		select2.selectByIndex(1992);
		
		
	}

}
