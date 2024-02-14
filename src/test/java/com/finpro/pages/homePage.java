package com.finpro.pages;

import com.finpro.keyword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class homePage {
    protected WebDriver webDriver;
    public homePage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/header/div/div/div/div/div[3]")
    private static WebElement userIcon;

    public void verifyUserIconExist() {
        keyword.validate_element_is_visible_and_enabled(userIcon);
    }
}
