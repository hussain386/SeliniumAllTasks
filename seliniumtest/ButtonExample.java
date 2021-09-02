package seliniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hussain\\eclipse-workspace\\Seliniumtestingweb\\src\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getbutton=driver.findElement(By.id("position"));
		getbutton.click();
		
		Point xypoint= getbutton.getLocation();
		int xpoint=xypoint.getX();
		int ypoint=xypoint.getY();
		System.out.println("xypoints:"+"xpoint"+xpoint+"ypoint:"+ypoint);
		
		WebElement getcolour=driver.findElement(By.id("color"));
		getcolour.click();
		String colour=getcolour.getCssValue("background-color");
		System.out.println("colour:"+colour);
		
		WebElement getsize=driver.findElement(By.id("size"));
		getsize.click();
		int hsize=getsize.getSize().getHeight();
		int wsize=getsize.getSize().getHeight();
		System.out.println("size:"+hsize+" "+wsize);
		
		
		WebElement gotopage=driver.findElement(By.xpath("//*[@id=\"home\"]"));
		gotopage.click();
		
		
		
		
		
		

	}

}
