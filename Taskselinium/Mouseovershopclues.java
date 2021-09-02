package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseovershopclues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement sm = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(sm).perform();
		Thread.sleep(3000);
		WebElement toweight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		ac.moveToElement(toweight).perform();;
		toweight.click();
		
	}

}
