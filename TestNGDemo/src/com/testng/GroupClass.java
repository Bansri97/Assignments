package com.testng;

import org.testng.annotations.Test;

public class GroupClass {
  @Test(groups = {"red"})
  public void red1() {
	  System.out.println("red 1");
  }
  @Test(groups = {"red"})
  public void red2() {
	  System.out.println("red 2");
  }
  @Test(groups = {"red"})
  public void red3() {
	  System.out.println("red 3");
  }
  
  @Test(groups = {"Green"})
  public void Green1() {
	  System.out.println("Green 1");
  }
  @Test(groups = {"Green"})
  public void Green2() {
	  System.out.println("Green 2");
  }
  @Test(groups = {"Green"})
  public void Green3() {
	  System.out.println("Green 3");
  }
  
  @Test(groups = {"Blue"})
  public void Blue1() {
	  System.out.println("Blue 1");
  }
  @Test(groups = {"Blue"})
  public void Blue2() {
	  System.out.println("Blue 2");
  }
  @Test(groups = {"Blue"})
  public void Blue3() {
	  System.out.println("Blue 3");
  }
  
  @Test(groups = {"Blue","red"})
  public void Blue_red() {
	  System.out.println("Blue_red");
  }
  @Test(groups = {"Blue","Green"})
  public void Blue_Green() {
	  System.out.println("Blue_Green");
  }
  @Test(groups = {"red","Green"})
  public void red_Green() {
	  System.out.println("red_Green");
  }
}

