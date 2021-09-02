package Day10taskwindowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.utility.Baseclass1;

public class Task3cielingfanwindowhandle extends Baseclass1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement searchbox = driver.findElement(By.id("headerSearch"));
		searchbox.sendKeys("celling fan"+Keys.ENTER);
		
		WebElement hoverproduct = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[1]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hoverproduct).contextClick(hoverproduct).perform();
		Robot rr=new Robot();
		rr.keyPress(KeyEvent.VK_PAGE_DOWN);
		rr.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WindowSwitch(1);
		WebElement clicksmarhub = driver.findElement(By.xpath("//button[text()='Smart Hub Included']"));
		clicksmarhub.click();
	}

}
