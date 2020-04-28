package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithchToAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/javascript4.htm");
		Thread.sleep(30000);
		driver.findElement(By.name("B3")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Test Data");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	
	

}
