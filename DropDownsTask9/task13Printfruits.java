package DropDownsTask9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task13Printfruits {

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
		int sizeofoptions = options.size();
		int selectedoption = 0;
		for (int j = 0; j < sizeofoptions; j++) {
			if (j % 2 == 0) {
				selectedoption++;
				ss.selectByIndex(j);
			}
		}
		System.out.println("selected option:" + selectedoption);
		int notselectedoption = sizeofoptions - selectedoption;
		System.out.println("no of options not selected:" + notselectedoption);
	}
}
