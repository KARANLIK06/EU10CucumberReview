package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingPage {
    public ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div.app_logo")
    public WebElement title;
}
