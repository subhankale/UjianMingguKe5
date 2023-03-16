package com.juaracoding.cucumber.foldertest;

import com.juaracoding.cucumber.lib.LibraryTest;
import com.juaracoding.cucumber.pages.LoginDemoqaPage;
import com.juaracoding.cucumber.utils.Regular;
import com.juaracoding.cucumber.utils.RegularPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    public static WebDriver driver;

    public static ExtentTest extentTest;
    public static LoginDemoqaPage logDemoq;

    public TestLogin() {
        driver = LibraryTest.driver;
        logDemoq = new LoginDemoqaPage();
        extentTest = LibraryTest.extentTest;
    }

    @Given("User open browser and url")
    public void user_open_browser_and_url() {
        extentTest.log(LogStatus.PASS,"User open browser and url");
        driver.get(Regular.URL);
        Assert.assertTrue(logDemoq.getTitleBar().contains("ToolsQA"));
        RegularPage.delayDuration(1);
    }

    @Given("User logout web demoqa shop")
    public void User_logout_web_demoqa_shop(){
        extentTest.log(LogStatus.PASS,"User logout web demoqa shop");
        RegularPage.delayDuration(1);
        logDemoq.linktxLogout();
    }

    @When("User click popup dismiss")
    public void user_click_popup_dismiss() {
        extentTest.log(LogStatus.PASS,"User click popup dismiss");
        logDemoq.clickPopUp();
        RegularPage.delayDuration(1);
    }

    @When("User scroll and enter invalid username")
    public void user_scroll_and_enter_invalid_username(){
        extentTest.log(LogStatus.PASS,"User scroll and enter invalid username");
        RegularPage.scrollPage("0","500");
        RegularPage.delayDuration(1);
        logDemoq.enterUsernama("Subhann");
    }

    @And("User click link my account and scroll")
    public void user_click_link_my_account_and_scroll() {
        extentTest.log(LogStatus.PASS,"User click link my account and scroll");
        logDemoq.activityLogin();
        RegularPage.scrollPage("0", "500");
    }

    @And("User enter valid username")
    public void user_enter_valid_username() {
        extentTest.log(LogStatus.PASS,"User enter valid username");
        logDemoq.enterUsernama("Subhan");
    }

    @And("User enter valid password")
    public void user_enter_valid_password() {
        extentTest.log(LogStatus.PASS,"User enter valid password");
        logDemoq.enterPassword("Subhanbule88");
    }

    @And("User click checkbox remember me")
    public void user_click_checkbox_remember_me() {
        extentTest.log(LogStatus.PASS,"User click checkbox remember me");
        logDemoq.clickRememberme();
    }

    @And("User click button login")
    public void user_click_button_login() {
        extentTest.log(LogStatus.PASS,"User click button login");
        logDemoq.clickBtnLogin();
    }

    @And("User go to page my account and scroll")
    public void user_go_to_page_my_account_and_scroll() {
        extentTest.log(LogStatus.PASS,"User go to page my account");
        logDemoq.getTextMyacc();
        RegularPage.scrollPage("0", "400");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        extentTest.log(LogStatus.PASS,"User enter invalid password");
        logDemoq.enterPassword("Sbhvn");
    }

    @Then("User get account name")
    public void user_get_account_name() {
        extentTest.log(LogStatus.PASS,"User get account name");
        Assert.assertEquals(logDemoq.getAccountName(), "Subhan");
    }

    @Then("User get message error message")
    public void user_get_message_error_message(){
        extentTest.log(LogStatus.PASS,"User get message error message");
        RegularPage.scrollPage("0","400");
        RegularPage.delayDuration(1);
        Assert.assertTrue(logDemoq.messageError().contains("ERROR:"));
    }
}
