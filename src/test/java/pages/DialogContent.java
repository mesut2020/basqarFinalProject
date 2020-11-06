package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends _Parent{
    WebElement myElement;
    List<WebElement> myElementList;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Got it!")    private WebElement gotItBtn;
    @FindAll({ @FindBy(linkText = "Got it!") })    private List<WebElement> gotItBtns;
    @FindBy(id = "mat-input-0")    private WebElement userName;
    @FindBy(id = "mat-input-1")    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")    private WebElement loginBtn;
    @FindBy(css = "span.username.mr-12")    private WebElement loginName;
    @FindBy (xpath = "//span[text()='Dashboard ']")    private WebElement dashboard;
    @FindBy (xpath = "//ms-add-button[contains(tooltip,ADD)]")    private WebElement addButton;
    @FindBy (css = "ms-text-field[formcontrolname='name']>input")    private WebElement name;
    @FindBy (css = "ms-text-field[formcontrolname='code']>input")    private WebElement code;
    @FindBy (css = "ms-save-button.ng-star-inserted")    private WebElement saveButton;
    @FindBy (css = "div#toast-container")    private WebElement message;  //   div[role='allertdialog']
    @FindBy (css = "ms-delete-button.ng-star-inserted")    private WebElement deleteButton;
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })  private List<WebElement> deleteButtonList;
    @FindAll({ @FindBy (css = "ms-edit-button.ng-star-inserted") })  private List<WebElement> editButtonList;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;
    @FindBy(css = "mat-select[formcontrolname='id']")    private WebElement country;
    @FindBy(css = "mat-option[role='option']")    private WebElement option;
    @FindAll({ @FindBy(css = "mat-option[role='option']>span") })    private List<WebElement> optionsList;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton": myElement = loginBtn;break;
            case "gotItBtn":   if (gotItBtns.size() == 0) return; myElement = gotItBtn; break;
            case "addButton": myElement = addButton;break;
            case "saveButton": myElement = saveButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "yesButton": myElement = yesButton;break;
            case "country": myElement = country;break;
            case "option": myElement = option;break;
            case "randomCountry": myElement=optionsList.get((int)(Math.random()*200));break;
            default:
                for (int i = optionsList.size()-1; i >= 0 ; i--) {
                    System.out.println("secilecek ulke:"+optionsList.get(i).getText());
                    if(optionsList.get(i).getText().equalsIgnoreCase(elementName))
                        myElement=optionsList.get(i);break;
                }
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {
            case "username": myElement = userName; break;
            case "password": myElement = password; break;
            case "name": myElement = name; break;
            case "code": myElement = code; break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "dashboard": myElement = dashboard;break;
            case "success/error": myElement = message;break;
        }
        verifyElementContainsText(myElement, mesaj);
    }

    public void deleteItemFunction(String value){
        if(message.getText().length()!=0) wait.until(ExpectedConditions.invisibilityOf(message));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("tbody>tr>td:nth-child(2)"),9)   );
        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(value))
                System.out.println(nameList.get(i).getText() + " has been found...");
                clickFunction(deleteButtonList.get(i)); break;
        }
        clickFunction(yesButton);
    }

    public void editItemFunction(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
                By.cssSelector("tbody>tr>td:nth-child(2)"),9)   );
        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(value))
                clickFunction(editButtonList.get(i)); break;
        }
    }

}
