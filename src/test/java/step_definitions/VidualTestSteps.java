package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ShoppingPage;

import java.util.HashMap;
import java.util.Map;

public class VidualTestSteps {

    ShoppingPage sp = new ShoppingPage();

    @Then("user see below contents")
    public void user_see_below_contents(Map<String, Object> expected) {
        Map<String, Object> actual = new HashMap<>();
        actual.put("title", sp.title.getText());
        actual.put("subTitle", sp.subTitle.getText());
        actual.put("itemSize", sp.items.size());

        Assert.assertEquals(expected.get("title"),actual.get("title"));
        Assert.assertEquals(expected.get("subTitle"),actual.get("subTitle"));
        Assert.assertEquals(expected.get("itemSize"),String.valueOf(actual.get("itemSize")));

    }
}
