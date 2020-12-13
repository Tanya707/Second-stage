package com.epam.ta.test;

import com.epam.ta.model.Data;
import com.epam.ta.page.HardcoreMiddlePage;
import com.epam.ta.service.DataCreator;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.epam.ta.page.HardcoreHomePage;
import com.epam.ta.page.HardcoreResultPage;


public class Hardcore extends CommonConditions {
    @Test
    public void Test () {
        Data testUser  = DataCreator.withCredentialsFromProperty();
        HardcoreHomePage expectedCalculatorResults = new HardcoreHomePage (driver)
                .openPage()
                .searchCalculator("Google Cloud Platform Pricing Calculator")
                .searchResultClick()
                .numberOfInstances(testUser)
                .instanceType(testUser)
                .chooseDatacenterLocation(testUser)
                .chooseCommitedUsage(testUser);

        HardcoreMiddlePage expectedMiddleResults = new HardcoreMiddlePage(driver)
                .addToEstimateClick()
                .addToEmailEstimateClick()
                .getEmailAddress()
                .inputEmailAddress();

        HardcoreResultPage expectedResult = new HardcoreResultPage (driver)
                .sendEmail();
        Assert.assertTrue(expectedResult.getResultNumberOfInstances().contains(testUser.getResultNumberOfInstances()));
        Assert.assertTrue(expectedResult.getResultInstancetype().contains(testUser.getResultInstancetype()));
        Assert.assertTrue(expectedResult.getResultTotalHours().contains(testUser.getResultTotalHours()));
        Assert.assertTrue(expectedResult.getResultCost().contains(testUser.getResultCost()));

    }

}
