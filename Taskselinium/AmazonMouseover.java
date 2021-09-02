package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(prime).perform();
		Thread.sleep(3000);
		WebElement select = driver.findElement(By.id("nav-link-prime"));
		ac.moveToElement(select).perform();
		select.click();
		
		ac.moveToElement(customerclick).perform();
	
	}

}
