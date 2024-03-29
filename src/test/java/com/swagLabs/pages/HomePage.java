package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public boolean hasLogoutLink(){
       return getWebElements(By.id("logout_sidebar_link")).size()>0;
    }

    public NaviGatePage clickNaviGateBtn(){
        getWebElement(By.id("react-burger-menu-btn")).click();
        return getInstance(NaviGatePage.class);
    }
}
