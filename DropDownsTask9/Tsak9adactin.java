package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tsak9adactin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ameeribrahim");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("A41392");
		
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement dropdnroom = driver.findElement(By.id("room_type"));
		Select ss=new Select(dropdnroom);
		List<WebElement> options = ss.getOptions();
		int size = options.size()
;		for (int i = 1; i <size; i++) {
			WebElement webElement = options.get(i);
			System.out.println("option in roomtype:"+webElement.getText());
		}
		
	}

}
