package stepDefinitions;

import com.factory.DriverFactory;
import com.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class OrderPageSteps {
    String title;
    private OrderPage orderPage = new OrderPage(DriverFactory.getDriver());

    @Given("user in on Order Page")
    public void user_in_on_order_page() {
        title = orderPage.getTitle();
        System.out.println("Page Title is: "+ title);
        Assert.assertEquals("Order - My Store", title);
    }

    @Then("searched Item and cart Item are {string}")
    public void searched_item_and_cart_item_are(String searchedItem) throws InterruptedException {
        List<String> value  = orderPage.correctItemCheck();

        System.out.println("Expected cart value: " + searchedItem);
        System.out.println("Actual cart value: " + value.get(0));
        Assert.assertTrue(searchedItem.equals(value.get(0)));
    }

}
