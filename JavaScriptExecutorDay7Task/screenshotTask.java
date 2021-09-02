package JavaScriptExecutorDay7Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshotTask {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// https://www.flipkart.com/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[text()='✕']"));
		close.click();
		
		WebElement searchproduct = driver.findElement(By.xpath("//input[@type='text']"));
		searchproduct.sendKeys("iphone10"+Keys.ENTER);
		
		Robot r2=new Robot();
		r2.mousePress(1);
		r2.mouseRelease(1);
		WebElement hoverproduct = driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Space Gray, 256 GB)']"));
		Actions ac=new Actions(driver);
		
		ac.moveToElement(hoverproduct).perform();
		ac.contextClick(hoverproduct).perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_WINDOWS);
		r1.keyPress(KeyEvent.VK_PRINTSCREEN);
		r1.keyRelease(KeyEvent.VK_WINDOWS);
		r1.keyRelease(KeyEvent.VK_PRINTSCREEN);
		
		
		
		
		

	}

}
