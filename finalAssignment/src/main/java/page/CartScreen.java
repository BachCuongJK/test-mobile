package page;

import org.openqa.selenium.By;

public class CartScreen {
    public By myCart =By.xpath("//android.view.View[@content-desc=\"Giỏ hàng của bạn\"]");
    public By deleteIcon =By.xpath("//android.view.View[@index=2 and @clickable = \"true\"]");
    public By xButton =By.xpath("//android.widget.Button[@index='1']");
    public By totalPrice = By.xpath("//android.view.View[contains(@content-desc,\"00đ\") and @index=6]");
    public By order =By.xpath("//android.widget.Button[@content-desc=\"ĐẶT HÀNG\"]");
}
