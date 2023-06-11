package page;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class MiloScreen {
    public By nescafe = AppiumBy.accessibilityId("NESCAFE");
    public By milo =AppiumBy.accessibilityId("NESCAFE");
    public By maggie =AppiumBy.accessibilityId("MAGGI");
    public By nestea =AppiumBy.accessibilityId("MAGGI");
    public By milkImg = By.xpath("//android.view.View[@index=\"0\" and @clickable=\"true\"]");
    public By title =By.xpath("//android.view.View[contains(@content-desc,\" - \") and @index=1]");
    public By price =By.xpath("//android.widget.Button[@index=2]");
    public By addToCart =By.xpath("//android.view.View[@index=2]");
    public By promotion =By.xpath("//android.view.View[contains(@content-desc,\" - \") and @index=3]");
}
