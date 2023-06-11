package page;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class SearchProductScreen {
    public By searchProduct = By.xpath("//android.widget.EditText[@text=\"Nhập tên sản phẩm\"]");
    public By firstProduct =By.xpath("//android.view.View[@content-desc=\"Bánh Misura sua chua 166.5g - 08025\n" +
            "53,500đ\"]");
    public By img = By.xpath("//android.view.View[@index=\"0\" and @clickable=\"true\"]");
    public By title =By.xpath("//android.view.View[contains(@content-desc,\" - \") and @index=1]");
    public By price =By.xpath("//android.widget.Button[@index=2]");
    public By addToCart =By.xpath("//android.view.View[@index=2]");
    public By describtion =By.xpath("//android.view.View[contains(@content-desc,\" - \") and @index=4]");
    public By addToCartBuy =By.xpath("//android.view.View[@index=2]");
    public By plusIcon =By.xpath("//android.widget.Button[@index=4]");
    public By decreaseIcon =By.xpath("//android.widget.Button[@index=2]");
    public By productTitle =By.xpath("//android.view.View[@content-desc=\"Bánh Misura sua chua 166.5g - 08025\"]");
    public By productPrice =By.xpath("//android.view.View[@content-desc=\"53,500đ\"]");
    public By xIcon  = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]");
    public By cart =By.xpath("//android.widget.Button[@index=5]");

}
