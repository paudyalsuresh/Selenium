package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	private static String error;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://magento.com");
driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
driver.findElement(By.id("email")).clear();
driver.findElement(By.id("email")).sendKeys("yesh.paudyal@gmail.com");
driver.findElement(By.id("pass")).clear();
driver.findElement(By.id("pass")).sendKeys("suresh27");
driver.findElement(By.id("send2")).click();   
Thread.sleep(10000);
driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"));
System.out.println("Error:"+error);
if(error.equals("Invalid Login or Password")) {
	System.out.println("Test Case Pass");
}








	}
}