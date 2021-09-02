package Day10taskwindowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8windowhandling {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement searchbox = driver.findElement(By.id("inputValEnter"));
		searchbox.sendKeys("hand sanitizer"+Keys.ENTER);
		Thread.sleep(4000);
		WebElement clickproduct = driver.findElement(By.xpath("//p[text()='Lass Naturals 70% Alcohol Hand Rub Sanitizer 500ml 24H Ultra Moisturising Sanitizers 500 mL Pack of 1']"));
		clickproduct.click();
		Thread.sleep(4000);
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowid = driver.getWindowHandles();
		for (String childwindow : allwindowid) {
			if(!parentwindowid.equals(childwindow)) {//removing parentwindowid and getting only child window id
				driver.switchTo().window(childwindow);//switching to child window
				WebElement addtocart = driver.findElement(By.xpath("//span[text()='add to cart']"));
				addtocart.click();
			}
			
		}


		

	}

}
