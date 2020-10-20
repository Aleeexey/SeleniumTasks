import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;



public class FirstTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void Test(){
        driver.get("https://yandex.ru");
        driver.findElement(By.xpath("//input[@class='input__control input__input mini-suggest__input']")).sendKeys("Priviet, rebzya");
        driver.findElement(By.xpath("//div[@class='search2__button']")).click();
    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
