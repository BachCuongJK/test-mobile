package stepDefination;

import core.BaseTest;
import function.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.CategoriesScreen;

import java.net.MalformedURLException;

public class BigC extends BaseTest {
    BaseTest baseTest = new BaseTest();
    MainScreenFunction mainScreenFunction = new MainScreenFunction();
    CategoriesFuntion categoriesFuntion = new CategoriesFuntion();
    MilkScreenFunction milkScreenFunction = new MilkScreenFunction();
    MiloFunction miloFunction = new MiloFunction();
    SearchScreenFunction searchScreenFunction = new SearchScreenFunction();
    @Given("user clicks next and star shopping")
    public void user_clicks_next_and_star_shopping() throws MalformedURLException {
        // Write code here that turns the phrase above into concrete actions
        baseTest.setup();
        mainScreenFunction.loginApp();
    }
    @Then("verify menu items and cart should be displayed")
    public void verify_menu_items_and_cart_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        mainScreenFunction.verifyCoreItems();
    }
    @Given("access to Categories Screen")
    public void access_to_categories_screen() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        categoriesFuntion.categoriesPage();
    }
    @Given("Click to milk")
    public void click_to_milk() {
        // Write code here that turns the phrase above into concrete actions
        milkScreenFunction.clickMilkItem();
    }
    @Given("Click frist Item")
    public void click_frist_item() {
        // Write code here that turns the phrase above into concrete actions
        milkScreenFunction.clickFirstProduct();
    }
    @Then("verify add to cart ,img, title, price, details should be displayed")
    public void verify_add_to_cart_img_title_price_details_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        milkScreenFunction.productDetailsDisplayed();
    }
    @Given("access to Brand Screen")
    public void access_to_brand_screen() {
        // Write code here that turns the phrase above into concrete actions
        mainScreenFunction.clickBrand();
    }
    @Given("Click to Milo")
    public void click_to_milo() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        miloFunction.clickMilo();
    }
    @Given("verify Nescafe, Milo, Maggi, Nestea should be displayed")
    public void verify_nescafe_milo_maggi_nestea_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        miloFunction.verifyMiloScreen();
    }
    @Then("Click Milo")
    public void click_milo() {
        // Write code here that turns the phrase above into concrete actions
        miloFunction.clickFirstMiloProduct();
    }
    @Then("verify add to cart ,img, title, price, promotion should be displayed")
    public void verify_add_to_cart_img_title_price_promotion_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        miloFunction.verifyProductScreen();
    }
    @Given("click search box in main screen")
    public void click_search_box_in_main_screen() {
        // Write code here that turns the phrase above into concrete actions
        mainScreenFunction.clickSearchBox();
    }
    @Given("Input {string} to search box click Enter")
    public void input_to_search_box_click_enter(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        WebElement search = driver.findElement(By.className("android.widget.EditText"));
//        Actions actions = new Actions(driver);
//
//        actions.sendKeys(search,"sua").perform();
        searchScreenFunction.search("sua");
    }
    @Given("Click to frist product")
    public void click_to_frist_product() {
        // Write code here that turns the phrase above into concrete actions
       searchScreenFunction.clickFirstProduct();
    }
    @Then("add to cart")
    public void add_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        searchScreenFunction.addtoCart();
        searchScreenFunction.clickPlusButton();
    }
    @Then("verify some Item should be displayed")
    public void verify_some_item_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions

        searchScreenFunction.verifyAddItemScreen();
    }
    @Given("click to {string}")
    public void click_to(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        searchScreenFunction.clickToGioHang();
    }
    @Then("verify items in {string}")
    public void verify_items_in(String string) {
        // Write code here that turns the phrase above into concrete actions
        searchScreenFunction.verifyItemInCartScreen();
    }
}
