package Day12TJavaScriptask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task2scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();driver.
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement scrolldownto = driver.findElement(By.xpath("//div[@id='heading304']"));
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldownto);
		Thread.sleep(1000);
		WebElement scrollupto = driver.findElement(By.xpath("//div[@class='textwidget']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollupto);
	}

}
