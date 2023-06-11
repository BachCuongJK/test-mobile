package function;

import page.MainScreen;

public class MainScreenFunction {
    CommonFunction commonFunction = new CommonFunction();
    MainScreen mainScreen = new MainScreen();
    public void loginApp(){
        commonFunction.click(mainScreen.choPhep);
        commonFunction.click(mainScreen.countinute);
        commonFunction.click(mainScreen.star);
    }
    public void verifyCoreItems(){
        commonFunction.isDisplayed(mainScreen.categories);
        commonFunction.isDisplayed(mainScreen.notifycation);
        commonFunction.isDisplayed(mainScreen.acc);
        commonFunction.isDisplayed(mainScreen.homeBtn);
        commonFunction.isDisplayed(mainScreen.brand);
        commonFunction.isDisplayed(mainScreen.cartIcon);
    }
    public void clickBrand(){
        commonFunction.click(mainScreen.brand);
    }
    public void clickSearchBox(){
        commonFunction.click(mainScreen.searchBox);
    }
}
