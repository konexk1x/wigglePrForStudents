package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.TermsAndConditionsPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TermsAndConditionsPageSteps extends BasicFactoryTest {
    TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage();

    @Then("Wiggle Terms & Conditions page appears")
    public void wiggleTermsConditionsPageAppears() {
        Assert.assertTrue(termsAndConditionsPage.isTermsAndConditionsDisplayed(), "Terms & Conditions page isn't visible");
    }
}
