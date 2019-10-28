package com.Alert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandles {
	

	@Test
	public void windowhandles() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(@href,'popup.php')]")).click();
		String MainWindow=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext()) {
			String Childwindow=i1.next();
			if(!MainWindow.equalsIgnoreCase(Childwindow)) {
				
				driver.switchTo().window(Childwindow);
				
				//String childwindowtitle=driver.get.Text();
				
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Guarav");
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		
	}
}
