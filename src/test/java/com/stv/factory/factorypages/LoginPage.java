package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    @FindBy(id = "NewCustomer")
    private WebElement newCustomerForm;
    @FindBy(name = "DualRegisterEmailModel.Email")
    private WebElement emailAddressField;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
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
