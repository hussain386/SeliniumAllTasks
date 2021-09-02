package Day10taskwindowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Task9redmi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement closewindow = driver.findElement(By.xpath("//button[text()='✕']"));
		closewindow.click();
		Thread.sleep(2000);
		WebElement searchproduct = driver.findElement(By.xpath("//input[@name='q']"));
		searchproduct.sendKeys("redmi phone"+Keys.ENTER);
		Thread.sleep(2000);
		WebElement hoverhere = driver.findElement(By.xpath("//div[text()='REDMI 9i (Midnight Black, 64 GB)']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(hoverhere).perform();
		ac.click();
		
			String parentwindow = driver.getWindowHandle();
		System.out.println("parentwindow id:"+parentwindow);
		
		Set<String> allwindowid = driver.getWindowHandles();
		for (String allid : allwindowid) {
			if(!allid.equals(parentwindow)) {
				driver.switchTo().window(allid);
				WebElement productprice = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
				String text = productprice.getText();
				System.out.println("price:"+text);
			}
		}
		}

		}
