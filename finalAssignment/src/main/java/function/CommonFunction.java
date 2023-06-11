package function;

import core.BaseTest;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;


public class CommonFunction extends BaseTest {
    public void click(By by){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }
    public void tabByElement(By by){
        WebElement element =wait.until(ExpectedConditions.elementToBeClickable(by));
        TouchAction touchAction = new TouchAction<>((PerformsTouchActions) driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }
    public void tabByCoordinates(int x, int y){
        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.tap(PointOption.point(x,y)).perform();
    }
    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction((PerformsTouchActions) driver).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();

    }
    public void isDisplayed(By by){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.isDisplayed();
    }
    public void verify(By by,String string){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        Assert.assertEquals(element.getText(),string);
    }
    public void swipeMobileUp() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 6;
        swipe(startx, starty, startx, endy);

    }
    public void swipeMobileUp(By locator){
        for (int i = 0; i < 4; i++) {
            if(driver.findElements(locator).size() !=0)
                break;
            swipeMobileUp();
        }
    }
    public void rightLeftSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(startx, starty, endx, starty);
    }
    public void sendkeys(By by ,String value){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.clear();
        element.sendKeys(value);
    }

}
