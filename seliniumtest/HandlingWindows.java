package seliniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		String oldwindow = driver.getWindowHandle();
		
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		Thread.sleep(2800);
		Set<String> newwindow = driver.getWindowHandles();
		for (String handle : newwindow) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(2800);
		WebElement editpage=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editpage.click();
		
		driver.close();
		driver.switchTo().window(oldwindow);
		Thread.sleep(2800);
		
		WebElement numofwindows=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		numofwindows.click();
		
		int getmultiwind=driver.getWindowHandles().size();
		System.out.println("count of windows:"+getmultiwind);
		Thread.sleep(2800);
		
		WebElement clickthis=driver.findElement(By.id("color"));
		clickthis.click();
		
		Thread.sleep(4900);
		Set<String> newchild=driver.getWindowHandles();
		for (String closenew : newchild) {
			if(!closenew.equals(oldwindow)) {
				driver.switchTo().window(closenew);
				driver.close();
		}
		
		}
	}
}
