package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDay2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement textbox=driver.findElement(By.id("username"));
		textbox.sendKeys("hussain");
		WebElement txtpass = driver.findElement(By.name("password"));
		txtpass.sendKeys("password");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		driver.close();
		
	}

}
