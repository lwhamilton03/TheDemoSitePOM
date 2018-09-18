package com.qa.exerciseDemoSite.TheDemoSiteExercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UserPageTesting {

	WebDriver driver = null; 
	private String str = "http://thedemosite.co.uk/addauser.php"; 
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Documents/Selenium/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	
	@Test 
	public void inputUser()
	{
		driver.get(str);
		UserPage page = PageFactory.initElements(driver, UserPage.class);
		page.createUser("Henrie", "Hoover");
	//NEED TO MAKE A NEW METHOD FOR IT TO DO ALL 3 THEN DO IT	
	//	assertEquals("username", "Henrie" , page.checkUsername.getText()); 
		assertTrue("User Has Not Been Created", page.checkUser()); 
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
