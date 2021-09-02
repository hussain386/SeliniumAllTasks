package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QaForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("satham");
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("hussain");
		
		WebElement gmail = driver.findElement(By.id("userEmail"));
		gmail.sendKeys("hussainkain@gmail.com");
		
		WebElement select = driver.findElement(By.className("custom-control-label"));
		select.click();
		
		WebElement findElement = driver.findElement(By.xpath("(//input[@type='text'])[4]"));	
		findElement.sendKeys("994133241");
		
		WebElement findElement2 = driver.findElement(By.id("dateOfBirthInput"));
		findElement2.sendKeys("14 may 1996");
		
		
	}

}
