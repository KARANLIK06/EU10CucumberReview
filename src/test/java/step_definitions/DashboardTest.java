package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;

import java.util.ArrayList;
import java.util.List;

public class DashboardTest {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("user should see menu option")
    public void user_should_see_menu_options(List<String> expectedOptions) throws InterruptedException {
        Thread.sleep(3000);
        List<String> actualOptions = new ArrayList<>();
        for (WebElement menu : dashboardPage.options) {
            actualOptions.add(menu.getText());
        }
        Assert.assertEquals(expectedOptions,actualOptions);

    }
}
