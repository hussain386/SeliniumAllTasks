package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task11printnoofoption {

	public static void main(String[] args) throws InterruptedException {
		// //select[@id='adult_room']
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ameeribrahim");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("A41392");

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement dropdnroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select ss = new Select(dropdnroom);
		List<WebElement> options = ss.getOptions();
		int size = options.size();
		int count1 = 0;
		for (WebElement noofoption : options) {
			if (!noofoption.getText().equals("- Select Adults per Room -")) {
				count1++;
			}
		}
		System.out.println("No of option available in Adults per Room:" + count1);
		// driver.close();
	}

}
