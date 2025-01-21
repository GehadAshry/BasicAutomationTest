package BaseTest;

import WebForm.WebFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUpTest {
    private WebDriver driver;
    protected WebFormPage webFormPage;

    @BeforeClass
    public void StartUpTest(){
        driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        webFormPage = new WebFormPage(driver);
    }

    @AfterClass
    public void EndTest(){
        driver.quit();
    }


}
