package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.NewCustomerPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class NewCustomerPageSteps extends BasicFactoryTest {
    NewCustomerPage newCustomerPage = new NewCustomerPage();

    @Then("New Customer page is visible")
    public void newCustomerPageIsVisible() {
        Assert.assertTrue(newCustomerPage.isNewCustomerPageDisplayed(), "New Customer Page isn't loaded");
    }
}
