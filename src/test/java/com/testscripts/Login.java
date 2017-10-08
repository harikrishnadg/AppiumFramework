package com.testscripts;

import org.testng.annotations.Test;

import com.library.BaseAutomation;

public class Login extends BaseAutomation {

	@Test
	public void loginModule() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("login module");
	}
	

}
