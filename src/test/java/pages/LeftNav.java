package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends _Parent {
    WebElement myElement;
    List<WebElement> myElementList;

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Setup") private WebElement setup;
    @FindBy(linkText = "Parameters") private WebElement parameters;
    @FindBy(linkText = "Countries") private WebElement countries;
    @FindBy(linkText = "Cities") private WebElement cities;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setup": myElement = setup;break;
            case "parameters": myElement = parameters;break;
            case "countries": myElement = countries;break;
            case "cities": myElement = cities;break;

        }
        clickFunction(myElement);
    }




}
