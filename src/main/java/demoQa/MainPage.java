package demoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class MainPage {
    private WebDriver driver;

    private By firstName = By.xpath(".//input[@id=\"firstName\"]");
    private By lasttName = By.xpath(".//input[@id=\"lastName\"]");
    private By email = By.xpath(".//input[@id=\"userEmail\"]");
    private By gender = By.xpath(".//label[@for=\"gender-radio-1\"]");
    private By mobile = By.xpath(".//input[@placeholder=\"Mobile Number\"]");
    private By dateOfBirth = By.xpath(".//input[@id=\"dateOfBirthInput\"]");
    private By dateOfBirthYearSelect = By.xpath(".//select[@class=\"react-datepicker__year-select\"]");
    private By dateOfBirthYear = By.xpath(".//select[@class=\"react-datepicker__year-select\"]/option[@value=\"1990\"]");
    private By dateOfBirthMonthSelect = By.xpath(".//select[@class=\"react-datepicker__month-select\"]");
    private By dateOfBirthMonth = By.xpath(".//select[@class=\"react-datepicker__month-select\"]/option[@value=\"6\"]");
    private By dateOfBirthDay = By.xpath(".//div[@aria-label=\"Choose Wednesday, July 11th, 1990\"]");
    private By subjects = By.xpath(".//input[@id=\"subjectsInput\"]");
    private By hobbies = By.id("hobbies-checkbox-2");
    private By picture = By.xpath(".//input[@type='file']");
    private By address = By.xpath(".//textarea[@id='currentAddress']");
    private By state = By.xpath(".//input[@id='react-select-3-input']");
    private By state1 = By.xpath(".//div[text()=\"Select State\"]");//.//div[text()="Select State"]
    private By sity = By.xpath(".//input[@id='react-select-4-input']");
    private By submit = By.xpath(".//button[@id='submit']");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public MainPage enterName(String name){
        driver.findElement(firstName).sendKeys(name);
        return this;
    }
    public MainPage enterLastName(String name){
        driver.findElement(lasttName).sendKeys(name);
        return this;
    }
    public MainPage enterEmail(String text){
        driver.findElement(email).sendKeys(text);
        return this;
    }
    public MainPage enterGender(){
        driver.findElement(gender).click();
        return this;
    }
    public MainPage enterPhone(String text){
        driver.findElement(mobile).sendKeys(text);
        return this;
    }
    public MainPage enterDate(){
        driver.findElement(dateOfBirth).click();
        driver.findElement(dateOfBirthYearSelect).click();
        driver.findElement(dateOfBirthYear).click();
        driver.findElement(dateOfBirthMonthSelect).click();
        driver.findElement(dateOfBirthMonth).click();
        driver.findElement(dateOfBirthDay).click();
        return this;
    }
    public MainPage enterSubjects(String text){
        driver.findElement(subjects).sendKeys(text);
        return this;
    }
    public MainPage enterHobbies(){
        WebElement element = driver.findElement(hobbies);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.click();
        actions.build().perform();
        return this;
    }

    public MainPage enterPicture(){
        String path = "src/main/resources/pic.jpg";
        File file = new File(new File(path).getAbsolutePath());
        driver.findElement(picture).sendKeys(file.getAbsolutePath());
        return this;
    }
    public MainPage enterAddress(String text){
        driver.findElement(address).sendKeys(text);
        return this;
    }

    public MainPage enterState(){
        driver.findElement(state1).click();
        driver.findElement(state).click();
        return this;
    }


}
