package com.juaracoding.cucumber.foldertest;

import com.juaracoding.cucumber.lib.LibraryTest;
import com.juaracoding.cucumber.pages.AddtoCartPage;
import com.juaracoding.cucumber.pages.LoginDemoqaPage;
import com.juaracoding.cucumber.utils.RegularPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddtoCart {
    public static WebDriver driver;
    public static AddtoCartPage addCart;
    public static ExtentTest extentTest;
    public static LoginDemoqaPage logDem;

    public TestAddtoCart() {
        driver = LibraryTest.driver;
        addCart = new AddtoCartPage();
        logDem = new LoginDemoqaPage();
        extentTest = LibraryTest.extentTest;
    }

    @When("User scroll and select color")
    public void user_scroll_and_select_color() {
        extentTest.log(LogStatus.PASS,"User scroll and select color");
        RegularPage.scrollPage("0", "620");
        RegularPage.delayDuration(2);
        addCart.selectColor();
    }

    @When("User click button view cart")
    public void User_click_button_view_cart() {
        extentTest.log(LogStatus.PASS,"User click button view cart");
        addCart.btnView();
    }

    @And("User login")
    public void user_login() {
        extentTest.log(LogStatus.PASS,"User login");
        logDem.enterLogin("Ardiandwi", "Ard14&','//");
    }

    @And("User click link text checkout")
    public void user_click_link_text_checkout() {
        extentTest.log(LogStatus.PASS,"User click link text checkout");
        RegularPage.delayDuration(1);
        addCart.clickCekot();
    }

    @And("User scroll and click button return to shop")
    public void user_scroll_and_click_button_return_to_shop() {
        extentTest.log(LogStatus.PASS,"User scroll and click button return to shop");
        RegularPage.scrollPage("0", "300");
        RegularPage.delayDuration(1);
        addCart.btnReturnShop();
    }

    @And("User scroll and click product one")
    public void user_scroll_and_click_product_one() {
        extentTest.log(LogStatus.PASS,"User scroll and click product one");
        RegularPage.scrollPage("0", "600");
        addCart.chooseProductOne();
        RegularPage.delayDuration(2);
    }

    @And("User click exit for quit product one")
    public void user_click_exit_for_quit_product_one() {
        extentTest.log(LogStatus.PASS,"User click exit for quit product one");
        addCart.exitProductOne();
    }

    @And("User scroll and click product two")
    public void user_scroll_and_click_product_two() {
        extentTest.log(LogStatus.PASS,"User scroll and click product two");
        RegularPage.delayDuration(1);
        RegularPage.scrollPage("0", "500");
        addCart.chooseProductTwo();
    }

    @And("User click button select product")
    public void user_click_button_select_product() {
        extentTest.log(LogStatus.PASS,"User click button select product");
        RegularPage.delayDuration(2);
        addCart.btnSelectProduct();
    }

    @And("User select size")
    public void user_select_size() {
        extentTest.log(LogStatus.PASS,"User select size");
        RegularPage.delayDuration(1);
        addCart.selectSize();
    }

    @And("User click button increament")
    public void user_click_button_increament() {
        extentTest.log(LogStatus.PASS,"User click button increament");
        RegularPage.delayDuration(2);
        addCart.btnIncr();
    }

    @And("User click button decreament")
    public void user_click_button_decreament() {
        extentTest.log(LogStatus.PASS,"User click button decreament");
        addCart.btnDecr();
    }

    @And("User click button add to cart")
    public void user_click_button_add_to_cart() {
        extentTest.log(LogStatus.PASS,"User click button add to cart");
        addCart.btnAddtoCart();
    }

    @And("User scroll clear product")
    public void User_scroll_clear_product() {
        extentTest.log(LogStatus.PASS,"User scroll clear prodduct");
        RegularPage.scrollPage("0", "600");
        addCart.clear();
    }

    @Then("User go to page and get name product")
    public void user_go_to_page_and_get_name_product() {
        extentTest.log(LogStatus.PASS,"User go to page and get name product");
        Assert.assertTrue(addCart.getNameProduct().contains("BLACK STRAPPY"));
    }

    @Then("User get to confirm product")
    public void user_get_to_confirm_product() {
        extentTest.log(LogStatus.PASS,"User get to confirm product");
        Assert.assertTrue(addCart.getConfirmProduct().contains("black strappy"));
    }

    @Then("User go to page cart")
    public void user_go_to_page_cart() {
        extentTest.log(LogStatus.PASS,"User go to page cart");
        Assert.assertTrue(addCart.getReturnShop().contains("Cartt"));
    }
}

