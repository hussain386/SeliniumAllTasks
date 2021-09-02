package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1printeven {

	public static void main(String[] args) throws InterruptedException {
		// //label[text()='State and City']
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Ddnstatecity = driver.findElement(By.xpath("//label[text()='State and City']"));
		Select ss=new Select(Ddnstatecity);
		List<WebElement> options = ss.getOptions();
		for (WebElement web : options) {
			System.out.println(web.getText());
			
		}
		driver.close();
	}

}
