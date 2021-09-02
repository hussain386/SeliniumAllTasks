package JavaScriptExecutorDay7Task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6scroll {

	public static void main(String[] args) throws IOException {
		// (//h3[@class='mb-0'])[12]
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement scrolldownto = driver.findElement(By.xpath("(//h6[text()='Greens Technology '])[1]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldownto);
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File screenshotAs = ts1.getScreenshotAs(OutputType.FILE);
		File f=new File("D:\\screenpath\\green.png");
		FileUtils.copyFile(screenshotAs, f);

	}

}
