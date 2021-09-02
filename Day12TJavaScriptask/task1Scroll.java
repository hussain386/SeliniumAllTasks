package Day12TJavaScriptask;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task1Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement scrollupto = driver.findElement(By.xpath("(//span[@class='red_text'])[5]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollupto);
		Thread.sleep(1000);
		WebElement address = driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));//Greens Technology
		String attribute = address.getText();
		System.out.println(attribute);
		WebElement printaddres = driver.findElement(By.xpath("//strong[contains(text(),'149, 1C/1D, 1st Floor,')]"));
		String text = printaddres.getText();
				System.out.println(text);;		
	

	}

}
