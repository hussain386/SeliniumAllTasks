package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		WebElement signUP = driver.findElement(By.className("r2iyh"));
		signUP.click();
		
		WebElement name = driver.findElement(By.id("mobile"));
		name.sendKeys("8838052142");
		WebElement findElement = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		findElement.sendKeys("Satham");
		
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		findElement2.sendKeys("hussainkain@gmail.com");
		
		WebElement findElement3 = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		findElement3.sendKeys("6366713az");
		
	}

}
