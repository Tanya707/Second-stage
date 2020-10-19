package com.epam.ta.page;

import com.epam.ta.model.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class HardcoreMiddlePage extends AbstractClass {

    private static final String NEWHOMEPAGE_URL = "https://10minutemail.com";
    private WebDriverWait wait;

    @FindBy(css = "div.layout-align-end-start:nth-child(14) > button:nth-child(1)")
    private WebElement addToEstimate;

    @FindBy(css = "#email_quote")
    private WebElement emailEstimate;

    @FindBy(id = "copy_address")
    private WebElement emailAddress;

    @FindBy(css = "#input_396")
    private WebElement inputEmail;

    public HardcoreMiddlePage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

        public HardcoreMiddlePage addToEstimateClick () {
            executorScrollAndClick(addToEstimate);
            return this;
        }

        public HardcoreMiddlePage addToEmailEstimateClick () {
            executorScrollAndClick(emailEstimate);
            return this;
        }

        public HardcoreMiddlePage getEmailAddress () {
            executor.executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            driver.get(NEWHOMEPAGE_URL);
            executorScroll(emailAddress);
            emailAddress.click();
            sleepWait(20);
            driver.switchTo().window(tabs.get(0));
            return this;
        }

        public HardcoreMiddlePage inputEmailAddress () {
            executorScrollAndClick(inputEmail);
            inputEmail.sendKeys(Keys.CONTROL + "v");
            return this;
        }
    }