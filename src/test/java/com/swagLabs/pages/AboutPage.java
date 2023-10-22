package com.swagLabs.pages;

import com.swagLabs.util.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

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
      WebElement icons = getWebElements(By.cssSelector("img[src$='double-chevron.svg']")).get(0);
      //For Move to Mouse Hover
        new Actions(driver).moveToElement(icons).build().perform();
        General.waitForDomStable();
        getWebElement(By.linkText("Platform for Test")).click();
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
