package com.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SimpleDemo {
Logger LOG = Logger.getLogger(Orangehrmlogin.class.getName());
	
	public WebDriver driver;
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginbtn = By.id("btnLogin");
	
	
	public Orangehrmlogin(WebDriver driver)
	{
		this.driver = driver;
	}
	//enter the username
	public void LoginToApp_username(String userid)
	{
		driver.findElement(username).sendKeys("Admin");
		LOG.info("Entered user name in the username feild");
	}
	//enter the password
	public void LoginToApp_password(String pass)
	{
		driver.findElement(password).sendKeys("admin@123");
		LOG.info("entered password in the password feild");
	}
	//click the loginbutton
	public void LoginToApp_loginbtn()
	{
		driver.findElement(loginbtn).click();
		LOG.info("login is clicked");
	}
	

}
