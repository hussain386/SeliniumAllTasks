package seliniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://en-gb.facebook.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println("Url:"+url);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}

}
