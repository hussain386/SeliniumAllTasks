package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get(" https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement findElement2 = driver.findElement(By.className("_2KpZ6l _2doB4z"));
		findElement2.click();
		
		WebElement findElement = driver.findElement(By.name("q"));
		findElement.sendKeys("iphone10"+Keys.ENTER);
		
		WebElement clicking = driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 256 GB)']"));
		clicking.click();
	}

}
