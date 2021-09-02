package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task4Printallmonth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement createacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createacc.click();
		Thread.sleep(3000);
		WebElement dpDnmonth = driver.findElement(By.id("month"));
		Select se=new Select(dpDnmonth);
		List<WebElement> options = se.getOptions();
		int i=0;
		for (WebElement it : options) {
			System.out.println("month options:"+it.getText());
			i++;
			
		}

	}

}
