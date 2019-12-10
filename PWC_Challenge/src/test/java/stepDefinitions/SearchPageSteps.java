package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SearchPage;

public class SearchPageSteps {
    TestContext testContext;
    SearchPage searchPage;

    public SearchPageSteps(TestContext context) {
        testContext = context;
        searchPage = testContext.getPageObjectManager().getSearchPage();
    }

    @When("^I click on the ‘Magnifying glass’ icon to perform a search And I enter the text \"([^\"]*)\"$")
    public void iClickOnTheMagnifyingGlassIconToPerformASearchAndIEnterTheText(String searchTerms)  {

        searchPage.searchReady(searchTerms);


    }

    @And("^I submit the search$")
    public void iSubmitTheSearch() {
        searchPage.hitEnter();
    }

    @Then("^I am taken to the search results page$")
    public void iAmTakenToTheSearchResultsPage() {

        searchPage.validate_Element_Xpath("//*[@id=\"wrapper\"]/section[1]/div/div/span");
    }

    @And("^I am presented with at least 1 search result$")
    public void iAmPresentedWithAtLeastSearchResult() {
        searchPage.validate_Element_Xpath("//*[@id=\"wrapper\"]/section[2]/div/div[1]");
    }


}