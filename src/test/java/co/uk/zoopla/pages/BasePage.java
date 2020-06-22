package co.uk.zoopla.pages;

import co.uk.zoopla.common.Browsers;
import co.uk.zoopla.common.DriverLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLibrary {

    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;

    public void launchURL()
    {
        driver.navigate().to(BASE_URL);
    }

    public void selectElementByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectElementByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
public void waitForElementToBeDisplayed(WebElement element){
    wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(element));

}
}
