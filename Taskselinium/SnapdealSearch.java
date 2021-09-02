package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SnapdealSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
	
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Sign In']"));
		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='login']"));
		findElement2.click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement numpass = driver.findElement(By.id("userName"));
		numpass.sendKeys("8838052142");
		WebElement btncontinue = driver.findElement(By.id("checkUser"));
		btncontinue.click();
	}
	

}

