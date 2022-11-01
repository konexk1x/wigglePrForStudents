package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class MainPageSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();

    @Given("Main page is loaded")
    public void mainPageIsLoaded() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.isAccountLinkDisplayed();
        mainFactoryPage.clickOnTrustButton();
    }

    @When("Click on Your account link")
    public void clickOnYourAccountLink() {
        mainFactoryPage.clickOnAccountLink();
    }
}
