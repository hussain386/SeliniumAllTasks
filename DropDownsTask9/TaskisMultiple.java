package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskisMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement dropdn = driver.findElement(By.id("fruits"));
		Select ss = new Select(dropdn);
		List<WebElement> options = ss.getOptions();
		for (int i = 0; i <options.size(); i++) {
			if(i%2==0) {
				ss.selectByIndex(i);
			}
		}
//			if(ss.isMultiple()) {
//				System.out.println("multiple options selected");
//			}else
//			{
//				System.out.println("not multiple options ");
//			}
//			List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
//			for (WebElement webElement : allSelectedOptions) {
//				System.out.println("selceted option list:"+webElement.getText());
//				
//			}
//			
//			ss.deselectAll();
//		
		List<WebElement> alloptions = ss.getOptions();
		List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
		alloptions.removeAll(allSelectedOptions);
		for (WebElement webElement : alloptions) {
			System.out.println("non slected options:"+webElement.getText());
			
		}
		
			
		}
		}
//	}


