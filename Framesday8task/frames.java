package Framesday8task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		WebElement fisrtclick = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(fisrtclick);
		Thread.sleep(1000);
		WebElement clickme = driver.findElement(By.id("Click"));
		clickme.click();
		
		Thread.sleep(1000);
		driver.switchTo().frame("frame2");
			WebElement clickme2 = driver.findElement(By.id("Click1"));
		clickme2.click();
		driver.switchTo().defaultContent();
		
		
		List<WebElement> framescount = driver.findElements(By.tagName("iframe"));
		int size = framescount.size();
		System.out.println("framescount:"+size);
		
		}
			
		
		
	}

