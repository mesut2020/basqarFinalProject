package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.DialogContent;
import pages.LeftNav;

import java.util.List;

public class _03_EditSteps {

    DialogContent dialogContent= new DialogContent();
    LeftNav leftNav = new LeftNav();

//    @When("^User edit the value$")
//    public void userEditTheValue(DataTable values) {
//        List<List<String>> currentValues = values.asLists(String.class);
//        for (int i = 0; i < currentAndNewValues.size(); i++) {
//            dialogContent.editItemFunction(currentAndNewValues.get(i).get(0), currentAndNewValues.get(i).get(1));
//        }
//    }

    @When("^User edit \"([^\"]*)\"$")
    public void userEdit(String value){
        dialogContent.editItemFunction(value);
    }

    @And("^User fill the \"([^\"]*)\" with \"([^\"]*)\"$")
    public void userFillTheWith(String listName, String value){
        dialogContent.findElementListsAndFill(listName, value);
    }
}
