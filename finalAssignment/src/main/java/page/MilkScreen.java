package page;

import org.openqa.selenium.By;

public class MilkScreen {
    public By milkImg = By.xpath("//android.view.View[@index=\"0\" and @clickable=\"true\"]");
    public By title =By.xpath("//android.view.View[contains(@content-desc,\" - \") and @index=1]");
    public By price =By.xpath("//android.widget.Button[@index=2]");
    public By addToCart =By.xpath("//android.view.View[@index=2]");
    public By describtion =By.xpath("//android.view.View[contains(@content-desc,\" - \") and @index=4]");
}
