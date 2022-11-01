package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends FactoryPage {
    @FindBy(className = "bem-button--checkout-large")
    private WebElement continueButtonLarge;
    @FindBy(name = "RegisterModel.Email")
    private WebElement addressField;
    @FindBy(xpath = "//span[contains(text(),'Please enter your email address')]")
    private WebElement emailConfirmWarning;
    @FindBy(xpath = "//span[contains(text(),'Please ensure you have entered a password with " +
            "at least 6 characters containing both letters and numbers')]")
    private WebElement passwordCreationWarning;
    @FindBy(xpath = "//span[contains(text(),'Please enter your first name')]")
    private WebElement firstNameWarning;
    @FindBy(xpath = "//span[contains(text(),'Please enter your surname')]")
    private WebElement lastNameWarning;
    @FindBy(className = "checkoutlightbox")
    private WebElement termsAndConditionsLink;

    public boolean isNewCustomerPageDisplayed() {
        return continueButtonLarge.isDisplayed();
    }

    public boolean compareAddress(String email) {
        if (addressField.getText() == email) {
            return true;
        } else
            return false;
    }

    public void continueButtonLargeClick() {
        continueButtonLarge.click();
    }

    public boolean emailConfirmWarningDisplayed() {
        return emailConfirmWarning.isDisplayed();
    }

    public boolean passwordCreationWarningDisplayed() {
        return passwordCreationWarning.isDisplayed();
    }

    public boolean firstNameWarningDisplayed() {
        return firstNameWarning.isDisplayed();
    }

    public boolean lastNameWarningDisplayed() {
        return lastNameWarning.isDisplayed();
    }

    public void clickOnTermsLink() {
        termsAndConditionsLink.click();
    }
}
