package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverwithSelinium{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/courses.html");
		WebElement courses = driver.findElement(By.xpath("//a[text()='Courses ']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(courses).perform();
		WebElement oracle = driver.findElement(By.xpath("//a[text()='Oracle Training ']"));
		ac.moveToElement(oracle).perform();
		WebElement clickoracle = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Training']"));
		ac.moveToElement(clickoracle).perform();
		clickoracle.click();
		
		
	}

}
