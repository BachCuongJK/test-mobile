package page;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class BrandScreen {
    public By searchProduct = AppiumBy.className("android.widget.EditText");
    public By firstProduct = AppiumBy.accessibilityId("Sữa tắm Good Look sữa dê 1.2L - 33114\n" +
            "105,100đ");
    public By addToCart =By.xpath("//android.view.View[@index=2]");
    public By addProduct =By.xpath("//android.widget.Button[@index=4]");
}
