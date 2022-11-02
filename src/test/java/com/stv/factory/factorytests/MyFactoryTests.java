package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.RecoverPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFactoryTests extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();
    RecoverPasswordPage recoverPasswordPage = new RecoverPasswordPage();

    @Test(description = "Checking if user can reset password with empty address field")
    public void checkingPasswordReset() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        loginPage.clickOnForgottenPasswordLink();
        recoverPasswordPage.clickOnResetButton();
        Assert.assertTrue(recoverPasswordPage.isWarningMessageDisplayed(), "Warning message isn't visible");
    }

}
