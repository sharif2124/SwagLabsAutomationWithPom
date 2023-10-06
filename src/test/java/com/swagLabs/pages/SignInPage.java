package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage{
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public boolean hasSignInCompleteTest(){
        return getWebElements(By.id("wrapper")).size()>0;
    }
}
