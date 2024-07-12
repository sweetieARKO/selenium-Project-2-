package org.example.listOfElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newz {
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
    public void Test(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")).click();
        driver.findElement(By.xpath("//div[@class='picture']//a[@title='Show products in category Cell phones']")).click();
        driver.findElement(By.xpath("//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]")).click();

    }
}
