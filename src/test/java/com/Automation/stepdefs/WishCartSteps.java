package com.Automation.stepdefs;

import com.Automation.pages.BasePage;
import com.Automation.pages.CartPage;
import com.Automation.pages.ProductPage;
import com.Automation.utilities.BrowserUtilities;
import com.Automation.utilities.ConfigurationReader;
import com.Automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class WishCartSteps {
    BasePage basePage =  new BasePage();
    CartPage cartPage = new CartPage();
    ProductPage productPage = new ProductPage();

    WebDriver driver = Driver.getDriver();

    @Given("go to home page")
    public void go_to_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitFor(1);
    }


    @Given("I add four random items to my cart")
    public void i_add_four_random_items_to_my_cart() {
        List<String> productsNames = BrowserUtilities.getElementsText(basePage.products);
        System.out.println( "all productsNames = " + productsNames );
        BrowserUtilities.waitFor(1);
        List<String> selectedProductsNamesRandom = new ArrayList<>();
        int count = 0;
        while(count < 4){
            WebElement randomElement = basePage.getRandomElement();
            String productName = randomElement.getText();
            randomElement.click();
            if (productPage.addToCartButton != null) {
                if (productPage.addToCartButton.isDisplayed()) {
                    BrowserUtilities.waitFor(1);
                    selectedProductsNamesRandom.add(productName);
                    productPage.addToCartButton.click();

                    count++;
                    basePage.homePageButton.click();
                }
                else{
                    productPage.chooseColorDropdown.click();
                    BrowserUtilities.waitFor(1);
                    driver.findElement( By.xpath("//*[@id=\"product-23\"]/div[2]/form/table/tbody/tr/td[2]/span/span[1]/span")).click();
                    selectedProductsNamesRandom.add(productName);
                    productPage.addToCartButton.click();
                    count++;
                    basePage.homePageButton.click();

                }
            }
            else {
                System.out.println("No add to cart button!");
                basePage.homePageButton.click();
            }
        }

        System.out.println("selected products to cart: "+selectedProductsNamesRandom);

    }
    @When("I view my cart")
    public void i_view_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I find total four items listed in my cart")
    public void i_find_total_four_items_listed_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("I search for lowest price item")
    public void i_search_for_lowest_price_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I am able to remove the lowest price item from my cart")
    public void i_am_able_to_remove_the_lowest_price_item_from_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I am able to verify three items in my cart")
    public void i_am_able_to_verify_three_items_in_my_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
