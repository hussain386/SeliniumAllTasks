package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task6printcountry {

	public static void main(String[] args) throws InterruptedException {
		// http://demo.guru99.com/test/newtours/register.php
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement countrylist = driver.findElement(By.xpath("//select[@name='country']"));
		Select ss=new Select(countrylist);
		List<WebElement> options = ss.getOptions();
		int size = options.size();
		System.out.println("count of options i countries"+size);
		int i=0;
		for (WebElement itt : options) {
			System.out.println("list of countries:"+itt.getAttribute("value"));
			i++;
			
		}
		driver.close();
	}

}
