package function;

import core.BaseTest;
import page.MiloScreen;

public class MiloFunction extends BaseTest {
    CommonFunction commonFunction = new CommonFunction();
    MiloScreen miloScreen = new MiloScreen();
    public void clickMilo() throws InterruptedException {
        commonFunction.swipe(585,72,1036,1036);
        commonFunction.rightLeftSwipe();
        commonFunction.rightLeftSwipe();
        Thread.sleep(2000);
        commonFunction.tabByCoordinates(722,1170);
    }
    public void verifyMiloScreen (){
        commonFunction.isDisplayed(miloScreen.nescafe);
        commonFunction.isDisplayed(miloScreen.maggie);
        commonFunction.isDisplayed(miloScreen.milo);
        commonFunction.isDisplayed(miloScreen.nestea);
    }
    public void clickFirstMiloProduct(){
        commonFunction.tabByCoordinates(100,1083);
    }
    public void verifyProductScreen(){
        commonFunction.isDisplayed(miloScreen.milkImg);
        commonFunction.isDisplayed(miloScreen.title);
        commonFunction.isDisplayed(miloScreen.addToCart);
        commonFunction.isDisplayed(miloScreen.price);
        commonFunction.isDisplayed(miloScreen.promotion);
    }
}
