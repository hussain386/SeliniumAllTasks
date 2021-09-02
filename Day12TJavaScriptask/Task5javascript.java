package Day12TJavaScriptask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5javascript {

	public static void main(String[] args) throws InterruptedException {
		//A41392
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement username = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','ameeribrahim')", username);
		System.out.println("username:"+js.executeScript("return arguments[0].getAttribute('value')", username));
		
		WebElement password = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','A41392')", password);
		System.out.println("password:"+js.executeScript("return arguments[0].getAttribute('value')", password));
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()",login);
		driver.close();

	}

}
