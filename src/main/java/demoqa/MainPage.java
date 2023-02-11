package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    private By firstName = By.xpath(".//input[@id=\"firstName\"]");
    private By lasttName = By.xpath(".//input[@id=\"lastName\"]");
    private By email = By.xpath(".//input[@id=\"userEmail\"]");
    private By gender = By.xpath(".//label[@for=\"gender-radio-1\"]");
    private By mobile = By.xpath(".//input[@placeholder=\"Mobile Number\"]");
    private By dateOfBirth = By.xpath(".//input[@id=\"dateOfBirthInput\"]");
    private By subjects = By.xpath(".//div[@class=\"subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3\"]");
}
