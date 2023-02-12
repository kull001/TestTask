package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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
    private By hobbies = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label");
    private By picture = By.xpath(".//input[@type='file']");
    private By address = By.xpath(".//textarea[@id='currentAddress']");
    private By state = By.xpath(".//input[@id='react-select-3-input']");
    private By sity = By.xpath(".//input[@id='react-select-4-input']");
    private By submit = By.xpath(".//button[@id='submit']");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterName(String name){
        driver.findElement(firstName).sendKeys(name);
    }
    public void enterLastName(String name){
        driver.findElement(lasttName).sendKeys(name);
    }
    public void enterEmail(String text){
        driver.findElement(email).sendKeys(text);
    }
    public void enterGender(){
        driver.findElement(gender).click();
    }
    public void enterPhone(String text){
        driver.findElement(mobile).sendKeys(text);
    }
    public void enterDate(){
        driver.findElement(dateOfBirth).click();
        driver.findElement(dateOfBirthYearSelect).click();
        driver.findElement(dateOfBirthYear).click();
        driver.findElement(dateOfBirthMonthSelect).click();
        driver.findElement(dateOfBirthMonth).click();
        driver.findElement(dateOfBirthDay).click();
    }
    public void enterSubjects(String text){
        driver.findElement(subjects).sendKeys(text);
    }
    public void enterHobbies(){
        driver.findElement(subjects).sendKeys(Keys.PAGE_DOWN);
        //driver.findElement(hobbies).click();
    }

}
