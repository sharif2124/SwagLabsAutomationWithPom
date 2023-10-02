package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginPage extends BasePage{
    public UserLoginPage(WebDriver driver) {
        super(driver);
    }
    public UserLoginPage fillUserName(String name){
  getWebElement(By.id("user-name")).sendKeys("standard_user");
  return this;
    }
    public UserLoginPage fillPassword(String password){
        getWebElement(By.id("password")).sendKeys("secret_sauce");
        return this;
    }
    public HomePage clickLogin(){
        getWebElement(By.id("login-button")).click();
        return getInstance(HomePage.class);
    }
    public UserLoginPage clickLoginFail(){
        getWebElement(By.id("login-button")).click();
        return this;
    }
    public UserLoginPage doLogin(){
        return clickLoginFail();
    }
    public UserLoginPage doLogin(String name){
       return fillUserName(name)
               .clickLoginFail();

    }
    public HomePage doLogin(String name,String password){
        return  fillUserName(name)
                .fillPassword(password)
                .clickLogin();
    }
    public boolean hasError(){
        return getWebElements(By.id("error-button")).size()>0;
    }
}
