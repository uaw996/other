package Hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupWimdowHandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "E:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Umesh\\Desktop\\test plans files\\test plan new.docx");
		
	}

}
