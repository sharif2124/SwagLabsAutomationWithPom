package com.swagLabs.testCases;

import com.swagLabs.pages.PricePage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriceTest extends BaseTest{
    @Test
    public void PricePageShouldSuccess(){
        PricePage pricePage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user","secret_sauce")
                .clickNaviGateBtn()
                .clickAboutPage()
                .ClickpricePage();
        Assert.assertTrue(pricePage.hasPriceCompleteTest());
    }
}
