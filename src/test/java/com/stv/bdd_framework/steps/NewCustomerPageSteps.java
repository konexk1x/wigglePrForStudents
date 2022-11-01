package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.NewCustomerPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class NewCustomerPageSteps extends BasicFactoryTest {
    NewCustomerPage newCustomerPage = new NewCustomerPage();
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    @Then("New Customer page is visible")
    public void newCustomerPageIsVisible() {
        Assert.assertTrue(newCustomerPage.isNewCustomerPageDisplayed(), "New Customer Page isn't loaded");
    }

    @Given("Checking our e-mail {string} visible")
    public void checkingOurEMailVisible(String email) {
        newCustomerPage.compareAddress(email);
    }

    @When("Scroll down")
    public void scrollDown() {
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    @And("Click on Another Continue button")
    public void clickOnAnotherContinueButton() {
        newCustomerPage.continueButtonLargeClick();
    }

    @Then("Warnings appear")
    public void warningsAppear() {
        Assert.assertTrue(newCustomerPage.emailConfirmWarningDisplayed(), "E-mail confirmed");
        Assert.assertTrue(newCustomerPage.passwordCreationWarningDisplayed(), "Password confirmed");
        Assert.assertTrue(newCustomerPage.firstNameWarningDisplayed(), "First Name confirmed");
        Assert.assertTrue(newCustomerPage.lastNameWarningDisplayed(), "last Name confirmed");
    }

    @When("Click on Terms & Conditions link")
    public void clickOnTermsConditionsLink() {
        newCustomerPage.clickOnTermsLink();
    }

}
