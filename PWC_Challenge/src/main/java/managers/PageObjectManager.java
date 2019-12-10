package managers;



import org.openqa.selenium.WebDriver;

import pageObjects.ContactUsPage;

import pageObjects.SearchPage;

//import pageObjects.ConfirmationPage;

import pageObjects.HomePage;


public class PageObjectManager {

    private WebDriver driver;

    private ContactUsPage contactUsPage;

    private HomePage homePage;

    private SearchPage searchPage;


    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }



    public HomePage getHomePage(){

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }

    public ContactUsPage getContactUsPage() {

        return (contactUsPage == null) ? contactUsPage = new ContactUsPage(driver) : contactUsPage;

    }



    public SearchPage getSearchPage() {

        return (searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;

    }
}