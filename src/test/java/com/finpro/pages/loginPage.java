package com.finpro.pages;

import com.finpro.keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class loginPage {
    protected WebDriver webDriver;
    public loginPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//button[@class='sc-qZrbh gxfjxc MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium sc-hhyKGa eeZlDW MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium']")
    private static WebElement loginButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/form/div/div/input")
    private static WebElement txtEmail;

    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement submitButton;

    @FindBy(xpath = "//input[@type='password']")
    private static WebElement txtPassword;

    public void clickLoginButton() {
        keyword.tapElement(loginButton);
    }

    public void inputEmail(String email) {
        keyword.inputText(txtEmail, email);
    }

    public void inputPassword(String password) {
        keyword.inputText(txtPassword, password);
    }

    public void clickMasukButton() {
        keyword.tapElement(submitButton);
        keyword.wait(3);
    }
}