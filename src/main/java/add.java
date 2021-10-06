import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class add extends BasePage{
    By cartContainerAdd = By.className("oq-up");
    By cartContainerDelete = By.className("cart-square-link");
    By alertTo = By.xpath("//*[@id=\"Cart_ProductDelete_679249018\"]");

    public add(WebDriver driver) {
        super(driver);

    }

    public void addCart(){
        click(cartContainerAdd);
    }
    public void deleteCart(){
        click(cartContainerDelete);
      // click(alertTo);


    }
//    public  void Alert(){
//        click(alertTo);
//
//   }



}
