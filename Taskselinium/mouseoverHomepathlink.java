package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverHomepathlink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement alldepart = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(alldepart).perform();
		Thread.sleep(2000);
		WebElement toheat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		ac.moveToElement(toheat).perform();
		Thread.sleep(2000);
		WebElement toair = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		ac.moveToElement(toair).perform();
		Thread.sleep(2000);
		WebElement selectport = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		ac.moveToElement(selectport).perform();
		selectport.click();
	}

}
