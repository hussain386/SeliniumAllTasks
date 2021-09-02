package Task6selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
		List<WebElement> multipleitems = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int size = multipleitems.size();
		System.out.println(size);
		Actions ac = new Actions(driver);
		// ac.keyDown(Keys.CONTROL).click(multipleitems.get(0)).click(multipleitems.get(1)).click(multipleitems.get(2)).perform();;

		for (int j = 0; j < size; j++) {
			if(j==3) {
				break;
			}
			ac.clickAndHold(multipleitems.get(j)).perform();
		}
	}

}
