package Task6selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement rightclickitem = driver.findElement(By.xpath("(//img[@class='wooble'])[4]"));
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		ac.moveToElement(rightclickitem).perform();
		ac.contextClick(rightclickitem).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	
	
	}

}
