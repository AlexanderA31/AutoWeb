package com.nttdata.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StorePage {
    private WebDriver driver;

    // Locators
    private By usernameField = By.id("_desktop_user_info");
    private By passwordField = By.id("field-email");
    private By loginButton = By.id("submit-login");
    private By categoryClothes = By.xpath("//*[@id='category-3']/a");
    private By categoryMen = By.xpath("//*[@id='left-column']/div[1]/ul/li[2]/ul/li[1]/a");
    private By firstProduct = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    private By addToCartButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i");
    private By quantityField = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i");
    private By updateCartButton = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    private By confirmationPopup = By.id("confirmation-popup");
    private By totalAmount = By.id(".product-total > span:nth-child(2)");
    private By checkoutButton = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
    private By cartTotal = By.id("div.cart-summary-line:nth-child(2) > span:nth-child(2)");

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).click();
        driver.findElement(passwordField).click();
        driver.findElement(loginButton).click();
    }

    public void navigateToCategory(String category, String subcategory) {
        driver.findElement(categoryClothes).click();
        driver.findElement(categoryMen).click();

    }


    public void addProductToCart(int quantity) {

        driver.findElement(firstProduct).click();
        driver.findElement(addToCartButton).click();
        driver.findElement(updateCartButton).click();
    }

    public boolean isConfirmationPopupDisplayed() {
        return driver.findElement(confirmationPopup).isDisplayed();
    }

    public String getTotalAmount() {
        return driver.findElement(totalAmount).getText();
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public String getCartTotal() {
        return driver.findElement(cartTotal).getText();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
