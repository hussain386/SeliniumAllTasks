package Day10taskwindowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task7print {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// (//i[@class='fas fa-plus'])[5]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement select = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[5]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(select).perform();
		ac.click().perform();
		WebElement controlstatement = driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[4]"));
		ac.click(controlstatement).perform();
		Thread.sleep(1000);
		Robot rr=new Robot();
		rr.keyPress(KeyEvent.VK_CONTROL);
		rr.keyPress(KeyEvent.VK_U);
		
		rr.keyRelease(KeyEvent.VK_CONTROL);
		rr.keyRelease(KeyEvent.VK_U);
		Thread.sleep(2000);
		Set<String> allwindowid = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(allwindowid);
		driver.switchTo().window(al.get(1));//swithching to new window
		WebElement printtext = driver.findElement(By.xpath("(//td[@class='line-content'])[13]"));
		String text = printtext.getText();
		System.out.println("question no 1:"+text);
		
	}

}
