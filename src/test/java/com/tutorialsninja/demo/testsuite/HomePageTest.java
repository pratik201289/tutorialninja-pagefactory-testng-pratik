package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIT() {
        homePage = new HomePage();
    }


    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.hoverAndClickOnDesktop();
        homePage.selectMenu("Show All Desktops");
        String expectedText = "Desktops";
        Assert.assertEquals(homePage.getDesktopsText(), expectedText, "Desktops text is not displayed");
    }


    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.hoverAndClickOnLaptopsAndNotebooksTab();
        homePage.selectMenu("Show All Laptops & Notebooks");
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(homePage.getLaptopsAndNotBooksText(), expectedText, "Laptops & Notebooks is not displayed");
    }

    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.hoverAndClickOnComponents();
        homePage.selectMenu("Show All Components");
        String expectedText = "Components";
        Assert.assertEquals(homePage.getComponentsText(), expectedText, "Components is not displayed");
    }
}



