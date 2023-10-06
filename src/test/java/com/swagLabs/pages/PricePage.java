package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricePage extends BasePage{
    public PricePage(WebDriver driver) {
        super(driver);
    }
public boolean hasPriceCompleteTest(){
        return getWebElements(By.id("__next")).size()>0;
}
}
