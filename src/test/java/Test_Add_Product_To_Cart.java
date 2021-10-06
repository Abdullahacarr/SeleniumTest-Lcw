import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    login login;
    add add;

    @Test
    @Order(1)
    public void login(){
        login =new login(driver);
        login.addLogin();

    }
    @Test
    @Order(2)
    public void search_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("pantalon");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");

    }
    @Test
    @Order(3)
    public void select_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.scroll(driver);
        productsPage.selectProduct(3);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");

    }



    @Test
    @Order(4)
    public void add(){
        productDetailPage.addToCart();
//        Assertions.assertTrue(homePage.isProductCountUp(),
//                "Product count did not increase");

    }
    @Test
    @Order(5)
    public void addCart() {
        add = new add(driver);
        add.addCart();
        add.deleteCart();

    }

//    @Test
//    @Order(6)
//    public void deleteCart() {
//        add = new add(driver);
//        add.Alert();
//    }
//
}
