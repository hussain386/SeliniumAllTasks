package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pendingTask5Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(1000);
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		Thread.sleep(4000);
		WebElement mouseover = driver.findElement(By.xpath("//div[text()='Home']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mouseover).perform();
		WebElement tohomefurnish = driver.findElement(By.xpath("//a[text()='Home Furnishings']"));
		ac.moveToElement(tohomefurnish).perform();
		WebElement tobed = driver.findElement(By.xpath("//a[text()='Bed Linens']"));
		ac.moveToElement(tobed).perform();
		tobed.click();
		
		
		

		
	}

}
