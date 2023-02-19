package demoQa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {
    private WebDriver driver;

    @BeforeEach
    public void beginning() {

        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void validData(){
        MainPage mainPage = new MainPage(driver);
        mainPage.enterName("Test");
        mainPage.enterLastName("Tests");
        mainPage.enterEmail("test@mail.ru");
        mainPage.enterGender();
        mainPage.enterPhone("+79178888888");
        mainPage.enterDate();
        mainPage.enterSubjects("Subject");
        mainPage.enterHobbies();
        mainPage.enterPicture();
        mainPage.enterAddress("Saratov");
        //mainPage.enterState();
    }
}
