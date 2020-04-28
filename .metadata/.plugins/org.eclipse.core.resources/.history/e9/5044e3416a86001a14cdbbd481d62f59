package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("http://amazon.com");
				driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
				driver.findElement(By.id("createAccountSubmit")).click();
				driver.findElement(By.id("ap_customer_name")).clear();
				driver.findElement(By.id("ap_customer_name")).sendKeys("Suresh");
				driver.findElement(By.id("ap_email")).clear();
				driver.findElement(By.id("ap_email")).sendKeys("yesh.paudyal@gmail.com");
				driver.findElement(By.id("ap_password")).clear();
				driver.findElement(By.id("ap_password")).sendKeys("Welcome123");
				driver.findElement(By.id("ap_password_check")).clear();
				driver.findElement(By.id("ap_password_check")).sendKeys("Welcome123");
				driver.findElement(By.id("continue")).click();
				
				
				
	}

}