package com.finpro.steps;

import com.finpro.driverManager;
import com.finpro.pages.homePage;
import com.finpro.pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.sql.DriverManager.getDriver;

public class loginStep {

    private loginPage getLoginPage() {
        return new loginPage(driverManager.getInstance().getDriver());
    }
    private homePage getHomePage() {
        return new homePage(driverManager.getInstance().getDriver());
    }

    @When("user click Login button")
    public void clickLogin() {
        getLoginPage().clickLoginButton();
    }

    @And("user input email")
    public void inputEmail() {
        getLoginPage().inputEmail("hvxjk72fvs@sfolkar.com");
    }

    @And("user click Masuk button")
    public void clickMasuk() {
        getLoginPage().clickMasukButton();
    }

    @And("user input password")
    public void inputPassword() {
        getLoginPage().inputPassword("string");
    }

    @Then("user login successfully")
    public void loginSuccess() {
        getHomePage().verifyUserIconExist();
    }
}
