package Task6selinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement alertwithok = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		alertwithok.click();
		
		WebElement clickalertbox = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		clickalertbox.click();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		WebElement confirmalert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirmalert.click();
		Thread.sleep(5000);
		WebElement confirmbox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmbox.click();
		
		Alert al1=driver.switchTo().alert();
		al1.dismiss();
		
		WebElement alertwithtextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		alertwithtextbox.click();
		
		WebElement clicktextbox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		clicktextbox.click();
		
		Alert al2=driver.switchTo().alert();
		al2.sendKeys("satham");
		al2.accept();
		
		
		
	}

}
