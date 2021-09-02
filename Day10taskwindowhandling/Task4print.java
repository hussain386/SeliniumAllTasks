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

public class Task4print {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement select = driver.findElement(By.xpath("(//i[@class='fas fa-plus'])[6]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(select).perform();
		ac.click().perform();
		WebElement hover = driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']"));
		ac.moveToElement(hover).click().perform();
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
		
		WebElement printquestion1 = driver.findElement(By.xpath("(//td[@class='line-content'])[9]"));
		String text = printquestion1.getText();
		System.out.println("print1stquestion No1:"+text);
		
		
		
		

	}

}
