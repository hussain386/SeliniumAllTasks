package WebTableDay11Tsak.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printevenrows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tablepath = driver.findElement(By.xpath("(//table)[2]"));
		List<WebElement> tableRow = tablepath.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRow.size(); i++) {
			if (i % 2 == 0) {
				WebElement tablerows = tableRow.get(i);
				List<WebElement> tablecellordata = tablerows.findElements(By.tagName("td"));
				for (WebElement evenrowdata : tablecellordata) {
					System.out.println("even row datas:" + evenrowdata.getText());

				}
				
			}

		}
		
	
	}

}
