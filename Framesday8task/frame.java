package Framesday8task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		List<WebElement> frames = driver.findElements(By.tagName("frame"));
//		int size = frames.size();
//		System.out.println(size);
//		WebElement ff = frames.get(0);
//		driver.switchTo().frame(ff);
//		WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
//		login.sendKeys("hussain");

	}

}
