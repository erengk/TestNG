package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {
    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("driverType")
    public void baslangicIslemleri(String driverType){
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        switch (driverType.toLowerCase()){
            case "firefox": driver = new FirefoxDriver();
            break;
            case "safari": driver = new SafariDriver();
            break;
            case "edge": driver = new EdgeDriver();
            break;
            default: driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        login();
    }
    void login(){
        System.out.println("Login Test Başladı");

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("carlosSantana@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();

        Assert.assertEquals(driver.getTitle(), "My Account", "Sayfa açılamadı");
    }
    @AfterClass
    public void bitisIslemleri(){
        System.out.println("bitiş işlemi yapılıyor");

        MyFunctions.Bekle(5);
        driver.quit();
    }
}
