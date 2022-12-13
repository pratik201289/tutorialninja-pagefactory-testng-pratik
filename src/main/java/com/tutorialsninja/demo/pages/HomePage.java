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

public class HomePage extends Utility {

    @CacheLookup
    @FindBys(@FindBy(xpath = "//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"))
    List<WebElement> selectMenu;
    //By selectMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopTab;
    //    By desktopTab = By.xpath("//a[text()='Desktops']");
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Desktops']")
    WebElement desktopsText;
    //  By desktopsText = By.xpath("//h2[text()='Desktops']");
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopsAndNotebooksTab;
    //By laptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotBooksText;

    //    By laptopsAndNotBooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsTab;

    //    By componentsTab = By.linkText("Components");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;
    //By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public void selectMenu(String menu) {
      //  List<WebElement> topMenuList = driver.findElements(selectMenu);
        Reporter.log("Select My Menu Option " + selectMenu.toString() );
        try {
            for (WebElement element :selectMenu) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
                selectMenu.toString();
        }
    }

    public void hoverAndClickOnDesktop() {
        Reporter.log("Mouse Hover and click on Desktop "+ desktopTab.toString());
        mouseHoverToElementAndClick(desktopTab);
        CustomListeners.test.log(Status.PASS, "Mouse Hover and click on Desktop" + desktopTab.toString());

    }

    public String getDesktopsText() {
        Reporter.log("Get the Desktop Tab "+ desktopsText.toString());
        CustomListeners.test.log(Status.PASS, "Get the Desktop Tab" + desktopTab.toString());
        return getTextFromElement(desktopsText);
    }

    public void hoverAndClickOnLaptopsAndNotebooksTab() {
        Reporter.log("Mouse Hover and click on  "+ laptopsAndNotebooksTab.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
        CustomListeners.test.log(Status.PASS, "Mouse Hover and click on " + laptopsAndNotebooksTab.toString());

    }

    public String getLaptopsAndNotBooksText() {
        Reporter.log("Get the Laptop and NotBooks Text "+ laptopsAndNotBooksText.toString());
        CustomListeners.test.log(Status.PASS, "Get the Laptop and NotBooks Text  " + laptopsAndNotBooksText.toString());
        return getTextFromElement(laptopsAndNotBooksText);
    }

    public void hoverAndClickOnComponents() {
        Reporter.log("Mouse Hover and click on  "+ componentsTab.toString());
        mouseHoverToElementAndClick(componentsTab);
        CustomListeners.test.log(Status.PASS, "Mouse Hover and click on  " + componentsTab.toString());

    }

    public String getComponentsText() {
        Reporter.log("Get the Components Menu Text "+ componentsText.toString());
        CustomListeners.test.log(Status.PASS, "Get the Components Menu Text  " + componentsText.toString());
        return getTextFromElement(componentsText);
    }
}


