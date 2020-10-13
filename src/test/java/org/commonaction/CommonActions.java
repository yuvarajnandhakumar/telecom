package org.commonaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
	
	public static WebDriver driver;

	public void launch(String url)
	{
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.get(url);   
		driver.manage().window().maximize();
	}
	
	public void instertext(WebElement ele, String value) 
	{
		ele.sendKeys(value);
		System.out.println("element is inserted");
	}
	
	public void submit(WebElement ele)
	{
		ele.click();
		System.out.println("element is clicked");
	}
	
	public void draganddrop()
	{
		
	}
	
	public void ff(WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	
	public void dispayornot(WebElement ele)
	{
		boolean tt = ele.isDisplayed();
		if(tt==true)
		{
			System.out.println(tt +" is found in webpage");
		}
		else
		{
			System.out.println(tt +" is not found in webpage");
		}
	}
	
	
	public void acceptalert()
	{
		driver.switchTo().alert().accept();
	}
	
	public void waittime() throws InterruptedException
	{
		Thread.sleep(3000);
	}

}
