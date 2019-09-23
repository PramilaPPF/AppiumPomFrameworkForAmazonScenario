package com.qa.amazon.abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Pramila Fulari on 9/23/2019.
 */
public interface Page {
	
	public void waitForElementPresent(By locator);
	public WebElement getElement(By locator);
	public <TPage> TPage getInstance(Class<TPage> pageClass);
	
}
