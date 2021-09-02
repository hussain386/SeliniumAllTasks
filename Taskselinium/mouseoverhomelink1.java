package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverhomelink1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement alldepart = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(alldepart).perform();
		Thread.sleep(2000);
		WebElement topaint = driver.findElement(By.xpath("//a[text()='Paint']"));
		ac.moveToElement(topaint).perform();
		Thread.sleep(2000);
		WebElement interiorpaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		ac.moveToElement(interiorpaint).perform();
		Thread.sleep(2000);
		WebElement cielingpaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		ac.moveToElement(cielingpaint).perform();
		cielingpaint.click();
		
		

	}

}
