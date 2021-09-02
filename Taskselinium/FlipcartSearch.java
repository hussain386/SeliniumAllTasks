package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
	
		
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU'][1]"));
		username.sendKeys("8838052142");
		
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU'][1]"));
		password.sendKeys("incorrectpassword");
		
		String attribute1 = username.getAttribute("value");
		String attribute2 = password.getAttribute("value");
		System.out.println("username:"+attribute1+"\n"+"password:"+attribute2);
		
	}

}
