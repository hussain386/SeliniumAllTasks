package Day10taskwindowhandling;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11Printcost {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement closewindow = driver.findElement(By.xpath("//button[text()='✕']"));
		closewindow.click();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("hp laptop"+Keys.ENTER);
		Robot r=new Robot();
		r.mouseMove(100, 300);
		Thread.sleep(3000);
		WebElement clickproduct = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		clickproduct.click();
		WebElement printcost = driver.findElement(By.xpath("//div[@class='_25b18c']"));
		String text = printcost.getText();
		System.out.println("cost of product:"+text);
		
		
		
		
		
	}

}
