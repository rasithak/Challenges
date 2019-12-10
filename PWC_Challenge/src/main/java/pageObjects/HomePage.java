package pageObjects;

import managers.FileReaderManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);
    }

    public void validate_Element_ById(String locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id((locator))));
        assertTrue(driver.findElement(By.id(locator)).isDisplayed());

    }

    public void validate_Element_Xpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((locator))));
        assertTrue(driver.findElement(By.xpath(locator)).isDisplayed());

    }

    public void validate_Element_ClassName(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className((locator))));
        assertTrue(driver.findElement(By.className(locator)).isDisplayed());

    }

    public void navigateTo_HomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void Click_Element_ById(String locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id((locator))));
        driver.findElement(By.id(locator)).click();

    }

    public void Click_Element_Xpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((locator))));
        driver.findElement(By.xpath(locator)).click();

    }

    public void Click_Element_ClassName(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className((locator))));
        driver.findElement(By.className(locator)).click();

    }

}