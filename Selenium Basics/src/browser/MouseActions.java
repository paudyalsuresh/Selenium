package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://magento.com");
		
		Actions act=new Actions(driver);    
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[4]/a/span"))).perform();
		//act.click(driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[4]/div/div/div/div/ul/li[3]/ul/li[2]/a"))).perform(;)
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[4]/div/div/div/div/ul/li[3]/ul/li[2]/a")).click();
		
	}


}
