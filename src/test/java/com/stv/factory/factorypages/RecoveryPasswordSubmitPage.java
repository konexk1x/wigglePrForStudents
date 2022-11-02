package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecoveryPasswordSubmitPage extends FactoryPage {
    @FindBy(id = "pnlRecoverPasswordThankYou")
    private WebElement successMessage;

    public boolean successMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
