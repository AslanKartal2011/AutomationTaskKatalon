package com.Automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/form/table/tbody/tr/td[3]/a")
    public List<WebElement> selectedProductsInCart;
}
