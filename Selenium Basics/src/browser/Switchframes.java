package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://account.magento.com/customer/account/create/");
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));
driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
driver.switchTo().defaultContent();
//driver.get("https://netbanking.hdfcbank.com/netbanking/");
//driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frameset/frame[1]")));
//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/span/input")));
	}
	

}
