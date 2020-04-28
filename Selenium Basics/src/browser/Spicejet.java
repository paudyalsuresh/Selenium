package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("MAA");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).clear();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("DEL");
		Thread.sleep(1000);
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("24")).click();  
		Thread.sleep(1000);
		Select passenger = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult ")));
		passenger.selectByValue("7");
		///driver.findElement(By.id("ctl00$mainContent$ddl_Adult")).click();
		//driver.findElement(By.linkText("7")).click(); 
		
       
		
		
	
	}

}
