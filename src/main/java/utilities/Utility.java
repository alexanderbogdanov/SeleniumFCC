package utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    // Generate a random number between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    // Generate a random number between 1 and 1000
    public static int generateRandomNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }


}
