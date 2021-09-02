package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownTask1 {

	public static void main(String[] args) throws InterruptedException {
		// http://demoqa.com/automation-practice-form/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement createacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createacc.click();
		Thread.sleep(3000);
		WebElement dDnslectstate = driver.findElement(By.xpath("//*[@id='year']"));
		Select ss=new Select(dDnslectstate);
		List<WebElement> options = ss.getOptions();
		int size = options.size();
		System.out.println("size:"+size);
		int i=0;
		for (WebElement e : options) {
			System.out.println("options in month:"+e.getAttribute("value"));
			i++;
		}
		driver.close();
	}
}



