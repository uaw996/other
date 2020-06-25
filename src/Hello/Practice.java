package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args)
	{
	 System.setProperty("webdriver.gecko.driver", "E:\\\\driver\\\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("akola");
	 
	 Select select = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	 
	 select.selectByValue("14");
	 
    }
}