package co.uk.zoopla.pages;

import co.uk.zoopla.common.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }
@FindBy (xpath = "//*[@id=\"cookie-consent-form\"]/div/div/div/button[2]")
    private WebElement acceptCookies;
}
