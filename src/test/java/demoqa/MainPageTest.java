package demoqa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageTest {
    private WebDriver driver;

    @BeforeEach
    public void beginning() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void ValidData(){
        MainPage mainPage = new MainPage(driver);
        mainPage.enterName("Test");
        mainPage.enterLastName("Tests");
        mainPage.enterEmail("test@mail.ru");
        mainPage.enterGender();
        mainPage.enterPhone("+79178888888");
        mainPage.enterDate();
        mainPage.enterSubjects("Subject");
        mainPage.enterHobbies();
    }
}
