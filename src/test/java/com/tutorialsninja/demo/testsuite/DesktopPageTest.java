package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Map;
@Listeners(CustomListeners.class)
public class DesktopPageTest extends BaseTest {

    DesktopPage deskTopPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        deskTopPage =new DesktopPage();
        homePage=new HomePage();
    }
    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        homePage.hoverAndClickOnDesktop();
        //1.2 Click on “Show All Desktops”
        deskTopPage.showAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        deskTopPage.setSortSelectZToA();
        //1.4 Verify the Product will arrange in Descending order
        //deskTopPage.verifyProductArrangeInDescendingOrder();
        Map<String, ArrayList> mapArrays = deskTopPage.verifyProductArrangeInDescendingOrder();
        Assert.assertEquals(mapArrays.get("originalProductsName"), mapArrays.get("afterSortByZToAProductsName"));

    }


    @Test(groups = {"smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() {
        // 2.1 Mouse hover on Desktops Tab. and click
        homePage.hoverAndClickOnDesktop();
        //2.2 Click on “Show All Desktops”
        deskTopPage.showAllDesktops();
        //2.3 Select Sort By position "Name: A to Z"
        deskTopPage.sortAToZ();
        //2.4 Select product “HP LP3065”
        deskTopPage.setSelectProduct();
        //2.5 Verify the Text "HP LP3065"
        String expectedText = "HP LP3065";
        String actualText = deskTopPage.getProductText();
        Assert.assertEquals(actualText, expectedText, "HP LP3065 Product not display");
        //2.6 Select Delivery Date "2022-11-30"
        deskTopPage.pickDate();
        //2.7.Enter Qty "1” using Select class
        //2.8 Click on “Add to Cart” button
        deskTopPage.addProductToCart();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedMessage3 = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(deskTopPage.productAddedToCartDisplayed(), expectedMessage3, "Message is not displayed");
        // 2.10 Click on link “shopping cart” display into success message
        deskTopPage.setShoppingCart();

        // 2.11 Verify the text "Shopping Cart"
        String expectedMessage4 = "Shopping Cart";
        Assert.assertEquals(deskTopPage.textShoppingCart(), expectedMessage4, "Message is not displayed");

        // 2.12 Verify the Product name "HP LP3065"
        String expectedMessage5 = "HP LP3065";
        Assert.assertEquals(deskTopPage.getProductText1(), expectedMessage5, "Message is not displayed");
        //2.13 Verify the Delivery Date "2022-11-30"
        deskTopPage.verifyDeliveryDate();
        //2.14 Verify the Model "Product21"
        String expectedMessage6 = "Product 21";
        Assert.assertEquals(deskTopPage.verifyProductModel(), expectedMessage6, "Message is not displayed");

        //2.15 Verify the Todat "£74.73"
        deskTopPage.selectYourCurrency();
        String expectedMessage7 = "£74.73";
        Assert.assertEquals(deskTopPage.total(), expectedMessage7, "Message is not displayed");

    }

}
