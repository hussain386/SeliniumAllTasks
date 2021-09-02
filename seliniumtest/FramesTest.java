package seliniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/frame.html");
		
//		driver.switchTo().frame(0);
//		
//		WebElement findElement = driver.findElement(By.id("Click"));
//		findElement.click();
//		
//		String se=findElement.getText();
//		System.out.println("Text:"+se);
//		
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(1);
//		driver.switchTo().frame("frame2");
//		
//		WebElement findElement2 = driver.findElement(By.id("Click1"));
//		findElement2.click();
//		String s22=findElement2.getText();
//		System.out.println(s22);
//		
//		driver.switchTo().defaultContent();
//		
//		List<WebElement> count=	driver.findElements(By.tagName("iframe"));
//		int coun=count.size();
//		System.out.println("frame counts:"+coun);
//	
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("Click"));
		element.click();
		String text = element.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement element3 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(element3);
		WebElement element2 = driver.findElement(By.id("Click1"));
		element2.click();
		driver.switchTo().defaultContent();
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int size = elements.size();
		System.out.println("size:"+size);
		driver.quit();

	}

}
