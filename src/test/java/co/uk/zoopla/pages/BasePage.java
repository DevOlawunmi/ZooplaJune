package co.uk.zoopla.pages;

import co.uk.zoopla.common.Browsers;
import co.uk.zoopla.common.DriverLibrary;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLibrary {

    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;

    public void launchURL()
    {
        driver.navigate().to(BASE_URL);
    }

}
