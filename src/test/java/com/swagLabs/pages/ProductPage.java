package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public boolean hasProductCompleteTest(){
        return getWebElements(By.id("__next")).size()>0;
    }

}
