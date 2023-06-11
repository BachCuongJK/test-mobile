package function;

import page.CategoriesScreen;
import page.MilkScreen;

public class MilkScreenFunction {
    CommonFunction commonFunction = new CommonFunction();
    CategoriesScreen categoriesScreen = new CategoriesScreen();
    MilkScreen milkScreen = new MilkScreen();
    public void clickMilkItem(){
        commonFunction.swipe(75,75,373,1357);
        commonFunction.swipeMobileUp(categoriesScreen.milk);
        commonFunction.click(categoriesScreen.milk);
    }
    public void clickFirstProduct (){
        commonFunction.click(categoriesScreen.firstItem);
    }
    public void productDetailsDisplayed(){
        commonFunction.isDisplayed(milkScreen.milkImg);
        commonFunction.isDisplayed(milkScreen.describtion);
        commonFunction.isDisplayed(milkScreen.price);
        commonFunction.isDisplayed(milkScreen.title);
        commonFunction.isDisplayed(milkScreen.addToCart);
    }

}
