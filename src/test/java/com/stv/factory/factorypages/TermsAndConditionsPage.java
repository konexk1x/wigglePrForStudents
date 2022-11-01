package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsAndConditionsPage extends FactoryPage {
    TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage();

    @FindBy(className = "bem-dialogue__container")
    private WebElement termsAndConditionsForm;

    public boolean isTermsAndConditionsDisplayed() {
        return termsAndConditionsForm.isDisplayed();
    }
}
