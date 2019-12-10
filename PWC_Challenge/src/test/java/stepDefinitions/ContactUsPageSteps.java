package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageObjects.ContactUsPage;

public class ContactUsPageSteps {

    TestContext testContext;
    ContactUsPage contactUsPage;

    public ContactUsPageSteps(TestContext context) {
        testContext = context;
        contactUsPage = testContext.getPageObjectManager().getContactUsPage();
            }

    @When("^I select ‘Contact us’ from the hamburger menu Then I am taken to the ‘Contact us’ page$")
    public void iSelectContactUsFromTheHamburgerMenuThenIAmTakenToTheContactUsPage() {
        contactUsPage.Click_Element_Xpath("//*[@id=\"wrapper\"]/header/div[1]/div/i[1]");
        contactUsPage.Click_Element_Xpath("//*[text()='Contact us']");
        contactUsPage.validate_Element_Xpath("//h1[text()='Contact us']");
    }

    @And("^I am presented with the below options for contacts$")
    public void iAmPresentedWithTheBelowOptionsForContacts(DataTable table) {
        contactUsPage.getText(table);
    }

}
