package com.example.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day9two {
	WebDriver driver;
  @Test(groups={"smoketest"})
  public void f() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, driver.getTitle());
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
  }
  @Test(groups={"Regressiontest"})
  public void test2() throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
		Thread.sleep(1500);
		driver.close();
  }
  @Test(groups= {"regree"})
  public void test3() throws InterruptedException{
	  WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
		String expected_title=driver.getTitle();
		System.out.println(expected_title);
		Assert.assertEquals(expected_title,driver.getTitle());
		Thread.sleep(1500);
		WebElement verifysearch=driver.findElement(By.xpath("//*[@id=\"search-input-afdae88f-594d-4335-b9e1-6c749f63db12\"]"));
   	    verifysearch.isDisplayed();
   	    Thread.sleep(3000);
   	    WebElement verifybuy=driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button"));
   	    verifybuy.isDisplayed();
   	    Thread.sleep(3000);
   	    WebElement search=driver.findElement(By.name("searchText"));
   	    search.sendKeys("mydomain",Keys.ENTER);
   	    WebElement verifyaddtocart=driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button"));
	    verifyaddtocart.isDisplayed();
	    Thread.sleep(3000);
	    WebElement verifyprice=driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span"));
	    verifyprice.isDisplayed();
	    Thread.sleep(3000);
	    driver.close();
  }
}
