package com.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Test;

public class TestRiunner_ex extends Test{
	
	public static WebDriver driver=Test.getBrowser("Chrome");
	public static 	Homepage hp = new Homepage(driver);
	public static Loginpage lp = new Loginpage(driver);
	public static void main(String[] args) throws IOException {
		
		getUrl("http://automationpractice.com/index.php");
		clickOnElement(hp.getSigIn());		
		inputvalueElement(lp.getEmail(),"roopa@gmail.com");			
		inputvalueElement(lp.getPassword(),"roopa1234");		
		clickOnElement(lp.getSignin_Btn());	
		screenshot("Loginpage");		
		driver.close();
		
	
		
		
	}

}
