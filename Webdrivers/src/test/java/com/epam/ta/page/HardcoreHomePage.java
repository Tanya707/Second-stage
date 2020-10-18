package com.epam.ta.page;

import com.epam.ta.model.User;
import com.epam.ta.service.UserCreator;
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

//    @FindBy(xpath = "//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox/div[2]")
//    private WebElement addGPUs;
//
//    @FindBy(id = "select_value_label_371")
//    private WebElement numberOfGPUsClick;
//
//    @FindBy(id = "select_value_label_372")
//    private WebElement GPUtypeClick;
//
//    @FindBy(id = "select_value_label_193")
//    private WebElement localSSDClick;

    @FindBy(id = "select_value_label_59")
    private WebElement datacenterLocationClick;

    @FindBy(id = "select_value_label_60")
    private WebElement commitedUsageClick;

    @FindBy(css = "div.layout-align-end-start:nth-child(14) > button:nth-child(1)")
    private WebElement addToEstimate;

    @FindBy(css = "#email_quote")
    private WebElement emailEstimate;

    @FindBy(id = "copy_address")
    private WebElement emailAddress;

    @FindBy(css = "#input_396")
    private WebElement inputEmail;


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

         public HardcoreHomePage numberOfInstances(User user) {
            driver.switchTo().frame(firstFrame);
            driver.switchTo().frame("myFrame");
            wait.until(ExpectedConditions.elementToBeClickable(numberOfInstances));
            numberOfInstances.sendKeys(user.getNumberOfInstances());
            sleepWait(5);
            return this;
    }

        public HardcoreHomePage instanceType (User user){
            executorScrollAndClick(instanceTypeClick);
            WebElement instanceType = driver.findElement(By.xpath(user.getInstanceType()));
            sleepWait(5);
            executorScrollAndClick(instanceType);
            return this;
        }

//        public HardcoreHomePage addGPUs () {
//            executorScroll(addGPUs);
//            executorClick(addGPUs);
//            return this;
//        }
//
//        public HardcoreHomePage chooseNumberOfGPUs (User user) {
//            executorScroll(numberOfGPUsClick);
//            executorClick(numberOfGPUsClick);
//            WebElement numberOfGPUs = driver.findElement(By.xpath(user.getNumberOfGPUs()));
//            executorScroll(numberOfGPUs);
//            executorClick(numberOfGPUs);
//            return this;
//        }
//
//        public HardcoreHomePage chooseGPUtype (User user) {
//            executorScroll(GPUtypeClick);
//            executorClick(GPUtypeClick);
//            WebElement GPUtype = driver.findElement(By.xpath(user.getGPUtype()));
//            executorScroll(GPUtype);
//            executorClick(GPUtype);
//            return this;
//        }
//
//        public HardcoreHomePage chooseLocalSSD (User user) {
//            executorScroll(localSSDClick);
//            executorClick(localSSDClick);
//            WebElement localSSD = driver.findElement(By.xpath(user.getLocalSSD()));
//            executorScroll(localSSD);
//            executorClick(localSSD);
//            return this;
//        }

        public HardcoreHomePage chooseDatacenterLocation (User user) {
            executorScrollAndClick(datacenterLocationClick);
            WebElement datacenterLocation = driver.findElement(By.xpath(user.getDatacenterLocation()));
            sleepWait(5);
            executorScrollAndClick(datacenterLocation);
            return this;
        }

        public HardcoreHomePage chooseCommitedUsage (User user) {
            executorScrollAndClick(commitedUsageClick);
            WebElement commitedUsage = driver.findElement(By.xpath(user.getCommitedUsage()));
            sleepWait(5);
            executorScrollAndClick(commitedUsage);
            return this;
        }

        public HardcoreHomePage addToEstimateClick () {
            sleepWait(5);
            executorScrollAndClick(addToEstimate);
            return this;
        }

        public HardcoreHomePage addToEmailEstimateClick () {
            executorScrollAndClick(emailEstimate);
            return this;
        }

        public HardcoreHomePage getEmailAddress () {
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

        public HardcoreHomePage inputEmailAddress () {
            executorScrollAndClick(inputEmail);
            inputEmail.sendKeys(Keys.CONTROL + "v");
            return this;
        }
    }