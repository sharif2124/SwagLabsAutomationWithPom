package com.swagLabs.testCases;

import com.swagLabs.pages.HomePage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLoginTest extends BaseTest{

    @Test
    public void loginShouldFailWithoutCredential(){
        UserLoginPage userLoginPage = page.getInstance(UserLoginPage.class)
                .doLogin();
        Assert.assertFalse(userLoginPage.hasError());

    }
    @Test
    public void loginShouldFailWithoutPassword(){
        UserLoginPage userLoginPage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user");
        Assert.assertFalse(userLoginPage.hasError());

    }
    @Test
    public void loginShouldFailWithoutUserName(){
        UserLoginPage userLoginPage = page.getInstance(UserLoginPage.class)
                .doLogin("secret_sauce");
        Assert.assertFalse(userLoginPage.hasError());

    }
    @Test
    public void loginShouldSuccess(){
        HomePage homePage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user","secret_sauce");
        Assert.assertTrue(homePage.hasLogoutLink());


    }
}
