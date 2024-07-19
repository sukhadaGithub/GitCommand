package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass
{
	public void selectByVisibleText(WebElement w1,String Value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(w1)).click();
		Select s=new Select(w1);
		s.selectByVisibleText(Value);
	}
	
	public void selectByIndex(WebElement w1,int Value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(w1)).click();
		Select s=new Select(w1);
		s.selectByIndex(Value);
		
		
	}
	public void selectByValue(WebElement w1,String Value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(w1)).click();
		Select s=new Select(w1);
		s.selectByValue(Value);
		
	}
 

}
