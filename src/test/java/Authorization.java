import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authorization {
    private WebDriver driver;
    private WebDriverWait wait;
    private ChromeOptions options;

    @Before
    public void start(){
        options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void Test(){
        driver.get("https://localhost/litecart/admin/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

    }
    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
