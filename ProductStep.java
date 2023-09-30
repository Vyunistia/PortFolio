package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.ProductPage;
import utils.CommonMethods;

public class ProductStep extends CommonMethods {

    String ProductName;

    String CodeProduct;

    @When("user clicks on products button")
    public void user_clicks_on_products_button() {
       click(ProductPage.productsButton);
    }
    @When("user clicks on Services product")
    public void user_clicks_on_services_product() {
        click(ProductPage.serviceProductButton);
    }
    @When("user enter {int} digit code product")
    public void user_enter_digit_code_product(String int1) {

        sendText("123456",ProductPage.productCodeField);
    }
    @When("user enter product name")
    public void user_enter_product_name() {

        sendText("handbag", ProductPage.productNameField);
    }
    @Then("user click on add new data button")
    public void user_click_on_add_new_data_button() {

        click(ProductPage.addNewDataButton);
    }

    @Then("user click on search button")
    public void user_click_on_search_button() {
        click(ProductPage.searchButton);
    }

    @When("user clicks on product bundle")
    public void user_clicks_on_product_bundle() {
        click((ProductPage.productBundle));
    }

    @When("user enter product bundle name")
    public void user_enter_product_bundle_name() {
        sendText("bags",ProductPage.productBundleName);
    }

    @When("user enter {int} digit code product bundle")
    public void user_enter_digit_code_product_bundle(Integer int1) {
       sendText("123457", ProductPage.productBundleCode);
    }

    @When("user click on search button of product bundle")
    public void user_click_on_search_button_of_product_bundle() {
       click((ProductPage.searchBundleProduct));
    }

    @Then("user click on addNewBundleButton")
    public void user_click_on_add_new_bundle_button() {
        click(ProductPage.addNewBundleButton);
    }

    @Then("user clicks on AddNewBundleItem")
    public void user_clicks_on_add_new_bundle_item() {
        click(ProductPage.addNewBundleItem);
    }



}
