package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class ProductsTests extends BaseTest {

    @Test
    public void testProductsHeaderIsDesplayed() {
        ProductsPage productsPage =
                loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "Products header is not displayed");
    }
}
