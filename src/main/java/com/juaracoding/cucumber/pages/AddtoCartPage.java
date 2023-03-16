package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class AddtoCartPage {
    private static WebDriver driver;

    public AddtoCartPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Checkout")
    WebElement ceckout;
    @FindBy(xpath = "(//a[normalize-space()='Return to shop'])[1]")
    WebElement returnShop;
    @FindBy(xpath = "(//span)[28]")
    WebElement productOne;
    @FindBy(xpath = "(//button[@title='Close (Esc)'])[1]")
    WebElement otherProd;
    @FindBy(xpath = "(//span[contains(@class,'noo-quick-view icon_zoom-in_alt')])[6]")
    WebElement productTwo;
    @FindBy(xpath = "(//a[contains(@class,'noo-quick-link')])[1]")
    WebElement selectProduct;
    @FindBy(id = "pa_color")
    WebElement color;
    @FindBy(id = "pa_size")
    WebElement size;
    @FindBy(className = "qty-increase")
    WebElement increament;
    @FindBy(className = "qty-decrease")
    WebElement decreament;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addCart;
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    WebElement viewCartBtn;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement textPageProduct;

    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/form/table/tbody/tr[2]/td/a[1]")
    WebElement clearCart;

    public void clickCekot() {
        ceckout.click();
    }

    public void btnReturnShop() {
        returnShop.click();
    }

    public void chooseProductOne() {
        productOne.click();
    }

    public void exitProductOne() {
        otherProd.click();
    }

    public void chooseProductTwo() {
        productTwo.click();
    }

    public void btnSelectProduct() {
        selectProduct.click();
    }

    public String getNameProduct() {
        return textPageProduct.getText();
    }

    public void selectColor() {
        Select selectColor = new Select(color);
        selectColor.selectByVisibleText("Black");
    }

    public void selectSize() {
        Select selectSize = new Select(size);
        int selectedSize = driver.findElements(By.tagName("select")).size();
        Random randomSelect = new Random();
        int selectedRandom = randomSelect.nextInt(selectedSize);
        selectSize.selectByIndex(Math.max(selectedRandom, 1));
    }

    public void btnIncr() {
        increament.click();
    }

    public void btnDecr() {
        decreament.click();
    }

    public void btnAddtoCart() {
        addCart.click();
    }

    public String getConfirmProduct() {
        return driver.getTitle();
    }

    public void btnView() {
        viewCartBtn.click();
    }

    public void clear() {
        clearCart.click();
    }

    public String getReturnShop() {
        return driver.getTitle();
    }
}
