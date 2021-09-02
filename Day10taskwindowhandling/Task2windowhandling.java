package Day10taskwindowhandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seliniumTopic.SeleniumTestConstants;



public class Task2windowhandling {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(SeleniumTestConstants.SNAPDEAL);
		driver.manage().window().maximize();
		WebElement searchproduct = driver.findElement(By.id("inputValEnter"));
		searchproduct.sendKeys("Bluetooth headphone"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement clickproduct = driver.findElement(By.xpath("//p[text()='OBRONICS HItage  Bluetooth airbud Orginal Airpod Neckband Wireless With Mic Headphones/Earphones']"));
		clickproduct.click();
		Thread.sleep(3000);
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(allwindow);
		driver.switchTo().window(al.get(1));
		System.out.println("parentwindow id:"+parentwindow);
		
//		Set<String> allwindowid = driver.getWindowHandles();
//		for (String allid : allwindowid) {
//			if(!allid.equals(parentwindow)) {
//				driver.switchTo().window(allid);
				WebElement addcart = driver.findElement(By.xpath("//span[text()='add to cart']"));
				addcart.click();
				
//			}
//			
//			
//			
//		}
		

	}

}
