package part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;
    Logger logger = LoggerFactory.getLogger(FirstSeleniumTest.class);

    @BeforeClass
    public void setUp() {
        logger.info("Setting up browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        logger.info("Navigated to login page");
    }

    @AfterClass
    public void tearDown() {
        logger.info("Closing browser");
        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() {
        logger.info("Starting test: testLoggingIntoApplication");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form.oxd-form")));
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        logger.info("Entered username");
        var password =  driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        logger.info("Entered password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        logger.info("Clicked login button");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h6")));
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult, expectedResult);
        logger.info("Assertion passed, test successful");
    }
}
