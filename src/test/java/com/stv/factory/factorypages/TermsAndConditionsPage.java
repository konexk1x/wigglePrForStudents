package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TermsAndConditionsPage extends FactoryPage {
    @FindBy(className = "bem-dialogue__container")
    private WebElement TermAndConditions;
}
