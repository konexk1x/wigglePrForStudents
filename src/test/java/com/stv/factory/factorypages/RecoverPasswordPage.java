package com.stv.factory.factorypages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecoverPasswordPage extends FactoryPage {
    @FindBy(xpath = "//button[contains(text(),'Reset my password')]")
    private WebElement resetButton;
    @FindBy(id = "Email-error")
    private WebElement warningMessage;

    public void clickOnResetButton() {
        resetButton.click();
    }

    public boolean isWarningMessageDisplayed() {
        return warningMessage.isDisplayed();
    }
}
