package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefn {
WebDriver driver;
	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
	}
	@When("user should enter {string} {string}")
	public void user_should_enter(String user, String pass) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(user);
		WebElement txtpasssword = driver.findElement(By.id("password"));
		txtpasssword.sendKeys(pass);
	}
	@When("user should click login")
	public void user_should_click_login() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	    

	    
	}
	  

	


}