package org.example.listOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddTocart {
    WebDriver driver;

    public AddTocart(WebDriver driver) {
        this.driver = driver; // Initialize the driver here
    }

    By searchBox = By.xpath("//input[@id='small-searchterms']");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By FirstItem = By.xpath("//div[@class='picture']//img[@title='Show details for Apple MacBook Pro 13-inch']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-4']");
    By laptop = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    public void setSearchBox() {
        WebElement search = driver.findElement(searchBox);
        search.sendKeys("MacBook");
    }
    public void setSearchBox2(){
        WebElement search = driver.findElement(searchBox);
        search.sendKeys("Laptop");
    }

    public void setSearchButton() {
        WebElement button = driver.findElement(searchButton);
        button.click();
    }

    public void FirstItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement first = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(FirstItem)));
        first.click();

    }
    public void setLaptop(){
        WebElement lap = driver.findElement(laptop);
        lap.click();
    }

    public void setAddToCart() {
        WebElement cart = driver.findElement(addToCart);
        cart.click();
    }
}
