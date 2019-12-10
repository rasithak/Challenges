package pageObjects;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ContactUsPage {
    WebDriver driver;
    WebDriverWait wait;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 15);

    }

    public void Click_Element_Xpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((locator))));
        driver.findElement(By.xpath(locator)).click();

    }

    public void validate_Element_Xpath(String locator){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((locator))));
        assertTrue(driver.findElement(By.xpath(locator)).isDisplayed());

    }
    public void getText(DataTable table){

        List<List<String>> data;
        data = table.raw();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[@id=\"wrapper\"]/section[2]/div/div[1]/h2"))));
        String firstBox = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[1]/h2")).getText();
        firstBox = firstBox.replace('\r', ' ').replace('\n', ' ');
        String firstLink = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[1]/p[2]/a")).getAttribute("href");

        String SecondBox = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[2]/h2")).getText();
        SecondBox = SecondBox.replace('\r', ' ').replace('\n', ' ');

        String thirdBox = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[3]/h2")).getText();
        thirdBox = thirdBox.replace('\r', ' ').replace('\n', ' ');
        String thirdLink = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[3]/p[2]/a")).getAttribute("href");

        String fourthBox = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[4]/h2")).getText();
        fourthBox = fourthBox.replace('\r', ' ').replace('\n', ' ');
        String fourthLink = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[2]/div/div[4]/p[2]/a")).getAttribute("href");

        Assert.assertEquals(firstBox,data.get(1).get(0));
        Assert.assertEquals(SecondBox,data.get(2).get(0));
        Assert.assertEquals(thirdBox,data.get(3).get(0));
        Assert.assertEquals(fourthBox,data.get(4).get(0));

        Assert.assertEquals(firstLink,data.get(1).get(1));
        Assert.assertEquals(thirdLink,data.get(3).get(1));
        Assert.assertEquals(fourthLink,data.get(4).get(1));


    }

}