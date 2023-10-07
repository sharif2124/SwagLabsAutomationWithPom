package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage{
    public AboutPage(WebDriver driver) {
        super(driver);
    }
    public boolean hasAboutCompleteTest(){
      return   getWebElements(By.className("MuiToolbar-root")).size()>0;
    }
    public PricePage clickpricePage(){
        getWebElement(By.linkText("Pricing")).click();
        return getInstance(PricePage.class);
    }
    public ProductPage clickProductPage(){
        getWebElement(By.linkText("Products")).click();
        return getInstance(ProductPage.class);
    }
    public SignInPage clickSignInPage(){
        getWebElement(By.linkText("Sign in")).click();
        return getInstance(SignInPage.class);
    }
    public RequestDemoPage clickRequestDemoPage(){
        getWebElement(By.linkText("Request a demo")).click();
        return getInstance(RequestDemoPage.class);
    }
}
