package com.dexiter.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlers {
	public static void selectDDlByIndex(WebElement ddl, int index)
	{
		Select set=new Select(ddl);
		set.selectByIndex(index);
	}
	public static void selectDDlByValue(WebElement ddl, String value)
		{
			Select set=new Select(ddl);
			set.selectByValue(value);
		}
	public static void selectDDlByVisibletext(WebElement ddl, String value)
		{
				Select set=new Select(ddl);
				set.selectByVisibleText(value);
			}
			
	public static void deselectDDlByIndex(WebElement ddl, int index)
				{
					Select set=new Select(ddl);
					set.deselectByIndex(index);
				}
	public static void deselectDDlByvalue(WebElement ddl, String value)
					{
						Select set=new Select(ddl);
						set.deselectByValue(value);
					}
	public static void deselectDDlByVisibleText(WebElement ddl, String value)
	{
		Select set=new Select(ddl);
		set.deselectByVisibleText(value);
	}
	public static void deselectDDlByAll(WebElement ddl)
	{
		Select set=new Select(ddl);
		set.deselectAll();
	}
	
}
