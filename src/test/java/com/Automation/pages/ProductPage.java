package com.Automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    public WebElement chooseColorDropdown;

}
