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

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Got it!")    private WebElement gotItBtn;
    @FindAll({ @FindBy(linkText = "Got it!") })    private List<WebElement> gotItBtns;
    @FindBy(id = "mat-input-0")    private WebElement userName;
    @FindBy(id = "mat-input-1")    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")    private WebElement loginBtn;
    @FindBy(css = "span.username.mr-12")    private WebElement loginName;
    @FindBy (xpath = "//span[text()='Dashboard ']") private WebElement dashboard;
    @FindBy (xpath = "//ms-add-button[contains(tooltip,TITLE)]")    private WebElement addButton;
    @FindBy (css = "ms-text-field[formcontrolname='name']>input") private WebElement name;
    @FindBy (css = "ms-text-field[formcontrolname='code']>input")    private WebElement code;
    @FindBy (css = "ms-save-button.ng-star-inserted,ms-save-button>button")    private WebElement saveButton;
    @FindBy (css = "div#toast-container")    private WebElement message;  //   div[role='allertdialog']
    @FindAll({ @FindBy (css = "div#toast-container")})    private List <WebElement> messagesList;  //   div[role='allertdialog']
    @FindBy (css = "ms-delete-button.ng-star-inserted")    private WebElement deleteButton;
    @FindAll({ @FindBy (css = "ms-delete-button.ng-star-inserted") })  private List<WebElement> deleteButtonList;
    @FindAll({ @FindBy (css = "ms-edit-button.ng-star-inserted") })  private List<WebElement> editButtonList;
    @FindAll({ @FindBy (css = "tbody>tr>td:nth-child(2)") })  private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")    private WebElement yesButton;
    @FindBy(css = "mat-select[formcontrolname='id']")    private WebElement country;
    @FindBy(css = "input.mat-input-element.mat-form-field-autofill-control") WebElement searchName;
    @FindBy(css = "button[class='mat-focus-indicator mat-raised-button mat-button-base mat-accent']") private WebElement searchButton;
    @FindAll({ @FindBy(css = "mat-option[role='option']>span") }) private List<WebElement> optionsList;
    @FindBy(css = "mat-option[role='option']>span") private WebElement option;
    /////////////////////////////// subjects
    @FindBy(css = "mat-select[formcontrolname='id']")    private WebElement subjectCategory;
    @FindBy(css = "mat-select[formcontrolname='value']")    private WebElement style;
    /////////////////////////////// position salary and position
    @FindBy (css = "ms-text-field[formcontrolname='title']>input")    private WebElement namePositionSalary;
    @FindBy(css = "ms-text-field[formcontrolname='shortName']>input")    private WebElement shortName;
    /////////////////////////////// Excel Template
    @FindBy(css = "ms-integer-field[formcontrolname='periodCount']>input")    private WebElement periodCount;
    @FindBy(css = "div[role='tab'][aria-posinset='2']")  private WebElement exelTempVerTab;
    @FindBy(css = "ms-integer-field[formcontrolname='rowSize']>input")    private WebElement rowSize;
    @FindBy(css = "ms-integer-field[formcontrolname='columnSize']>input")    private WebElement columnSize;
    @FindBy(css = "ms-button>button") private WebElement addVersionButton;
    @FindBy(css = "button[aria-label='Close dialog']")    private WebElement closeDialogWindow;
    /////////////////////////////// Salary Type Modifiers Constants
    // @FindBy (css = "#mat-chip-list-input-0")    private WebElement userType; // id degisiyor
    @FindBy (css = "div.mat-chip-list-wrapper")    private WebElement userType;
    @FindBy (css = "mat-icon[class='mat-icon notranslate mat-chip-remove mat-chip-trailing-icon material-icons mat-icon-no-color']")    private WebElement cancelUserType;

    @FindBy (css = "input[data-placeholder='Description']")    private WebElement description;
    @FindBy (css = "input[data-placeholder='Variable']")    private WebElement variable;
    @FindBy (css = "input[data-placeholder='Priority']")    private WebElement priority;
    @FindBy (css = "input[data-placeholder='Amount']")    private WebElement amount;

    @FindBy (css = "input[name='name']")    private WebElement salaryConstantName;
    @FindBy (css = "button[aria-label='Open calendar']")    private WebElement openCalendar;
    @FindBy (css = "td[aria-label='November 11, 2020']")    private WebElement selectDate;
    @FindBy (css = "input[data-placeholder='Valid From']")    private WebElement validFrom;
    @FindBy (css = "ms-text-field[formcontrolname='key']>input") private WebElement key;
    @FindBy (css = "*[formcontrolname='value']>input") private WebElement valueConstans;
    /////////////////////////////// budgetAccount
    @FindBy (css = "mat-select[formcontrolname='category']") private WebElement category;
    @FindBy (xpath = "//span[text()='Subcategory']") private WebElement subcategory;
    @FindBy (css = "mat-select[formcontrolname='type']") private WebElement type;
    @FindBy (xpath = "//span[text()='Balance Type']") private WebElement balanceType;
    @FindBy (xpath = "//span[text()='Integration Codes']") private WebElement integrationCodes;
    @FindBy (css = "mat-select[formcontrolname='currency']") private WebElement currency;
    @FindBy (xpath = "(//mat-expansion-panel-header[@role='button']/span)[1]")    private WebElement formula;
    @FindBy (xpath = "(//div[@cdk-overlay-origin])[5]")    private WebElement budgetType;
    @FindAll({ @FindBy (css = "input[name*='Formula']") })  private List<WebElement> formulaList;
    //@FindBy (css = "ms-save-button.ng-star-inserted")  private WebElement saveFormulaList;
    @FindBy (xpath = "(//mat-expansion-panel-header[@role='button']/span)[3]")    private WebElement contraAcc;
    @FindBy (xpath = "(//ms-add-button[contains(tooltip,TITLE)])[2]")    private WebElement addContraAcc;

    @FindBy (css = "ms-text-field[formcontrolname='orderNo']>input") private WebElement orderNo;
    @FindBy (css = "input[placeholder='Expense accout code prefixes']")    private WebElement expenseAccPrefixes;
    @FindBy (xpath = "//mat-icon[text()='cancel']")    private WebElement cancelExpenseAccPrefixes;

    @FindBy (css = "ms-button>button")    private WebElement addCost;
    @FindBy (css = "div[aria-posinset='2']")    private WebElement tabConstants;

    // 3.12) Yeni bir Cost Centers oluşturun onu DUZENLEYIN (editleyin) ve onu SILIN.
//    Budget > Setup > Cost Centers


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "loginButton": myElement = loginBtn;break;
            case "gotItBtn":   if (gotItBtns.size() == 0) return; myElement = gotItBtn; break;
            case "addButton": myElement = addButton;break;
            case "saveButton": myElement = saveButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "yesButton": myElement = yesButton;break;
            case "country": myElement = country;break;
            /////////////////////////////
            case "subjectCategory": myElement = subjectCategory; break;
            case "style": myElement = style; break;

            case "addVersionButton": myElement = addVersionButton; break;
            case "closeDialogWindow": myElement = closeDialogWindow; break;
            case "exelTempVerTab": myElement = exelTempVerTab; break;

            case "userType": myElement = userType; break;
            case "cancelUserType": myElement = cancelUserType; break;

            case "openCalendar": myElement = openCalendar; break;
            case "validFrom": myElement = validFrom; break;
            case "selectDate": myElement = selectDate; break;

            case "category": myElement = category; break;
            case "subcategory": myElement = subcategory; break;
            case "type": myElement = type; break;
            case "balanceType": myElement = balanceType; break;
            case "integrationCodes": myElement = integrationCodes; break;
            case "currency": myElement = currency; break;
            case "expenseAccPrefixes": myElement = expenseAccPrefixes; break;
            case "formula": myElement = formula; break;
            case "budgetType": myElement = budgetType; break;
            //case "saveFormulaList": myElement = saveFormulaList; break;
            case "contraAcc": myElement = contraAcc; break;
            case "addContraAcc": myElement = addContraAcc; break;
            case "cancelExpenseAccPrefixes": myElement = cancelExpenseAccPrefixes; break;
            case "tabConstants": myElement = tabConstants; break;
            case "addCost": myElement = addCost; break;

            case "randomSelect": myElement=randomSelectFromList(optionsList);break;

            default: myElement= selectItemFromList(optionsList, elementName); break;
//
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {
            case "username": myElement = userName; break;
            case "password": myElement = password; break;
            case "name": myElement = name; break;
            case "code": myElement = code; break;

            case "namePositionSalary": myElement = namePositionSalary; break;

            case "shortName": myElement = shortName; break;

            case "periodCount": myElement = periodCount; break;
            case "rowSize": myElement = rowSize; break;
            case "columnSize": myElement = columnSize; break;

            case "description": myElement = description; break;
            case "variable": myElement = variable; break;
            case "priority": myElement = priority; break;
            case "amount": myElement = amount; break;

            case "salaryConstantName": myElement = salaryConstantName; break;
            case "validFrom": myElement = validFrom; break;
            case "key": myElement = key; break;
            case "valueConstans": myElement = valueConstans; break;
            /////////////////////////////////////////
            case "orderNo": myElement = orderNo; break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findElementListsAndFill(String listName, String value) {
        switch (listName) {
            case "formulaList": fillElementsListWithRandomValue(formulaList, value); break;
        }
    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "dashboard": myElement = dashboard;break;
            case "success/error": myElement = message;break;
        }
        //if(myElement.getText().length()>0)
        verifyElementContainsText(myElement, mesaj);
        // mesajin kaybolmasi icin
        if(!elementName.equalsIgnoreCase("dashboard"))
            if (!messagesList.isEmpty())
                if(message.getText().length()>0)
                    clickFunction(message);
//            wait.until(ExpectedConditions.invisibilityOf(message));
    }

    public void deleteItemFunction(String value){
        boolean notFound = true;

        int index = findIndexOfElementFromList(nameList, value, searchName, searchButton);
        clickFunction(deleteButtonList.get(index));

  /*
        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(value)) {
                System.out.println(nameList.get(i).getText() + " has been found...");
                clickFunction(deleteButtonList.get(i));notFound=false; break;
            }
        }
        if(notFound) {
            System.out.println(" has been not found!!!");
            sendKeysFunction(searchName, value);
            clickFunction(searchButton);
            deleteItemFunction(value);
        }
        */
        clickFunction(yesButton);
    }

    public void editItemFunction(String currentValue){
        boolean notFound = true;

        for (int i = 0; i < nameList.size(); i++) {
            if(nameList.get(i).getText().equalsIgnoreCase(currentValue)) {
                System.out.println(nameList.get(i).getText() + " has been found...");
                clickFunction(editButtonList.get(i)); notFound = false; break;
            }
        }
        if(notFound) { // ilk sayfa da yok ise search de aramak icin
            sendKeysFunction(searchName, currentValue);
            clickFunction(searchButton);
            editItemFunction(currentValue);
        }
    }

    public void searchNotFoundItem(String value){

    }

}
