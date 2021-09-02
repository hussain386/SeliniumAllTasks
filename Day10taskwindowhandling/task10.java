package Day10taskwindowhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement closewindow = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closewindow.click();
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("mask"+Keys.ENTER);
		Robot r=new Robot();
		r.mouseMove(100, 300);
		Thread.sleep(2000);
		WebElement choosemask = driver.findElement(By.xpath("//a[text()='PM N95 Mask']"));
		choosemask.click();
		Set<String> allwindowid = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(allwindowid);
		driver.switchTo().window(al.get(1));
		int size = al.size();
		System.out.println(size);
		
		WebElement printcost = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = printcost.getText();
		System.out.println("cost of product:"+text);
	}

}
