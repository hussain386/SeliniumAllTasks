package Task6selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement clickmodelresume = driver.findElement(By.xpath("//div[@id='heading201']"));
		clickmodelresume.click();
		
		WebElement selectresume4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(selectresume4).contextClick(selectresume4).perform();
		
		Robot r=new Robot();
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_J);
		
	
	
	}

}
