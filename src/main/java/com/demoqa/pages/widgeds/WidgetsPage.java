package com.demoqa.pages.widgeds;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");

public SelectMenuPage clickSelectMenu() {
    scrollToElementJS(selectMenuItem);
    click(selectMenuItem);
    return new SelectMenuPage();
}
}
