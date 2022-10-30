package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage extends FactoryPage {
    @FindBy(className = "bem-button--checkout-large")
    private WebElement continueButtonLarge;

    public boolean isNewCustomerPageDisplayed() {
        return continueButtonLarge.isDisplayed();
    }
}
