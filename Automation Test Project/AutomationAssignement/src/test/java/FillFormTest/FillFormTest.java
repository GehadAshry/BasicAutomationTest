package FillFormTest;

import BaseTest.SetUpTest;
import WebForm.FormSubmittedPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FillFormTest extends SetUpTest {

    @Test
    public void FormTest() {

        webFormPage.enterText("Your name");
        webFormPage.enterPassword("Password");
        webFormPage.enterTextArea("I'm gonna be an SDET");
        webFormPage.selectOption("One");
        webFormPage.selectCity("Seattle");
        webFormPage.selectFile("C:\\Users\\gehad\\IdeaProjects\\AutomationAssignement\\src\\main\\resources\\cat.jpg");
        webFormPage.clickCheck();
        webFormPage.clickRadioButton();
        webFormPage.clickColorPicker("#EFC3CA");
        webFormPage.clickDatePicker("08-01-1998");
        webFormPage.setRange("4");
        FormSubmittedPage formSubmittedPage = webFormPage.ClickSubmit();


        Assert.assertEquals(formSubmittedPage.getHeaderText(),"Form submitted");
        Assert.assertEquals(formSubmittedPage.getMsgText(),"Received!");


    }
}
