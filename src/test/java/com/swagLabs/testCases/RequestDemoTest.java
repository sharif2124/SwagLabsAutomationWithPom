package com.swagLabs.testCases;

import com.swagLabs.pages.RequestDemoPage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestDemoTest extends BaseTest{
    @Test
    public void RequestDemoShouldSuccess(){
        RequestDemoPage requestDemoPage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user","secret_sauce")
                .clickNaviGateBtn()
                .clickAboutPage()
                .ClickRequestDemoPage();
        Assert.assertTrue(requestDemoPage.RequestDemoPageHasSuccess());
    }
}
