package com.swagLabs.testCases;

import com.swagLabs.pages.AboutPage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutTest extends BaseTest{
    @Test
    public void AboutPageShouldSuccess(){
        AboutPage aboutPage = page.getInstance(UserLoginPage.class)

                .doLogin("standard_user","secret_sauce")
                .clickNaviGateBtn()
                .clickAboutPage();
        Assert.assertTrue(aboutPage.hasAboutCompleteTest());
    }
}
