package page;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class MainScreen {
    public By choPhep = By.xpath("//android.widget.Button[@text=\"CHO PHÉP\"]");
    public By star = AppiumBy.accessibilityId("Bắt đầu mua sắm");
    public By countinute = AppiumBy.accessibilityId("Tiếp theo");
    public By homeBtn = By.xpath("//android.widget.ImageView[@content-desc=\"Trang chủ\"]");
    public By categories =By.xpath("//android.view.View[@content-desc=\"Danh mục\" and @index=2]");
    public By brand =By.xpath("//android.view.View[@content-desc=\"Thương hiệu\" and @index=3]");
    public By notifycation = By.xpath("//android.view.View[@content-desc=\"Thông báo\" and @index=4]");
    public By acc =By.xpath("//android.view.View[@content-desc=\"Tài khoản\" and @index=5]");
    public By cartIcon =By.xpath("//android.view.View[@index=2 and @bounds=\"[948,180][1032,264]\"]");
    public By searchBox = AppiumBy.accessibilityId("Xin chào, bạn muốn tìm gì hôm nay?");


}
