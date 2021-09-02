package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintParagraph {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement gettxt = driver.findElement(By.xpath("//p[contains(text(),'is a leading')]"));
		String text = gettxt.getText();
		System.out.println(text);
		
	}

}
