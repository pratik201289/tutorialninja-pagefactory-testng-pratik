package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class myAccountPageTest extends BaseTest {

    MyAccountPage myAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        myAccountPage = new MyAccountPage();
    }


    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.selectMyAccountOptions("Register");
        String expectedText = "Register Account";
        Assert.assertEquals(myAccountPage.getRegisterAccountText(), expectedText, "Register Account is not displayed");
    }


    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.selectMyAccountOptions("Login");
        String expectedText = "Returning Customer";
        Assert.assertEquals(myAccountPage.getReturningCustomerText(), expectedText, "Returning customer is not displayed");
    }


    @Test(groups = "regression")
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.selectMyAccountOptions("Register");
        myAccountPage.enterFirstName();
        myAccountPage.enterLastName();
        myAccountPage.enterEmailId();
        myAccountPage.enterTelephone();
        myAccountPage.enterPassword();
        myAccountPage.enterConfirmPassword();
        myAccountPage.clickOnYesRadioButton();
        myAccountPage.clickOnPrivacyPolicyCheckBox();
        myAccountPage.clickOnContinue();
        String expectedText = "Your Account Has Been Created!";
        Thread.sleep(2000);
        Assert.assertEquals(myAccountPage.getAccountCreatedMessage(), expectedText, "Your Account Has Been Created! is not displayed");
        myAccountPage.clickOnContinueButton();
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.selectMyAccountOptions("Logout");
        String expectedMessage = "Account Logout";
        Assert.assertEquals(myAccountPage.getAccountLogoutText(), expectedMessage, "Account Logout is not displayed");
        myAccountPage.clickContinue();
    }


    @Test(groups = "regression")
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.selectMyAccountOptions("Login");
        myAccountPage.enterEmailId();
        myAccountPage.enterPassword();
        myAccountPage.clickOnLoginButton();
        String expectedText = "My Account";
        Assert.assertEquals(myAccountPage.getMyAccountText(), expectedText, "My Account is not displayed");
        Thread.sleep(2000);
        myAccountPage.clickOnMyAccountLink1();
        myAccountPage.clickOnLogOut();
        String expectedMessage = "Account Logout";
        Assert.assertEquals(myAccountPage.getAccountLogoutText(), expectedMessage, "Account Logout is not displayed");
        myAccountPage.clickContinue();
    }

}
