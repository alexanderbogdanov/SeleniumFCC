package com.demoqa.pages;


import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElement;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToFormsPage() {
        scrollToElement(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
