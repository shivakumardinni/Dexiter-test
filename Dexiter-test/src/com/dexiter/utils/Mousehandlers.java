package com.dexiter.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehandlers {
public static void mouseHoverOnElement(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
public static void doubleclickOnElement(WebDriver driver, WebElement element)
{
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
}
public static void dragAndDropElement(WebDriver driver, WebElement src,WebElement target)
{
	Actions act=new Actions(driver);
	act.dragAndDrop(src,target).perform();
}
}
