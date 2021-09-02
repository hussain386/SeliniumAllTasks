package Task6selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		
		WebElement passvalue = driver.findElement(By.id("tags"));
		passvalue.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> optionlist= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int s=optionlist.size();
		System.out.println(s);
		for (WebElement Element : optionlist) {
			if(Element.getText().equals("SOAP")) {
				Element.click();
			break;
			}
			else {
				System.out.println("other");
			}
		}
		
		}

	}


