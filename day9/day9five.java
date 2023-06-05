package com.example.testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class day9five {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }
  @Test
  public void f() throws InterruptedException {
	  String actualurl=driver.getCurrentUrl();
	  Thread.sleep(3000);
	  WebElement userName=driver.findElement(By.name("username"));
	  userName.sendKeys("Admin");
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(3000);
	  String expectedurl=driver.getCurrentUrl();
	  Assert.assertNotEquals(actualurl,expectedurl);
	  Thread.sleep(4000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
