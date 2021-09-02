package WebTableDay11Tsak.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2printfirstrow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		List<WebElement> tablerows = driver.findElements(By.tagName("tr"));
		
		WebElement firstrow = tablerows.get(0);
		System.out.println("1st:"+firstrow.getText());
		
		List<WebElement> tabledata = firstrow.findElements(By.tagName("td"));
		System.out.println(tabledata.get(0).getText());
		for (WebElement data : tabledata) {
			System.out.println("first row data:"+data.getText());
			}
	

	}

}
