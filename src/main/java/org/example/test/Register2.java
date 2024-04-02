package org.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.listOfElements.AddTocart;
import org.example.listOfElements.Register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Register2 {
        WebDriver driver;

        @BeforeTest
        public void beforeTest() {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("-disable-pop-blocking");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");

            System.out.println("Successfully opened the webpage");

        }

        @Test
        public void Register() {
            Register register = new Register(driver);
            register.setSign();

    }


}
