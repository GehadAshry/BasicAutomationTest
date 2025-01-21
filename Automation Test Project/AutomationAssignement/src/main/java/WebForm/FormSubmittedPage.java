package WebForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormSubmittedPage {
    private WebDriver driver;
    private By Header = By.tagName("h1");
    private By Msg = By.id("message");

    public FormSubmittedPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getHeaderText() {
        return driver.findElement(Header).getText();
    }
    public String getMsgText() {
        return driver.findElement(Msg).getText();
    }


}
