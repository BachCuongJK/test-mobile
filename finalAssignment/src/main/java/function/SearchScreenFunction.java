package function;

import core.BaseTest;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.CartScreen;
import page.SearchProductScreen;

import java.util.List;

public class SearchScreenFunction extends BaseTest {
    CommonFunction commonFunction = new CommonFunction();
    SearchProductScreen searchProductScreen = new SearchProductScreen();
    CartScreen cartScreen = new CartScreen();

    public void clickFirstProduct(){
        commonFunction.click(searchProductScreen.firstProduct);
    }
    public void search (String value) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement serch1 = wait.until(ExpectedConditions.presenceOfElementLocated(searchProductScreen.searchProduct));
        actions.sendKeys(serch1,value).perform();
    }
    public void productDetailsDisplayed(){
        commonFunction.isDisplayed(searchProductScreen.img);
        commonFunction.isDisplayed(searchProductScreen.describtion);
        commonFunction.isDisplayed(searchProductScreen.price);
        commonFunction.isDisplayed(searchProductScreen.title);
        commonFunction.isDisplayed(searchProductScreen.addToCart);
    }

    public void addtoCart (){
        commonFunction.click(searchProductScreen.addToCartBuy);
    }
    public void clickPlusButton (){
        for (int i = 0; i < 98; i++) {
            commonFunction.click(searchProductScreen.plusIcon);
        }
    }
    public void verifyAddItemScreen(){
        commonFunction.isDisplayed(searchProductScreen.plusIcon);
        commonFunction.isDisplayed(searchProductScreen.decreaseIcon);
        commonFunction.isDisplayed(searchProductScreen.xIcon);
        commonFunction.isDisplayed(searchProductScreen.productPrice);
        commonFunction.isDisplayed(searchProductScreen.productTitle);
    }
    public void clickToGioHang() throws InterruptedException {;
        commonFunction.click(searchProductScreen.cart);
        commonFunction.tabByCoordinates(999,230);
        Thread.sleep(2000);
        commonFunction.tabByCoordinates(875,118);
    }
    public void verifyItemInCartScreen(){
        commonFunction.isDisplayed(cartScreen.myCart);
        commonFunction.isDisplayed(cartScreen.deleteIcon);
        commonFunction.isDisplayed(cartScreen.order);
        commonFunction.isDisplayed(cartScreen.totalPrice);
        commonFunction.isDisplayed(cartScreen.xButton);
    }
}
