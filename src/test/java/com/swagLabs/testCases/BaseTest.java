package com.swagLabs.testCases;

import com.swagLabs.pages.BasePage;
import com.swagLabs.pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    Page page;


    @BeforeMethod
    public void setUpBrowser(){

        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        page =new BasePage(driver);

    }
    @AfterMethod
    public void dearTown(){
        driver.quit();
    }

}
