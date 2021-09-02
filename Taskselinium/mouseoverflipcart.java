package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverflipcart {

	public static void main(String[] args) throws InterruptedException {
		////span[text()='Baby & Kids']
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
		Thread.sleep(3000);
		WebElement baby = driver.findElement(By.xpath("span[text()='Baby & Kids']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(baby).perform();
		Thread.sleep(3000);
		WebElement selctremote = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		selctremote.click();

	}

}
