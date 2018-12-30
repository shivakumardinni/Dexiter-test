package com.dexiter.test.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.dexiter.utils.DataHandlers;

public class TestConfiguration {
public static WebDriver getinstance()
{
	WebDriver driver=null;
	String browserType=DataHandlers.getDataFromPropertyFile("configuration","browser");
	String url=DataHandlers.getDataFromPropertyFile("configuration","url");
	if(browserType.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webDriver.firefox.marionette","./browser-server/geckodriver.exe");
	}
	else if(browserType.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webDriver.chrome.driver","./browser-server/chromedriver.exe");	
	}
	else
	{
		System.err.println("---invalid browser type--");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(url);
	return driver;
	
	
}
}
