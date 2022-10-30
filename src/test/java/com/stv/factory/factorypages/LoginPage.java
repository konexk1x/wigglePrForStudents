package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    @FindBy(id = "col-sm-6 bem-checkout__new-customer")
    private WebElement newCustomerForm;
    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement emailAddressField;

    @FindBy(id = "qa-dual-register")
    private WebElement continueButton;

    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public boolean isNewCustomerFormDisplayed() {
        return newCustomerForm.isDisplayed();
    }

    public void inputEmail(String emailAddress) {
        emailAddressField.sendKeys(emailAddress);
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }
}
