package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoversnapdeal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		
		WebElement mobiles = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mobiles).perform();
		mobiles.click();
		Thread.sleep(1500);

		WebElement selctrealme = driver.findElement(By.xpath("//p[text()='realme']"));
		ac.moveToElement(selctrealme).perform();
		selctrealme.click();
		Thread.sleep(1500);

		WebElement clickproduct = driver.findElement(By.xpath("//div[text()='realme C20 (Cool Blue, 32 GB)']"));
		clickproduct.click();

	}

}
