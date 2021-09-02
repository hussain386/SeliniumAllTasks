package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class priiintEmailPass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hussain@gmail.com");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456777");
		
		String h=email.getAttribute("value");
		String h1=pass.getAttribute("value");
		
		System.out.println("email:"+h+"\n"+"password:"+h1);
		

	}

}
