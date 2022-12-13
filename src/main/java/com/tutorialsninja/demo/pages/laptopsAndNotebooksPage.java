package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.*;

public class laptopsAndNotebooksPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
    WebElement showAllLaptops;

    //By showAllLaptops = By.xpath("//a[text()='Show All Laptops & Notebooks']");
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement priceHighToLow;

    //By priceHighToLow = By.id("input-sort");
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement selectMacbook;
    //By selectMacbook = By.linkText("MacBook");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='MacBook']")
    WebElement macbookText;
    //By macbookText = By.xpath("//h1[text()='MacBook']");

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;

    //By addToCart = By.id("button-cart");
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    //By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    // By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    //By shoppingCartText = By.xpath("//div[@id='content']//h1");
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearQuantity;

    // By clearQuantity = By.xpath("//input[@value='1']");

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement addQuantity;
    //By addQuantity = By.xpath("//input[@value='1']");

    @CacheLookup
    @FindBy(xpath = "//button[@data-original-title='Update']")
    WebElement updateTab;

    //By updateTab = By.xpath("//button[@data-original-title='Update']");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;
    //By successModifiedMessage = By.xpath("//body/div[@id='checkout-cart']/div[1]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;

    //By currency = By.xpath("//span[contains(text(),'Currency')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'£ Pound Sterling')]")
    WebElement sterlingPound;

    //By sterlingPound = By.xpath("//button[contains(text(),'£ Pound Sterling')]");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement total;
    //By total = By.xpath("//tbody/tr[1]/td[6]");
    @CacheLookup
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement checkOut;

    //By checkOut = By.xpath("//a[text()='Checkout']");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Checkout']")
    WebElement checkOutText;

    //By checkOutText = By.xpath("//h1[text()='Checkout']");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    //By newCustomerText = By.xpath("//h2[contains(text(),'New Customer')]");
    @CacheLookup
    @FindBy(xpath = "//input[@name='account' and @value='guest']")
    WebElement guestCheckoutRadioButton;

    //By guestCheckoutRadioButton = By.xpath("//input[@name='account' and @value='guest']");
    @CacheLookup
    @FindBy(id = "button-account")
    WebElement continueTab;
//    By continueTab = By.id("button-account");

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    // By firstName = By.name("firstname");
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastName;

    //By lastName = By.name("lastName");
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement emailId;
    //By emailId = By.id("input-payment-email");
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;
    //By telephone = By.name("telephone");
    @CacheLookup
    @FindBy(name = "address_1")
    WebElement address;
    //By address = By.name("address_1");
    @CacheLookup
    @FindBy(name = "city")
    WebElement city;
    // By city = By.name("city");
    @CacheLookup
    @FindBy(name = "postcode")
    WebElement postcode;
    //By postcode = By.name("postcode");
    @CacheLookup
    @FindBy(id = "input-payment-country")
    WebElement selectCountry;
    //By selectCountry = By.id("input-payment-country");
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement selectState;
    //By selectState = By.id("input-payment-zone");
    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement continueButton;
    //By continueButton = By.id("button-guest");
    @CacheLookup
    @FindBy(name = "comment")
    WebElement addComment;
    //By addComment = By.name("comment");
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termsAndConditions;
    //By termsAndConditions = By.name("agree");

    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement clickContinue;
    //By clickContinue = By.id("button-payment-method");
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMessage;
    //By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void clickOnShowAllLaptopsAndNotebooks() {
        clickOnElement(showAllLaptops);
    }

    public Map<String, ArrayList> selectSortByPriceHighToLow() {

        Map<String, ArrayList> mapArrays = new HashMap<String, ArrayList>();

//        selectByVisibleTextFromDropDown(priceHighToLow, "Price (High > Low)");
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

        mapArrays.put("originalProductsPrice", (ArrayList) originalProductsPrice);
        mapArrays.put("afterSortByPrice", afterSortByPrice);
        Reporter.log("Original Product Before Sort By Price " +originalProductsPrice.toString());
        Reporter.log("Original Product After Sort By Price " +afterSortByPrice.toString());
        CustomListeners.test.log(Status.PASS, "Original Product Before Sort by Price " + originalProductsPrice.toString());
        CustomListeners.test.log(Status.PASS, "Original Product After Sort by Price " + afterSortByPrice.toString());

        return mapArrays;

    }

    public void selectProductMacbook() {
        Reporter.log("Select the Product: " +selectMacbook.toString());
        clickOnElement(selectMacbook);
        CustomListeners.test.log(Status.PASS, "Select the Product " + selectMacbook.toString());

    }

    public String getMacbookText() {
        Reporter.log("Verify the Text : " +macbookText.toString());
        CustomListeners.test.log(Status.PASS, "Verify the Text " + macbookText.toString());
        return getTextFromElement(macbookText);
    }
    public void clickOnAddToCartButton() {
        Reporter.log("Click On Add to Cart: " +addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart " + addToCart.toString());
    }
    public String getSuccessMessage() {
        Reporter.log("Verify the Message : " +successMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify the Message " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartText() {
        Reporter.log("Click On Shopping to Cart: " +shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
        CustomListeners.test.log(Status.PASS, "Click on Shopping to Cart " + shoppingCartLink.toString());
    }


    public String getShoppingCartText() {
        Reporter.log("Verify the Message : " +shoppingCartText.toString());
        CustomListeners.test.log(Status.PASS, "Verify the Message " + shoppingCartText.toString());

        return getTextFromElement(shoppingCartText);
    }

    public void clearQuantityField() {
        Reporter.log("Clear the Quantity Field : " +clearQuantity.toString());
        clearQuantity.clear();
        //driver.findElement((By) clearQuantity).clear();
        CustomListeners.test.log(Status.PASS, "Clear the Quantity " + clearQuantity.toString());

    }
    public void addQuantityInField() {
        Reporter.log("Send the Quantity : " +addQuantity.toString());
        sendTextToElement(addQuantity, "2");
        CustomListeners.test.log(Status.PASS, "Send the Quantity " + addQuantity.toString());

    }

    public void clickOnUpdateTab() {
        Reporter.log("Click on  : " +updateTab.toString());
        clickOnElement(updateTab);
        CustomListeners.test.log(Status.PASS, "Click on " + updateTab.toString());
    }

    public String getSuccessModifiedMessage() {
        Reporter.log("Verify success Message  : " +successModifiedMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify the Success Message " + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }

    public void clickOnCurrency() {
        Reporter.log("Click on Currency  : " +currency.toString());
        clickOnElement(currency);
        CustomListeners.test.log(Status.PASS, "Click on Currency " + currency.toString());

    }

    public void selectSterlingPound() {
        Reporter.log("Select on Pound Currency  : " +sterlingPound.toString());
        clickOnElement(sterlingPound);
        CustomListeners.test.log(Status.PASS, "Select Pound Currency " + sterlingPound.toString());

    }
    public String getTotal() {
        Reporter.log("Verify Total  : " +total.toString());
        CustomListeners.test.log(Status.PASS, "Verify Total " + total.toString());
        return getTextFromElement(total);
    }
    public void clickOnCheckOut() {
        Reporter.log("Click On Checkout  : " +checkOut.toString());
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS, "Click On Checkout " + checkOut.toString());
    }
    public String getCheckOutText() {
        Reporter.log("Verify Checkout  : " +checkOutText.toString());
        CustomListeners.test.log(Status.PASS, "Verify Checkout " + checkOutText.toString());
        return getTextFromElement(checkOutText);
    }

    public String getNewCustomerText() {
        Reporter.log("Verify New Customer  : " +newCustomerText.toString());
        CustomListeners.test.log(Status.PASS, "Verify New Customer " + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckOutRadioButton() {
        Reporter.log("Click On Radio Button  : " +guestCheckoutRadioButton.toString());
        clickOnElement(guestCheckoutRadioButton);
        CustomListeners.test.log(Status.PASS, "Click On Radio Button " + guestCheckoutRadioButton.toString());

    }

    public void clickOnContinueTab() {
        Reporter.log("Click On Continue Button  : " +continueTab.toString());
        clickOnElement(continueTab);
        CustomListeners.test.log(Status.PASS, "Click On Continue Button " + continueTab.toString());

    }

    public void fillAllMandatoryField() {
        Reporter.log("Enter FirstName "+ firstName.toString());
        sendTextToElement(firstName, "Tom");
        CustomListeners.test.log(Status.PASS, "Enter FirstName  " + firstName.toString());

        Reporter.log("Enter Lastname "+ lastName.toString());
        sendTextToElement(lastName, "Ford");
        CustomListeners.test.log(Status.PASS, "Enter lastName  " + lastName.toString());

        Reporter.log("Enter Email "+ emailId.toString());
        sendTextToElement(emailId, "tom12346@gmail.com");
        CustomListeners.test.log(Status.PASS, "Enter Email  " + emailId.toString());

        Reporter.log("Enter Tel "+ telephone.toString());
        sendTextToElement(telephone, "07070223345");
        CustomListeners.test.log(Status.PASS, "Enter Tel  " + telephone.toString());

        Reporter.log("Enter Address "+ address.toString());
        sendTextToElement(address, "103, High road");
        CustomListeners.test.log(Status.PASS, "Enter Tel  " + address.toString());

        Reporter.log("Enter city "+ city.toString());
        sendTextToElement(city, "London");
        CustomListeners.test.log(Status.PASS, "Enter City  " + city.toString());

        Reporter.log("Enter Postcode "+ postcode.toString());
        sendTextToElement(postcode, "CR76JG");
        CustomListeners.test.log(Status.PASS, "Enter Postcode  " + postcode.toString());

        Reporter.log("Select Country "+ selectCountry.toString());
        selectByVisibleTextFromDropDown(selectCountry, "United Kingdom");
        CustomListeners.test.log(Status.PASS, "Select Country  " + selectCountry.toString());


        Reporter.log("Select state "+ selectState.toString());
        selectByVisibleTextFromDropDown(selectState, "Greater London");
        CustomListeners.test.log(Status.PASS, "Select State  " + selectState.toString());
    }

    public void clickOnContinueButton() {
        Reporter.log("Click on Continue  "+ continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on Continue  " + continueButton.toString());

    }

    public void addCommentInCommentBox() {

        Reporter.log("Add comment  " + addComment.toString());
        sendTextToElement(addComment, "Order should be delivered on time");
        CustomListeners.test.log(Status.PASS, "Add comment " + addComment.toString());
    }

    public void clickOnTermsAndConditionsCheckBox() {
        Reporter.log("Click on Terms and Condition Checkbox  " + termsAndConditions.toString());
        clickOnElement(termsAndConditions);
        CustomListeners.test.log(Status.PASS, "Click on Terms and Condition Checkbox " + termsAndConditions.toString());

    }

    public void clickOnContinue() {

        Reporter.log("Click on Continue " + clickContinue.toString());
        clickOnElement(clickContinue);;
        CustomListeners.test.log(Status.PASS, "Click on Continue" + termsAndConditions.toString());

    }

    public String getWarningMessage() {
        Reporter.log("Verify Warning " + warningMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify Warning " + warningMessage.toString());

        return getTextFromElement(warningMessage);
    }


}
