package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5PrintEvenDates {

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
		WebElement dpDnmonth = driver.findElement(By.id("day"));
		Select ss=new Select(dpDnmonth);
		List<WebElement> options = ss.getOptions();
		int size = options.size();
		System.out.println(size);
		for (WebElement i:options) {
			if(i.getText()!="Day") {
				
			}
			if(Integer.parseInt(i.getText())%2==0) {
			
			}
				System.out.println(i.getText());
		}
		
		
		
	}

}
