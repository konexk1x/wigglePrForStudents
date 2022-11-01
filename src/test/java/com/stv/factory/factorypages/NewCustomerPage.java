package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends FactoryPage {
    @FindBy(className = "bem-button--checkout-large")
    private WebElement continueButtonLarge;

    @FindBy(name = "RegisterModel.Email")
    private WebElement addressField;

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
}
