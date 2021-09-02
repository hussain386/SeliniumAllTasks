package seliniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtona {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement checked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean check1=unchecked.isSelected();
		System.out.println("unchecked:"+check1);
		boolean check2=checked.isSelected();
		System.out.println("checked:"+check2);
		
		
		WebElement select=driver.findElement(By.id("yes"));
		select.click();
		
		WebElement below20=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		below20.click();
		

	}

}
