package com.epam.ta.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractClass {
    protected WebDriver driver;
    protected JavascriptExecutor executor;

    protected AbstractClass(WebDriver driver) {
        this.driver = driver;
        this.executor = (JavascriptExecutor)driver;
        PageFactory.initElements(driver, this);
    }

    protected AbstractClass executorScrollAndClick(WebElement element){
        executor.executeScript("arguments[0].scrollIntoView();", element);
        executor.executeScript("arguments[0].click();", element);
        return this;
    }
    protected AbstractClass executorScroll(WebElement element){
        executor.executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    protected AbstractClass sleepWait(int second){
        try {
            Thread.sleep(second*1000);
        }
        catch (InterruptedException e){};
        return this;
    }

}
