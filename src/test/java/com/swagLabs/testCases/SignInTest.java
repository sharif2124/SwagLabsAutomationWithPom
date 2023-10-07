package com.swagLabs.testCases;

import com.swagLabs.pages.SignInPage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest{
    @Test
    public void SignInPageShouldSuccess(){
        SignInPage signInPage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user","secret_sauce")
                .clickNaviGateBtn()
                .clickAboutPage()
                .clickSignInPage();
        Assert.assertFalse(signInPage.hasSignInCompleteTest());
    }
}
