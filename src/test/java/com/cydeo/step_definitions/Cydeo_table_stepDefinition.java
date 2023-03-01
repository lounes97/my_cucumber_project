package com.cydeo.step_definitions;

import com.cydeo.pages.Cydeo_table_page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Cydeo_table_stepDefinition {

    Cydeo_table_page cydeoPage = new Cydeo_table_page();
    @Given("user is on the cydeo table page")
    public void user_is_on_the_cydeo_table_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enter Test in username box")
    public void user_enter_test_in_username_box() {
        cydeoPage.userNameBox.sendKeys("Test"+Keys.ENTER);
    }
    @And("user enter Tester in password box")
    public void user_enter_tester_in_password_box() {
        cydeoPage.passwordBox.sendKeys("Tester"+Keys.ENTER);
    }
    @Then("user should see URL ends with “orders”")
    public void user_should_see_url_ends_with_orders() {
        BrowserUtils.verifyTitleContains("orders");
    }
}
