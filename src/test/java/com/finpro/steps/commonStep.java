package com.finpro.steps;

import com.finpro.driverManager;
import com.finpro.keyword;
import com.finpro.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static java.sql.DriverManager.getDriver;

public class commonStep {


    @Given("user navigate to url {string}")
    public void navigateToUrl(String url) {
        keyword.navigateToUrl(url);
        keyword.wait(3);
    }


}
