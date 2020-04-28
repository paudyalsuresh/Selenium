package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//methodname(args):output-Belonging Class
		//driver.close();
		driver.get("http://yahoo.com");
		//driver.get("http://google.com");
		//System.out.println(driver.getCurrentUrl());
		String url=driver.getCurrentUrl();
		if (url.startsWith("http://")) {
			System.out.println("security certified application");
		}
			if(url.contains("in.")|| url.contains(".in")) {
				System.out.println("localized to india");
		}
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		driver.quit();
	}
	}


