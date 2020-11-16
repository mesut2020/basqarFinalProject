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
    @FindBy(css = "a[href='/countries/list']") private WebElement countries;   //   linkText = "Countries"  // linkText de scroll yapmiyor
    @FindBy(linkText = "Cities") private WebElement cities;

    @FindBy(linkText = "Education") private WebElement education;
    @FindBy(xpath = "(//span[text()='Setup'])[5]") private WebElement setupEducation;
    @FindBy(css = "a[href='/subject-categories/list']") private WebElement subjectCategories;   //   linkText = "Subject Categories"
    @FindBy(linkText = "Subjects") private WebElement subjects;

    @FindBy(linkText = "Human Resources") private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]") private WebElement setupHR;
    @FindBy(linkText = "Position Salary") private WebElement positionSalary;
    @FindBy(linkText = "Positions") private WebElement positions;

    @FindBy(linkText = "Salary Types") private WebElement salaryTypes;
    @FindBy(linkText = "Salary Modifiers") private WebElement salaryModifiers;
    @FindBy(linkText = "Salary Constants") private WebElement salaryConstants;

    @FindBy(xpath = "(//span[text()='Reports'])[4]") private WebElement reports;
    @FindBy(xpath = "(//span[text()='Setup'])[7]") private WebElement setupReports;
    @FindBy(linkText = "Excel Template") private WebElement excelTemplate;

    @FindBy(linkText = "Budget") private WebElement budget;
    @FindBy(linkText = "Budget Accounts") private WebElement budgetAccounts;
    @FindBy(xpath = "(//span[text()='Setup'])[6]") private WebElement setupBudget;
    @FindBy(linkText = "Cost Centers") private WebElement costCenters;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setup": myElement = setup;break;
            case "parameters": myElement = parameters;break;
            case "countries": myElement = countries;break;
            case "cities": myElement = cities;break;

            case "education": myElement = education;break;
            case "setupEducation": myElement = setupEducation;break;
            case "subjectCategories": myElement = subjectCategories;break;
            case "subjects": myElement = subjects;break;

            case "humanResources": myElement = humanResources;break;
            case "setupHR": myElement = setupHR;break;
            case "positionSalary": myElement = positionSalary;break;
            case "positions": myElement = positions;break;

            case "salaryTypes": myElement = salaryTypes;break;
            case "salaryModifiers": myElement = salaryModifiers;break;
            case "salaryConstants": myElement = salaryConstants;break;

            case "reports": myElement = reports;break;
            case "setupReports": myElement = setupReports;break;
            case "excelTemplate": myElement = excelTemplate;break;

            case "budget": myElement = budget;break;
            case "budgetAccounts": myElement = budgetAccounts;break;
            case "setupBudget": myElement = setupBudget;break;
            case "costCenters": myElement = costCenters;break;

        }
        clickFunction(myElement);
    }




}
