package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverselinium1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//div[text()='Courses ']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();
		
		WebElement torpa = driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		ac.moveToElement(torpa).perform();
		
		WebElement selectblue = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		ac.moveToElement(selectblue).perform();
		selectblue.click();

	}

}
