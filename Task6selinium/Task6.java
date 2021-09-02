package Task6selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();
		WebElement toRpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		ac.moveToElement(toRpa).perform();
		ac.contextClick(toRpa).perform();
		
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//driver.close();

		
	}

}
