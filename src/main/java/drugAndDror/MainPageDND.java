package drugAndDror;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPageDND {

    private WebDriver driver;

    WebElement element1 = driver.findElement(By.xpath(".//div[@id=\"column-a\"]"));
    WebElement element2 = driver.findElement(By.xpath(".//div[@id=\"column-b\"]"));


    //private By blockA = By.xpath(".//div[@id=\"column-a\"]");
    //private By blockB = By.xpath(".//div[@id=\"column-b\"]");

    public MainPageDND(WebDriver driver){
        this.driver = driver;
    }



    public void enterName(){
        System.out.println("111");
//        new Actions(driver)
//                .dragAndDrop(element1, element2)
//                .perform();
    }
}
