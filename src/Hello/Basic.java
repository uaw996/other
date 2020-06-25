package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "E:\\driver\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.demo.guru99.com/V4/index.php");
//		
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mngr244468");
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("mYpyrer");
//		driver.findElement(By.xpath("//*[@value=\"LOGIN\"]")).click();
//		
		
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // lounch browser
		
		//driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Payal");
		driver.findElement(By.id("pass")).sendKeys("pune");
		//driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.name("firstname")).sendKeys("umesh");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("umesh");
		driver.findElement(By.xpath("//input[@id=\"u_0_r\"]")).sendKeys("inspire");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	
}
				
