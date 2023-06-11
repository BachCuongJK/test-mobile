package page;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class CategoriesScreen {
    public By milk = By.xpath("//android.widget.ImageView[@content-desc=\"Sữa tươi\"]");
    public By firstItem = AppiumBy.accessibilityId("Sữa Vinamilk 100% không đường 1L - 76390\n" +
            "35,000đ\n" +
            " ");
}
