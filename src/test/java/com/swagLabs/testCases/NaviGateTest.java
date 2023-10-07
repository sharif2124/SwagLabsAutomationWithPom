package com.swagLabs.testCases;

import com.swagLabs.pages.NaviGatePage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NaviGateTest extends BaseTest{
    @Test
    public void NaviGateShouldSuccess(){
        NaviGatePage naviGatePage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user","secret_sauce")
                .clickNaviGateBtn();
        Assert.assertTrue(naviGatePage.hasHomePage());
    }
}
