package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class _Parent {
    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

    public void clickFunction(WebElement element) {
        //waitUntilVisible();
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void sendKeysFunction(List<WebElement> elementsList, String value) {
        Actions actions = new Actions(driver);
        actions.click(elementsList.get(0)).build().perform();
        for (int i = 0; i < elementsList.size(); i++) {
           //sendKeysFunction(elemenstList.get(i), value + "*" + (Math.random()*1+1) );
            actions.sendKeys(value + "*" + (Math.random()*1+1) + Keys.TAB+Keys.TAB).build().perform();
        }
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void verifyElementContainsText(WebElement element, String expectedText) {
        waitUntilVisible(element);
        //scrollToElement(element);
        String actualText = element.getText();
        System.out.println("actualText:" + actualText);
        System.out.println("expectedText:" + expectedText);
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));
    }

    public WebElement randomSelectFromList(List<WebElement> elementsList) {
        return elementsList.get((int)(Math.random() * elementsList.size()));
    }


}
