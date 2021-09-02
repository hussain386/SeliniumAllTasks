package Taskselinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement gettxt1 = driver.findElement(By.xpath("//span[contains(text(),'149')]"));
		WebElement gettxt = driver.findElement(By.xpath("//span[contains(text(),'Opp to DLF')]"));
		WebElement gettxt2 = driver.findElement(By.xpath("//span[contains(text(),'1st')]"));
		WebElement gettxt3 = driver.findElement(By.xpath("//span[contains(text(),'Rama')]"));
		WebElement gettxt4 = driver.findElement(By.xpath("//span[contains(text(),'Ch')]"));
		

		String text = gettxt1.getText();
		String text2 = gettxt2.getText();
		String text1 = gettxt.getText();
		String text3 = gettxt3.getText();
		String text4 = gettxt4.getText();
		
		System.out.println("Adyar address:" + text+"\n"+text2+"\n"+text1+"\n"+text3+"\n"+text4);
		

	}

}
