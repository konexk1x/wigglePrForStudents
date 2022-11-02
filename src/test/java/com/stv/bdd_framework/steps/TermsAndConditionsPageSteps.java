package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.TermsAndConditionsPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class TermsAndConditionsPageSteps extends BasicFactoryTest {
    TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage();

    @Then("Terms&Conditions page is visible")
    public void termsConditionsPageIsVisible() {
        Assert.assertTrue("Terms & Conditions page isn't visible", termsAndConditionsPage.isTermsAndConditionsPageDisplayed());
    }
}
