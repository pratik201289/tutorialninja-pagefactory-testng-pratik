package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customlisteners.CustomListeners;
import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

import java.util.List;

public class MyAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink1;

    //By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    @CacheLookup
    @FindBys(@FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li"))
    List<WebElement> selectMyAccount;

    //By selectMyAccount = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register Account']")
    WebElement registerAccountText;
    //By registerAccountText = By.xpath("//h1[text()='Register Account']");
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Returning Customer']")
    WebElement returningCustomerText;
    // By returningCustomerText = By.xpath("//h2[text()='Returning Customer']");
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    //By firstName = By.id("input-firstname");
    @CacheLookup
    @FindBy(id = "input-lastName")
    WebElement lastName;
    //By lastName = By.id("input-lastName");
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailId;
    //By emailId = By.id("input-email");

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;
    //By telephone = By.id("input-telephone");
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    //By password = By.id("input-password");
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    //By confirmPassword = By.id("input-confirm");
    @CacheLookup
    @FindBy(xpath = "//label[1]/input[@name='newsletter']")
    WebElement yesRadioButton;
    //By yesRadioButton = By.xpath("//label[1]/input[@name='newsletter']");
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyPolicy;
    //By privacyPolicy = By.name("agree");
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    //By continueButton = By.xpath("//input[@value='Continue']");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedMessage;
    //    By accountCreatedMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinue;
    //By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    //By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinue;

   // By clickContinue = By.xpath("//a[contains(text(),'Continue')]");
   @CacheLookup
   @FindBy(xpath = "//input[@value='Login']")
   WebElement loginButton;

    //By loginButton = By.xpath("//input[@value='Login']");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText;
    //By myAccountText = By.xpath("//h2[contains(text(),'My Account')]");

    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[5]/a[1]")
    WebElement LogOut;

    public void clickOnLogOut(){
        clickOnElement(LogOut);
    }

    public void clickOnMyAccountLink() {
        //mouseHoverToElement(myAccountLink);
        clickOnElement(myAccountLink);
    }

    public void clickOnMyAccountLink1() {
        //mouseHoverToElement(myAccountLink);
        clickOnElement(myAccountLink1);
    }
    public void selectMyAccountOptions(String option) {
        // List<WebElement> myAccountList = driver.findElements(selectMyAccount);
        Reporter.log("Select My Account List: "+selectMyAccount.toString());
            try{
            for (WebElement options : selectMyAccount) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }}
            catch (StaleElementReferenceException e){
               selectMyAccount.toString();
            }

    }

    public String getRegisterAccountText() {

        Reporter.log("Verify Register Text : "+registerAccountText.toString());
        CustomListeners.test.log(Status.PASS, "Verify Register Text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);
    }

    public String getReturningCustomerText() {
        Reporter.log("get Returning Customer Text : "+returningCustomerText.toString());
        CustomListeners.test.log(Status.PASS, "get Returning Customer Text " + returningCustomerText.toString());

        return getTextFromElement(returningCustomerText);
    }

    public void enterFirstName() {
        Reporter.log("Enter FirstName "+ firstName.toString());
        sendTextToElement(firstName, "Bruce");
        CustomListeners.test.log(Status.PASS, "Enter FirstName : " + firstName.toString());

    }
    public void enterLastName() {
        Reporter.log("Enter LastName "+ lastName.toString());
        sendTextToElement(lastName, "Tyson");
        CustomListeners.test.log(Status.PASS, "Enter FirstName : " + lastName.toString());

    }

    public void enterEmailId() {
        Reporter.log("Enter emailId "+ emailId.toString());
        sendTextToElement(emailId, "testvyas@gmail.com");
        CustomListeners.test.log(Status.PASS, "Enter emailId : " + emailId.toString());

    }

    public void enterTelephone() {
        Reporter.log("Enter telephone "+ telephone.toString());
        sendTextToElement(telephone, "8866300550");
        CustomListeners.test.log(Status.PASS, "Enter telephone : " + telephone.toString());

    }

    public void enterPassword() {
        Reporter.log("Enter password "+ password.toString());
        sendTextToElement(password, "testvyas");
        CustomListeners.test.log(Status.PASS, "Enter password : " + password.toString());

    }

    public void enterConfirmPassword() {
        Reporter.log("Enter confirmPassword "+ confirmPassword.toString());
        sendTextToElement(confirmPassword, "testvyas");
        CustomListeners.test.log(Status.PASS, "Enter confirmPassword : " + confirmPassword.toString());

    }

    public void clickOnYesRadioButton() {
        Reporter.log("clickOnElement "+ yesRadioButton.toString());
        clickOnElement(yesRadioButton);
        CustomListeners.test.log(Status.PASS, "clickOnElement : " + yesRadioButton.toString());

    }

    public void clickOnPrivacyPolicyCheckBox() {
        Reporter.log("clickOnPrivacyPolicyCheckBox "+ privacyPolicy.toString());
        clickOnElement(privacyPolicy);
        CustomListeners.test.log(Status.PASS, "clickOnPrivacyPolicyCheckBox : " + privacyPolicy.toString());

    }

    public void clickOnContinue() {
        Reporter.log("clickOnContinue "+ continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "clickOnContinue : " + continueButton.toString());

    }

    public String getAccountCreatedMessage() {
        Reporter.log("getAccountCreatedMessage "+ accountCreatedMessage.toString());
        CustomListeners.test.log(Status.PASS, "getAccountCreatedMessage : " + accountCreatedMessage.toString());

        return getTextFromElement(accountCreatedMessage);
    }

    public void clickOnContinueButton() {
        Reporter.log("clickOnContinueButton "+ clickOnContinue.toString());
        clickOnElement(clickOnContinue);
        CustomListeners.test.log(Status.PASS, "clickOnContinueButton : " + clickOnContinue.toString());

    }

    public String getAccountLogoutText() {
        Reporter.log("getAccountLogoutText "+ accountLogoutText.toString());
        CustomListeners.test.log(Status.PASS, "getAccountLogoutText : " + accountLogoutText.toString());

        return getTextFromElement(accountLogoutText);
    }

    public void clickContinue() {
        Reporter.log("clickOnContinue "+ clickContinue.toString());
        clickOnElement(clickContinue);
        CustomListeners.test.log(Status.PASS, "clickOnContinue : " + clickContinue.toString());


    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton "+ loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "clickOnLoginButton : " + loginButton.toString());

    }

    public String getMyAccountText() {
        Reporter.log("getMyAccountText "+ myAccountText.toString());
        CustomListeners.test.log(Status.PASS, "getMyAccountText : " + myAccountText.toString());

        return getTextFromElement(myAccountText);
    }

}
