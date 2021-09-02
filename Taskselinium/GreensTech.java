package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/courses.html");
		Thread.sleep(3000);
		WebElement courses = driver.findElement(By.xpath("//a[text()='Courses ']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();	
		Thread.sleep(3000);

		WebElement softtesttraining = driver.findElement(By.xpath("//a[text()='Software Testing Training ']"));
		ac.moveToElement(softtesttraining).perform();
		Thread.sleep(2800);
		WebElement selinium = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
		ac.moveToElement(selinium).perform();
		selinium.click();
	}

}
