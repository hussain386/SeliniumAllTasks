package Taskselinium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerform {

	public static void main(String[] args) {
		//
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
		firstname.sendKeys("Hussain");
		
		WebElement lastname= driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input"));
		lastname.sendKeys("S");
		
		WebElement address=driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea"));
		address.sendKeys("xyz Street,abc building ,chennai-600055");
		
		WebElement findElement = driver.findElement(By.xpath("//*[@id=\'eid\']/input"));
		findElement.sendKeys("hussainkain@gmail.com");
		
		WebElement phone= driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[4]/div/input"));
		phone.sendKeys("7637263673");
		
		WebElement clickbuttton = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		clickbuttton.click();

		WebElement selectbutton = driver.findElement(By.className("ui-autocomplete-multiselect-item"));
		Select selection=new Select(selectbutton);
		selection.selectByVisibleText("Arabic");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select selects=new Select(skills);
		selects.selectByIndex(7);
//		
//		driver.findElement(By.id("countries"));
//		Select country=new Select(findElement);
//		country.selectByIndex(3);
//		
//		WebElement selectcountry = driver.findElement(By.className("select2-selection select2-selection--single"));
//		Select selects2=new Select(findElement);
//		selects2.selectByVisibleText("India");
		
		WebElement dob = driver.findElement(By.id("yearbox"));
		Select se=new Select(dob);
		se.selectByValue("1996");
		
		WebElement findElement2 = driver.findElement(By.xpath("//*v[2]/select"));
		Select se1=new  Select(findElement2);
		se1.selectByValue("May");
		
		WebElement findElement3 = driver.findElement(By.xpath("//*[@id=\'daybox\']"));
		Select se3=new  Select(findElement3);
		se3.selectByValue("14");
		
		
		
	}

}
