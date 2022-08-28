package com.Automation.pages;

import com.Automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements( Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/ul/li/a/h2")
    public List<WebElement> products;

    @FindBy(xpath = "//*[@id=\"masthead\"]/div/p[1]/a")
    public WebElement homePageButton;

    @FindBy(xpath = "//*[@id=\"primary-menu\"]/ul/li[1]")
    public WebElement cartButton;


    public WebElement getRandomElement(){
        WebElement randomElement = products.get((int)(Math.random() * 12));
        return  randomElement;
    }
}
