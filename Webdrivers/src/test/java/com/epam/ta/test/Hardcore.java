package com.epam.ta.test;

import com.epam.ta.model.User;
import com.epam.ta.service.UserCreator;
import org.junit.Assert;
import org.testng.annotations.Test;
import com.epam.ta.page.HardcoreHomePage;
import com.epam.ta.page.HardcoreResultPage;


public class Hardcore extends CommonConditions {
    @Test
    public void Test () {
        User testUser  = UserCreator.withCredentialsFromProperty();
        HardcoreHomePage expectedCalculatorResults = new HardcoreHomePage (driver)
                .openPage()
                .searchCalculator("Google Cloud Platform Pricing Calculator")
                .searchResultClick()
                .numberOfInstances(testUser)
                .instanceType(testUser)
                .chooseDatacenterLocation(testUser)
                .chooseCommitedUsage(testUser)
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
