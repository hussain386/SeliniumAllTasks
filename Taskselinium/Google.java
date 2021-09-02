package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("greens velmurugan+"+Keys.ENTER);
		
		WebElement findElement2 = driver.findElement(By.xpath("//h3[text()='Greens Technologies - software training - Greens Techologies ...']"));
		findElement2.click();

	}

}
