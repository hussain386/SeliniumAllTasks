package Taskselinium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/ ");
		driver.manage().window().maximize();
		  Thread.sleep(3000);
         Alert a = driver.switchTo().alert();
         a.accept();
         driver.switchTo().frame(0);
	
		WebElement findElement = driver.findElement(By.xpath("//span[@class='mobileNumberPlacholder']"));
		findElement.sendKeys("8838052142");

		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		findElement2.click();

	}

}
