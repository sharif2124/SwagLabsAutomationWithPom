package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestDemoPage extends BasePage{
    public RequestDemoPage(WebDriver driver) {
        super(driver);
    }
    public boolean RequestDemoPageHasSuccess(){
        return getWebElements(By.id("form_3124")).size()>0;
    }
}
