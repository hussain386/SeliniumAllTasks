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

public class task1printcost {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("keyboard"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement hover = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hover).contextClick(hover).perform();
		Robot rr=new Robot();
		rr.keyPress(KeyEvent.VK_PAGE_DOWN);
		rr.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		//
		Thread.sleep(2000);
		Set<String> allwindowid = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(allwindowid);
		driver.switchTo().window(al.get(1));//swithching to new window
		WebElement printtext = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String text = printtext.getText();
		System.out.println("product price dollar:"+text);
		
		
		
		
		
	}

}
