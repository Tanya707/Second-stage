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

public class HardcoreHomePage extends AbstractClass {

    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private static final String NEWHOMEPAGE_URL = "https://10minutemail.com";
    private WebDriverWait wait;

    @FindBy(css = ".devsite-search-field" )
    private WebElement searchButton;

    @FindBy(css = "div.gsc-result:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1)")
    private WebElement searchResult;

    @FindBy(xpath = "//*[@id=\"cloud-site\"]/devsite-iframe/iframe")
    private WebElement firstFrame;

    @FindBy(xpath = "//*[@id=\'input_61\']")
    private WebElement numberOfInstances;

    @FindBy(id = "select_value_label_58")
    private WebElement instanceTypeClick;

    @FindBy (css = "md-optgroup.ng-scope:nth-child(3)")
    private WebElement instanceTypeOption;

    @FindBy(id = "select_value_label_59")
    private WebElement datacenterLocationClick;

    @FindBy(css = "#select_container_90 > md-select-menu:nth-child(1) > md-content:nth-child(1)")
    private WebElement datacenterLocationOption;

    @FindBy(id = "select_value_label_60")
    private WebElement commitedUsageClick;

    @FindBy(css = "#select_container_97 > md-select-menu:nth-child(1) > md-content:nth-child(1)")
    private WebElement commitedUsageOption;


        public HardcoreHomePage(WebDriver driver) {
           super(driver);
           this.wait = new WebDriverWait(driver, 30);
           PageFactory.initElements(driver, this);
    }


        public HardcoreHomePage openPage() {
             driver.navigate().to(HOMEPAGE_URL);
           return this;
    }

        public HardcoreHomePage searchCalculator(String text) {
           searchButton.sendKeys(text);
           searchButton.sendKeys(Keys.ENTER);

           return this;
    }

        public HardcoreHomePage searchResultClick() {
           wait.until(ExpectedConditions.elementToBeClickable(searchResult));
           searchResult.click();
           return this;
    }

         public HardcoreHomePage numberOfInstances(Data user) {
            driver.switchTo().frame(firstFrame);
            driver.switchTo().frame("myFrame");
            wait.until(ExpectedConditions.elementToBeClickable(numberOfInstances));
            numberOfInstances.sendKeys(user.getNumberOfInstances());
            return this;
    }

        public HardcoreHomePage instanceType (Data user){
            executorScrollAndClick(instanceTypeClick);
            findOption(instanceTypeOption,user.getInstanceType());
            return this;
        }

        public HardcoreHomePage chooseDatacenterLocation (Data user) {
            executorScrollAndClick(datacenterLocationClick);
            findOption(datacenterLocationOption, user.getDatacenterLocation());
            return this;
        }

        public HardcoreHomePage chooseCommitedUsage (Data user) {
            executorScrollAndClick(commitedUsageClick);
            findOption(commitedUsageOption, user.getCommitedUsage());
            return this;
        }

    }