package org.example.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.listOfElements.AddTocart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
public class AddToCartTest {
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-disable-pop-blocking");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

    }
    @Test
    public void addTocart(){
        AddTocart tocart = new AddTocart(driver);
        tocart.setSearchBox();
        tocart.setSearchButton();
        tocart.FirstItem();
        tocart.setAddToCart();

    }
    @Test
    public void addTocart2(){
        AddTocart tocart = new AddTocart(driver);
        tocart.setSearchBox2();
        tocart.setSearchButton();
        tocart.setLaptop();

    }
    }
