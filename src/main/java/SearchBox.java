import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("search_input");
    By searchBoxButton =  By.className("searchButton");

    public SearchBox(WebDriver driver) {
        super(driver);
        driver.findElement(searchBoxLocator).clear();

    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(searchBoxButton);
    }
}
