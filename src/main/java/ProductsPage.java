import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{

    By shippingOptionLocator = By.id("filter-label");
    By productNameLocator = By.className("a_model_item");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(shippingOptionLocator);
    }

    public void scroll(WebDriver driver){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public void selectProduct(int i) {
        getAllProducts().get(i).click();

    }
    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
