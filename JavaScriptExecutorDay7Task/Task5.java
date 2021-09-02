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

public class Task5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// http://greenstech.in/selenium-course-content.html
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement scrolldownto = driver.findElement(By.xpath("//div[@id='heading2011']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldownto);
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File d=new File("D:\\screenshots\\screnng.png");
		FileUtils.copyFile(screen, d);
		Thread.sleep(1000);
		WebElement scrollupto = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrollupto);
		


	}

}
