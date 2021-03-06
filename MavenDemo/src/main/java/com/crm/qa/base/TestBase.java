package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.util.Testutil;

public class TestBase {

private static final WebElement String = null;
public static WebDriver driver;
public static Properties prop;


public TestBase() throws Exception

{
	try {
		
		prop=new Properties();
		FileInputStream ip=new FileInputStream(".//configFile/config.properties");
		
		
		
		prop.load(ip);
	
}   catch(FileNotFoundException e)
	
	{
		e.printStackTrace();
	
	} catch(IOException e)
	
	{
		e.printStackTrace();
	}
}


public static void initialization()

{
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
		
		
		driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("FF"))
	{
		
		System.setProperty("webdriver.chrome.driver",".//Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
}


}
