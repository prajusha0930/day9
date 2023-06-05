package com.example.testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;


public class day9 {
CalculatorLogic c1=new CalculatorLogic();
  @Test(dataProvider = "testData")
  public void f(int a,int b,int expected) {
	  int result=c1.add(a,b);
	  Assert.assertEquals(expected,result);
  }
  @Test(dataProvider="Data")
  public void d(int c,int d,int expected) {
	  int result=c1.sub(c,d);
	  Assert.assertEquals(expected,result);
  }
  @Test(dataProvider="Datate")
  public void m(int v,int u,int expected) {
	  int result=c1.mul(v,u);
	  Assert.assertEquals(expected,result);
  }
  @Test(dataProvider="Datates")
  public void di(int n,int p,int expected) {
	  int result=c1.div(n,p);
	  Assert.assertEquals(expected,result);
  }
  @Test
@DataProvider
  public Object[][] testData() {
    return new Object[][] {
    	{1,2,3}
    };
  }
  @DataProvider
  public Object[][] Data() {
	  return new Object[][] {
		  {5,2,3}
	  };
  }
  @DataProvider
  public Object[][] Datate() {
	  return new Object[][] {
		  {5,2,10}
	  };
  }
  @DataProvider
  public Object[][] Datates() {
	  return new Object[][] {
		  {10,2,5}
	  };
  }
}
