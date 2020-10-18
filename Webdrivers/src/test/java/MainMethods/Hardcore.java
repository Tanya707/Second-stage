package MainMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class Hardcore {
    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://cloud.google.com/products/calculator");

        WebElement searchButton = driver.findElement(By.xpath("/html/body/section/devsite-header/div/div[1]/div/div/div[2]/devsite-search/form/div[1]/div/input"));
        searchButton.sendKeys("Google Cloud Platform Pricing Calculator");
        searchButton.sendKeys(Keys.ENTER);


       WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'___gcse_0\']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a")));

        WebElement searchResult = driver.findElement(By.xpath("//*[@id=\'___gcse_0\']/div/div/div/div[5]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]/div/a"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        searchResult.click();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cloud-site\"]/devsite-iframe/iframe")));
        driver.switchTo().frame("myFrame");

        WebElement numberOfInstances = driver.findElement(By.xpath("//*[@id=\'input_61\']"));
        wait.until(ExpectedConditions.elementToBeClickable(numberOfInstances));
        numberOfInstances.sendKeys("4");

        WebElement instanceTypeClick = driver.findElement(By.id("select_value_label_58"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,instanceTypeClick);
        executor.executeScript("arguments[0].click();", instanceTypeClick);

        WebElement instanceType = driver.findElement(By.xpath("//*[@id=\"select_option_234\"]/div[1]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,instanceType);
        executor.executeScript("arguments[0].click();", instanceType);

//        WebElement addGPUs = driver.findElement(By.xpath("//*[@id=\"mainForm\"]/div[2]/div/md-card/md-card-content/div/div[1]/form/div[8]/div[1]/md-input-container/md-checkbox/div[2]"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//             ,addGPUs);
//        executor.executeScript("arguments[0].click();", addGPUs);
//
//        WebElement numberOfGPUsClick = driver.findElement(By.id("select_value_label_371"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//                ,numberOfGPUsClick);
//        executor.executeScript("arguments[0].click();", numberOfGPUsClick);
//
//        WebElement numberOfGPUs = driver. findElement(By.xpath("//*[@id=\"select_option_378\"]/div[1]"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//                ,numberOfGPUs);
//        executor.executeScript("arguments[0].click();", numberOfGPUs);
//
//        WebElement GPUtypeClick = driver.findElement(By.id("select_value_label_372"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//             ,GPUtypeClick);
//        executor.executeScript("arguments[0].click();", GPUtypeClick);
//
//        WebElement GPUtype = driver. findElement(By.xpath("//*[@id=\"select_option_385\"]/div[1]"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//             ,GPUtype);
//        executor.executeScript("arguments[0].click();", GPUtype);
//
//        WebElement localSSDClick = driver.findElement(By.id("select_value_label_193"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//                ,localSSDClick);
//        executor.executeScript("arguments[0].click();", localSSDClick);
//
//        WebElement localSSD = driver.findElement(By.xpath("//*[@id=\"select_option_258\"]/div[1]"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
//                ,localSSD);
//        executor.executeScript("arguments[0].click();", localSSD);

        WebElement datacenterLocationClick = driver.findElement(By.id("select_value_label_59"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,datacenterLocationClick);
        executor.executeScript("arguments[0].click();", datacenterLocationClick);

        WebElement datacenterLocation = driver.findElement(By.xpath("//*[@id=\"select_option_203\"]/div"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,datacenterLocation);
        executor.executeScript("arguments[0].click();", datacenterLocation);

        WebElement  commitedUsageClick = driver.findElement(By.id("select_value_label_60"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,commitedUsageClick);
        executor.executeScript("arguments[0].click();", commitedUsageClick);

        WebElement commitedUsage = driver.findElement(By.xpath("//*[@id=\"select_option_94\"]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,commitedUsage);
        executor.executeScript("arguments[0].click();", commitedUsage);
        Thread.sleep(2000);

        WebElement addToEstimate = driver.findElement(By.cssSelector("div.layout-align-end-start:nth-child(14) > button:nth-child(1)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
                ,addToEstimate);
        executor.executeScript("arguments[0].click();", addToEstimate);
        Thread.sleep(4000);

        WebElement emailEstimate = driver.findElement(By.cssSelector("#email_quote"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,emailEstimate);
        executor.executeScript("arguments[0].click();", emailEstimate);

       ((JavascriptExecutor)driver).executeScript("window.open()");
       ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(1));

        driver.get("https://10minutemail.com");
        Thread.sleep(10000);
        WebElement emailAddress = driver.findElement(By.id("copy_address"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,emailAddress);
        emailAddress.click();


        driver.switchTo().window(tabs.get(0));

        WebElement inputEmail = driver.findElement(By.cssSelector("#input_396"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,inputEmail);
        executor.executeScript("arguments[0].click();", inputEmail);
        inputEmail.sendKeys(Keys.CONTROL + "v");


        WebElement sendEmail = driver.findElement(By.cssSelector("md-dialog-actions.layout-row > button:nth-child(2)"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();"
             ,sendEmail);


        executor.executeScript("arguments[0].click();", sendEmail);


//        Thread.sleep(4000);
//        driver.quit();

    }
}
