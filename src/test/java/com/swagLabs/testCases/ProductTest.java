package com.swagLabs.testCases;

import com.swagLabs.pages.ProductPage;
import com.swagLabs.pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{
    @Test
    public void ProductShouldSuccess(){
        ProductPage productPage = page.getInstance(UserLoginPage.class)
                .doLogin("standard_user","secret_sauce")
                .clickNaviGateBtn()
                .clickAboutPage()
                .ClickProductPage();
        Assert.assertTrue(productPage.hasProductCompleteTest());
    }
}
