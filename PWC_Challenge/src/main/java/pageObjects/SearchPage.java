package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);
    }

    public void Click_Element_Xpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((locator))));
        driver.findElement(By.xpath(locator)).click();

    }

    public void validate_Element_Xpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[@id=\"wrapper\"]/section[1]/div/div/span"))));
        assertTrue(driver.findElement(By.xpath(locator)).isDisplayed());

    }
    public void validate_Element_ClassName(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className((locator))));
        assertTrue(driver.findElement(By.className(locator)).isDisplayed());

    }

    public void searchReady(String searchTerm){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[@id=\"wrapper\"]/header/div[1]/div/i[2]"))));
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[1]/div/i[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[@id=\"search-input\"]"))));
        driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(searchTerm);

    }

    public void hitEnter(){

        driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);

    }

}