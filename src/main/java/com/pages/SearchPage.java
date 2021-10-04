package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchPage {
    private WebDriver driver;

    // 1. By Locators: Object Repository
    private By searchedItem = By.xpath("//a[contains(text(),'Printed Dress')]");

    // 2. Constructor of the page class:
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    // 3. page actions: features(behavior) of the page the form of methods:
    public String getTitle(){
        return driver.getTitle();
    }

    public boolean itemDisplayed(){
        return driver.findElement(searchedItem).isDisplayed();
    }

    public void goToSearchedItem(){
        driver.findElement(searchedItem).click();

//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(searchedItem)).build().perform();
    }

}
