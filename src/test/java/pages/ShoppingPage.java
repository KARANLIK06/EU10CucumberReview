package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ShoppingPage {
    public ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "div.app_logo")
    public WebElement title;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement subTitle;

    @FindBy(css = "div.inventory_item")
    public List<WebElement> items;
}
