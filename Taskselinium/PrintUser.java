package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("hello world");
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("11001100");
		String nam1=findElement.getAttribute("value");
		String nam2=findElement2.getAttribute("value");
		System.out.println("username:"+nam1+"\n"+"password:"+nam2);
		
	}

}
