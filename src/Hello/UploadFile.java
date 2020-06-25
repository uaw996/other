package Hello;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Umesh\\Desktop\\test plans files\\test plan new.docx");
		
		// Please enter a valid user name

		driver.findElement(By.name("proceed")).click();
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
	    
		
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct alert message");
		}
		else {
			System.out.println("in-correct alert message");
		}
		alert.accept();
		//driver.quit();
		
		
		
		
		
		
		
		
	}

}
