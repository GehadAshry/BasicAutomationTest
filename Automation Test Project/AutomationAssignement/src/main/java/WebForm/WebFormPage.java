package WebForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.stream.Collectors;

public class WebFormPage {
    private WebDriver driver;
    private By Textinput = By.id("my-text-id");
    private By Password = By.name("my-password");
    private By TextArea = By.name("my-textarea");
    private By DropDown = By.name("my-select");
    private By CityList = By.name("my-datalist");
    private By Fileinput = By.name("my-file");
    private By CheckButton = By.id("my-check-2");
    private By RadioButton = By.id("my-radio-2");
    private By ColorPicker = By.name("my-colors");
    private By DatePicker = By.name("my-date");
    private By Range = By.name("my-range");
    private By SubmitButton = By.xpath("/html/body/main/div/form/div/div[2]/button");


    public WebFormPage(WebDriver driver) {
        this.driver = driver;
    }
    //input field
    public void enterText(String text) {
        driver.findElement(Textinput).sendKeys(text);
    }
    //password field
    public void enterPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }
    //text area field
    public void enterTextArea(String text) {
        driver.findElement(TextArea).sendKeys(text);
    }

    //dropdown options
    private Select FindDropDown() {
        return new Select(driver.findElement(DropDown));
    }
    public void selectOption(String option) {
        FindDropDown().selectByVisibleText(option);
    }
    public List<String> getSelectedOption() {
       List<WebElement> SelectedOptions = FindDropDown().getAllSelectedOptions();
       return SelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    //unordered list
   public void selectCity(String city) {
        WebElement cityName = driver.findElement(CityList);
        cityName.sendKeys(city);
        Actions action = new Actions(driver);
        action.moveToElement(cityName).perform();

   }

    //uplode file
    public void selectFile(String file) {
        driver.findElement(Fileinput).sendKeys(file);
    }
    //checkbox button
    public void clickCheck() {
        driver.findElement(CheckButton).click();
    }
    //radio button
    public void clickRadioButton() {
        driver.findElement(RadioButton).click();
    }
    //color picker
    public void clickColorPicker(String color) {
       WebElement colorPicker = driver.findElement(ColorPicker);
        colorPicker.click();
        colorPicker.sendKeys(color);
    }
    //date picker
    public void clickDatePicker(String date) {
        WebElement datePicker = driver.findElement(DatePicker);
        datePicker.click();
        datePicker.sendKeys(date);
    }
    //range
    public void setRange (String value){
        WebElement rangeSlider = driver.findElement(Range);

        int steps = Integer.parseInt(value);

        for (int i =0 ; i<steps; i++){
            rangeSlider.sendKeys(Keys.ARROW_RIGHT);

        }
    }
    //to submit the form and move to the next page
    public FormSubmittedPage ClickSubmit (){
        driver.findElement(SubmitButton).click();
        return new FormSubmittedPage (driver);

    }




}
