package org.example.listOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    public Login(WebDriver driver) {

        this.driver =driver;
    }
    By login = By.xpath("//a[normalize-space()='Log in']");
    By email = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By button = By.xpath("//button[normalize-space()='Log in']");

    public  void setLogin(){

        driver.findElement(login).click();
        driver.findElement(email).sendKeys("abigail.arko@amalitech.com");
        driver.findElement(password).sendKeys("abigail123ARKO");
        driver.findElement(button).click();
    }
}
