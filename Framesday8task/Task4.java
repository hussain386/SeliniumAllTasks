package Framesday8task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
			driver.manage().window().maximize();
			
			WebElement clickcontinue = driver.findElement(By.xpath("(//input[@value='Login'])[1]"));
			Actions ac=new Actions(driver);
			ac.moveToElement(clickcontinue).perform();
			clickcontinue.click();
			Alert al=driver.switchTo().alert();
			al.accept();
			
			
			
	}

}
