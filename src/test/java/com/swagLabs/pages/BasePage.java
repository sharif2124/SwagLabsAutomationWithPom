package com.swagLabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page{
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement webElement = null;
        try {
            WaitForWebElement(locator);
            webElement=driver.findElement(locator);
        }catch (Exception e){
            System.out.println("No Data Found");
        }
        return  webElement;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        List<WebElement> webElements =null;
        try {
            WaitForWebElement(locator);
            webElements=driver.findElements(locator);

        }catch (Exception e){
            System.out.println("No Data Found");
        }
        return webElements;
    }

    @Override
    public void WaitForWebElement(By locator) {
      try {
          wait.until(ExpectedConditions.presenceOfElementLocated(locator));
      }catch (Exception e){
          System.out.println(locator.toString()+"Not Loading");
      }
    }

}
