package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^I navigate to the PwC Digital Pulse website$")
    public void iNavigateToThePwCDigitalPulseWebsite() {
        homePage.navigateTo_HomePage();
    }

    @When("^I am viewing the ‘Home’ page$")
    public void iAmViewingTheHomePage() {
            homePage.validate_Element_ById("banners");
    }

    @Then("^I am presented with a carousel displaying 3 featured articles$")
    public void iAmPresentedWithACarouselDisplayingFeaturedArticles() {
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[2]/div[1]/a[1]");
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[2]/div[2]/a[1]");
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[2]/div[3]/a[1]");
    }

    @And("^Clicking the ‘Next’ button on the carousel will load the next 3 featured articles$")
    public void clickingTheNextButtonOnTheCarouselWillLoadTheNextFeaturedArticles() {

        homePage.Click_Element_ClassName("flex-next");

        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[3]/div[1]/a[1]");
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[3]/div[2]/a[1]");
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[3]/div[3]/a[1]");

    }

    @And("^Clicking the ‘Previous’ button on the carousel will load the previous 3 featured articles$")
    public void clickingThePreviousButtonOnTheCarouselWillLoadThePreviousFeaturedArticles() {
        homePage.Click_Element_ClassName("flex-prev");

        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[2]/div[1]/a[1]");
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[2]/div[2]/a[1]");
        homePage.validate_Element_Xpath("//*[@id=\"banners\"]/div[2]/ul/li[2]/div[3]/a[1]");
    }

}