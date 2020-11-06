package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

import java.util.List;

public class CreateAndDeleteSteps {
    DialogContent dialogContent= new DialogContent();
    LeftNav leftNav = new LeftNav();

    @When("^User click on the element in the leftNav class$")
    public void userClickOnTheElementInTheLeftNavClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);
        for (int i = 0; i < elementsToClick.size(); i++) {
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User delete value$")
    public void userDeleteValue(DataTable values) {
        List<String> valuesList = values.asList(String.class);
        for (int i = 0; i < valuesList.size(); i++) {
            dialogContent.deleteItemFunction(valuesList.get(i));

        }
    }

    @Then("^User should see \"([^\"]*)\" message$")
    public void userShouldSeeMessage(String value)  {
        dialogContent.findElementAndFindVerifyContainsText("success/error",value);

    }
}
