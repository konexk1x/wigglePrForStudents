package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps extends BasicFactoryTest {
    LoginPage loginPage = new LoginPage();

    @Then("New customer form is visible")
    public void newCustomerFormIsVisible() {
        Assert.assertTrue(loginPage.isNewCustomerFormDisplayed(), "New Customer Form isn't visible");
    }

    @Given("The user inputs e-mail {string}")
    public void theUserInputsEMail(String emailAddress) {
        loginPage.inputEmail(emailAddress);
    }

    @When("Click on Continue button")
    public void clickOnContinueButton() {
        loginPage.clickOnContinueButton();
    }
}
