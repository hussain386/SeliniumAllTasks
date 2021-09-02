package Day12TJavaScriptask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task6flipcartjavascriptinterface {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','satham')", user);
		System.out.println("username:"+js.executeScript("return arguments[0].getAttribute('value')",user));
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])"));
		js.executeScript("arguments[0].setAttribute('value','88549')", pass);
		System.out.println("pass:"+js.executeScript("return arguments[0].getAttribute('value')", pass));
		
		WebElement login = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		js.executeScript("arguments[0].click()", login);
		//driver.close();
	}

}
