package org.example.listOfElements;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {
    WebDriver driver;
    WebDriverWait wait;

    public Register(WebDriver driver) {
        this.driver = driver;
         // Initialize WebDriverWait with a timeout of 10 seconds
    }


    By signup = By.xpath("//a[normalize-space()='Register']");
    By female = By.xpath("//*[@id='gender-female']");

    By firstName = By.id("FirstName");
    By lastName = By.xpath("//input[@id='LastName']");
    By day = By.xpath("//select[@name='DateOfBirthDay']");
    By monnth =By.xpath("//select[@name='DateOfBirthMonth']");
    By year = By.xpath("//select[@name='DateOfBirthYear']");

    By email = By.xpath("//input[@id='Email']");
   By Company = By.xpath("//input[@id='Company']");
    By telephone = By.id("input-telephone");
    By newsletter = By.xpath("//*[@id='Newsletter']");
    By password = By.id("input-password");
    By confirm = By.id("input-confirm");

    public void setSign() {
        driver.findElement(signup).click();
        driver.findElement(female).click();
        String username = RandomStringUtils.randomAlphabetic(8).toUpperCase();
        driver.findElement(firstName).sendKeys("Abigail");
        driver.findElement(lastName).sendKeys("Arko");
        Select Date = new Select(driver.findElement(day));
        Date.selectByVisibleText("8");
        Select month = new Select(driver.findElement(monnth));
        month.selectByVisibleText("June");
        Select yearSelect = new Select(driver.findElement(year));
        yearSelect.selectByVisibleText("1999");
        driver.findElement(email).sendKeys(username+"@gmail.com");
        driver.findElement(Company).sendKeys("Amalitech company limited");
        driver.findElement(newsletter).click();
        driver.findElement(password).sendKeys("abiail1223&Arko");
        driver.findElement(confirm).sendKeys("abiail1223&Arko");
    }
}
