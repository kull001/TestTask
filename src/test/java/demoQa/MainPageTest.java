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

        mainPage.enterName("Test")
                .enterLastName("Tests")
                .enterEmail("test@mail.ru")
                .enterGender()
                .enterPhone("+79178888888")
                .enterDate()
                .enterSubjects("Subject")
                .enterHobbies()
                .enterPicture()
                .enterAddress("Saratov");
        //mainPage.enterState();
    }
}
