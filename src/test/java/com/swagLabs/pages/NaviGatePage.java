package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaviGatePage extends BasePage{
    public NaviGatePage(WebDriver driver) {
        super(driver);
    }
    public boolean hasHomePage(){
        return getWebElements(By.id("inventory_container")).size()>0;
    }

        public AboutPage clickAboutPage(){
        getWebElement(By.id("about_sidebar_link")).click();
        return getInstance(AboutPage.class);
    }
}
