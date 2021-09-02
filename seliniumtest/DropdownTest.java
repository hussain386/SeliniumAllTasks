package seliniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.TreeMultiset;

public class DropdownTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement sel=driver.findElement(By.id("dropdown1"));
		Select selects=new Select(sel);
		selects.selectByIndex(3);
		selects.selectByValue("2");
		selects.selectByVisibleText("Appium");
		
		List<WebElement> lists=selects.getOptions();
		int num=lists.size();
		System.out.println("getnumber:"+num);
		
		sel.sendKeys("Selenium");
	
		WebElement mulselect=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		
		Select multiselect=new Select(mulselect);
		multiselect.selectByIndex(1);
		multiselect.selectByIndex(2);
		multiselect.selectByIndex(3);
		
		
		
		
		
		
		
				}

}
