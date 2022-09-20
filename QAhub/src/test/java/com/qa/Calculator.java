package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pageobjectes.MavenCucumberPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator {
	
	MavenCucumberPage mavencucumber=new MavenCucumberPage();
	WebDriver  driver;
	
	@Given("User open the chrome")
	public void user_ope_the_chrome() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\OneDrive\\My Documents\\New folder\\QAhub\\src\\test\\resources\\chromedriver.exe");  
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
	}
	@Given("^User open website$")
	public void openwebsite() {
		driver.get("https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/6.11.0");
	}
	@When("^when user click on gradel$")
	public void clickOnGreadle() {
		driver.findElement(mavencucumber.Gradel).click();
		
	}
	
	@When("^when user click on SBT$")
	public void clickOnSBT() {
		driver.findElement(By.xpath("//a[@href=\"#sbt\"]")).click();
		
	}
	@Then("^User should see implemtation$")
	public void getGradletext() {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String v=driver.findElement(By.id("gradle-a")).getText();
		System.out.println("Text area value "+v);
		assertTrue(v.contains("testImplementation group:"));
		
	}
	
	
	@Then("^User should see libraryDependencies$")
	public void getlibraryDependencies() {
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String v=driver.findElement(By.id("sbt-a")).getText();
		System.out.println("Text area value "+v);
		assertTrue(v.contains("libraryDependencies"));
		
	}
	
//		public static void main(String[] args) {
//			
//			Calculator m1=new Calculator();
//				
//				m1.openChrome();
//				m1.openwebsite();
//				try {
//					Thread.sleep(2);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				m1.clickOnGreadle();
//				m1.getGradletext();
//				
//			}
			

}
