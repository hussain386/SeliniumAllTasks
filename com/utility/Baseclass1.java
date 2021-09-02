package com.utility;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Baseclass1 {
	
	static ArrayList<String> al;
	public static void WindowSwitch(int num) {
		WebDriver driver = null;
		Set<String> handles = driver.getWindowHandles();
		al=new ArrayList<String>();
		al.addAll(handles);
		driver.switchTo().window(al.get(num));
		
	}

}
