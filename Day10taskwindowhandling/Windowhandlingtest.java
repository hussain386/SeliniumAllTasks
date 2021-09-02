package Day10taskwindowhandling;

import org.openqa.selenium.WebElement;

public class Windowhandlingtest extends MyBaseclass {

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadUrl("https://letcode.in/windows");
		maximizewindow();
		clickbutton(getWebElementId("multi"));
		Thread.sleep(4000);
		for (int i =windowsCount()-1; i>=0; i--) {
			WindowSwitch(i);
			pageUrl();
			WindowClose(i);
			System.out.println(i);
			
		}
		
		

	}

}
