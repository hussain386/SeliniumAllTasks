package WebTableDay11Tsak.com;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		List<WebElement>tablerows = driver.findElements(By.tagName("tr"));
		int size = tablerows.size();
		System.out.println(size);
		for (int i = 0; i < tablerows.size(); i++) {
			WebElement zerothrow = tablerows.get(i);
		
		
		List<WebElement> zerothrowdata = zerothrow.findElements(By.tagName("td"));
		for (WebElement data : zerothrowdata) {
			System.out.println("all data in row1&2:"+data.getText());
		}	
		}
		
		

	}
	}
