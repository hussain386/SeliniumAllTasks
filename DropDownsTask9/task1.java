package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		//https://demoqa.com/automation-practice-form/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dropdn = driver.findElement(By.xpath("//div[text()='Select State']"));
		Thread.sleep(1000);
		Select ss= new Select(dropdn);
		List<WebElement> options = ss.getOptions();
		int size = options.size();
		for (int i = 0; i < size; i++) {
			if(i%2==1) {
				ss.selectByIndex(i);
			}
			
		}
	}

}
