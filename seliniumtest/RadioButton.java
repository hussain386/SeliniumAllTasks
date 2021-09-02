package seliniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();
		Thread.sleep(2500);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbox.click();
		Thread.sleep(2500);
		Alert alerts=driver.switchTo().alert();
		alerts.dismiss();
		
		WebElement prompt=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		prompt.click();
		Thread.sleep(2500);
		Alert promtalert=driver.switchTo().alert();
		promtalert.sendKeys("aaaa");
		promtalert.accept();
		
		

	}

}
