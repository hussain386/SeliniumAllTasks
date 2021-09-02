package Day12TJavaScriptask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4sendvaluebyJavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','hussaiankain')", username);
		System.out.println("username:"+js.executeScript("return arguments[0].getAttribute('value')", username));
		
		WebElement pass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','123456')", pass);
		System.out.println("password:"+js.executeScript("return arguments[0].getAttribute('value')", pass));
		
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		js.executeScript("arguments[0].click()",login);
	}

}
