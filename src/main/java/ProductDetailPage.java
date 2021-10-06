import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {


    By addToCartButtonLocator = By.id("pd_add_to_cart");
    By addToCartBedenLocator = By.xpath("//*[@id=\"option-size\"]/a[1]");
    By addToCartSepetGo = By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a/i");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);

    }

    public void addToCart() {
        click(addToCartBedenLocator);
        click(addToCartButtonLocator);
        click(addToCartSepetGo);

    }
}
