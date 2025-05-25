package part3_4.com.demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToFormsPage().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButtonSelected();
        assertTrue(isFemaleRadioButtonSelected, "Female radio button should be selected");
    }
}
