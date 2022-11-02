package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecoveryPasswordSubmitPage extends FactoryPage {
    @FindBy(xpath = "//p[contains(text(),'Password reset instructions have been sent to your email address.')]")
    private WebElement successMessage;

    public boolean successMessageDisplayed() {
        return successMessage.isDisplayed();
    }
}
