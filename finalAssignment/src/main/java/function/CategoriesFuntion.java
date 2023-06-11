package function;

import core.BaseTest;
import page.CategoriesScreen;
import page.MainScreen;

public class CategoriesFuntion extends BaseTest {
    CommonFunction commonFunction = new CommonFunction();
    MainScreen mainScreen = new MainScreen();
    CategoriesScreen categoriesScreen = new CategoriesScreen();
    public void categoriesPage() throws InterruptedException {
        commonFunction.click(mainScreen.categories);
        Thread.sleep(2000);
    }

    public void clickFirstProdutct(){
        commonFunction.click(categoriesScreen.firstItem);
    }
}
