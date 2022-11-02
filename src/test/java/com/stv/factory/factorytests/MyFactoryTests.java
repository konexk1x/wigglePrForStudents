package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.RecoverPasswordPage;
import com.stv.factory.factorypages.RecoveryPasswordSubmitPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyFactoryTests extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();
    RecoverPasswordPage recoverPasswordPage = new RecoverPasswordPage();
    RecoveryPasswordSubmitPage recoveryPasswordSubmitPage = new RecoveryPasswordSubmitPage();

    @DataProvider
    public static Object[][] userMail() {
        return new Object[][]{{"test_mail@gmail.com"}};
    }

    @Test(description = "Checking if user can reset password with empty address field")
    public void checkingPasswordReset() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        loginPage.clickOnForgottenPasswordLink();
        recoverPasswordPage.clickOnResetButton();
        Assert.assertTrue(recoverPasswordPage.isWarningMessageDisplayed(), "Warning message isn't visible");
    }

    @Test(description = "Password reset", dataProvider = "userMail")
    public void passwordReset(String email) {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        loginPage.clickOnForgottenPasswordLink();
        recoverPasswordPage.enterUserEmail(email);
        recoverPasswordPage.clickOnResetButton();
        Assert.assertTrue(recoveryPasswordSubmitPage.successMessageDisplayed(), "Password reset failure");
    }
}
