package com.epam.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    protected AbstractClass findOption (WebElement element, String instanceType) {
        List<WebElement> options = element.findElements(By.tagName("div"));
        for (WebElement option : options) {
            if (instanceType.equals(option.getText())) {
                executor.executeScript("arguments[0].click();", option);
            }
        }
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
