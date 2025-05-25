package part3_4.com.demoqa.tests.part3.elements;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "kierra@example.com";
        String expectedAge = "34";
        var webTablesPage = homePage.goToElementsPage().clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge("34");
        webTablesPage.clickSubmit();
        String actualAge = webTablesPage.getTableAge(email);
        assert actualAge.equals(expectedAge) : "Expected age: " + expectedAge + ", but got: " + actualAge;
    }
}