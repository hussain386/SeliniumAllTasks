package Day10taskwindowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task5 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement mousehovercourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mousehovercourse).perform();
		WebElement selectpython = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		ac.click(selectpython).perform();
		WebElement rightclickcurriculam = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		ac.contextClick(rightclickcurriculam).perform();
		Thread.sleep(2000);
		Robot rr=new Robot();
		rr.keyPress(KeyEvent.VK_PAGE_DOWN);
		rr.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		WebElement printtextr = driver.findElement(By.xpath("(//h2[contains(text(),'Python Training')])[2]"));
		String text = printtextr.getText();
		System.out.println("text:"+text);
	}

}
