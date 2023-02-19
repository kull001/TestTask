package drugAndDrop;

import drugAndDror.MainPageDND;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrugAndDropTest {
    private WebDriver driver;

    @BeforeEach
    public void beginning() {

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    public void dndElementTest(){
        MainPageDND mainPageDND = new MainPageDND(driver);
        mainPageDND.enterName();
    }
}
