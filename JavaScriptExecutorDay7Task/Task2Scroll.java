package JavaScriptExecutorDay7Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Scroll {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement scrollupto = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollupto);
		Thread.sleep(1000);
		WebElement scrollup = driver.findElement(By.xpath("//span[contains(text(),'Latest')]"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollup);

	}

}
