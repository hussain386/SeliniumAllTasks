package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		WebElement from = driver.findElement(By.id("fourth"));
		WebElement tocredit = driver.findElement(By.id("amt8"));
		Actions sc=new Actions(driver);
		sc.dragAndDrop(from, tocredit).build().perform();
		//sc.clickAndHold(from).moveToElement(tocredit).release(tocredit).build().perform();
		WebElement todebit = driver.findElement(By.id("amt7"));
		sc.dragAndDrop(from, todebit).build().perform();
		//sc.clickAndHold(from).moveToElement(todebit).release(todebit).build().perform();
		
		
	}

}
