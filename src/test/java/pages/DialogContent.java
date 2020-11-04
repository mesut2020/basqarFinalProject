package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends _Parent{
    WebElement myElement;
    List<WebElement> myElementList;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;
    @FindAll({ @FindBy(linkText = "Got it!") })
    private List<WebElement> gotItBtns;

    @FindBy(id = "mat-input-0")
    private WebElement userName;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(css = "span.username.mr-12")
    private WebElement loginName;

    @FindBy (xpath = "//span[text()='Dashboard ']")
    private WebElement dashboard;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton": myElement = loginBtn;break;
            case "gotItBtn":   if (gotItBtns.size() == 0) return; myElement = gotItBtn; break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {
            case "username": myElement = userName; break;
            case "password": myElement = password; break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "dashboard": myElement = dashboard;break;

        }

        verifyElementContainsText(myElement, mesaj);

    }

}
