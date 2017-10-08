package com.library;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseAutomation {
	
	public DesiredCapabilities capabilities;
	public static AndroidDriver driver;
	public static String sdirectorypath = System.getProperty("user.dir"); 
	public static String apkpath = sdirectorypath + "\\apkfile\\Finovera-debug.apk";
	
	
	@BeforeMethod 
	public void setUp() throws MalformedURLException{
		System.out.println(sdirectorypath);
		System.out.println(apkpath);
		
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", GenericClass.getProperties("AUTOMATIONNAME"));
		capabilities.setCapability("platformName", GenericClass.getProperties("PLATFORMNAME"));
		capabilities.setCapability("deviceName", GenericClass.getProperties("DEVICENAME"));
		capabilities.setCapability("platformVersion", GenericClass.getProperties("PLATFORMVERSION"));
		capabilities.setCapability("app", apkpath);
		capabilities.setCapability("appPackage", "com.finovera.mobile");
		capabilities.setCapability("appActivity", ".Finovera");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
