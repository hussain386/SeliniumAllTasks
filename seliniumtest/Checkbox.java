package seliniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		//*[@id="contentblock"]/section/div[1]/div[1]/input
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.leafground.com/pages/checkbox.html");	
		WebElement java=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		java.click();
		
		WebElement ischecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
	
		boolean say=ischecked.isSelected();
		System.out.println("isselected"+say);
		
		WebElement uncheck=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		if(uncheck.isSelected()) {
			uncheck.click();
		}
		
		
		
	}

}
