import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login extends BasePage{

    By admin = By.className("dropdown-toggle");
    By eMail = By.id("LoginEmail");
    By password =  By.id("Password");
    By giris =  By.id("loginLink");

    public login(WebDriver driver) {
        super(driver);
    }

    public void addLogin(){
        click(admin);
        type(eMail,"abdullahacar1107@gmail.com");
        type(password,"acar12345");
        click(giris);
    }
}
