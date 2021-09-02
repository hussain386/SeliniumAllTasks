package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("inputValEnter"));
		findElement.sendKeys("sunglasses"+Keys.ENTER);
		WebElement click = driver.findElement(By.xpath("//p[text()='Arizona Sunglasses - Black Pilot Sunglasses ( AZ105 )']"));
		click.click();
	}

}
