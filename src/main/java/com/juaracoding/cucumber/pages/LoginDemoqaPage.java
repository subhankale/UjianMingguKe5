package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemoqaPage {
    private final WebDriver driver;

    public LoginDemoqaPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/p/a")
    WebElement popUp;
    @FindBy(linkText = "My Account")
    WebElement myAcc;
    @FindBy(name = "username")
    WebElement userName;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(id = "rememberme")
    WebElement rememberMe;
    @FindBy(name = "login")
    WebElement login;
    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
    WebElement txtAccountName;
    @FindBy(xpath = "//h1[normalize-space()='My Account']")
    WebElement txtMyAcc;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement linkLogout;
    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement errorMessage;

    public String getTitleBar() {
        return driver.getTitle();
    }

    public void getTextMyacc() {
        txtMyAcc.getText();
    }

    public String getAccountName() {
        return txtAccountName.getText();
    }

    public void clickPopUp() {
        popUp.click();
    }

    public void activityLogin() {
        myAcc.click();
    }


    public void enterLogin(String username, String password) {
        userName.sendKeys(username);
        this.password.sendKeys(password);
        rememberMe.click();
        login.click();
    }

    public void enterUsernama(String username) {
        userName.sendKeys(username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickRememberme() {
        rememberMe.click();
    }

    public void clickBtnLogin() {
        login.click();
    }
    public void linktxLogout(){
        linkLogout.click();
    }
    public String messageError(){
        return errorMessage.getText();
    }


}
