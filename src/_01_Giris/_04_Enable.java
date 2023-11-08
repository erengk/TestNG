package _01_Giris;

import Utility.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _04_Enable {
    public static WebDriver driver;

    @Test
    void test1(){
        System.out.println("test 1");
    }

    @Test
    void test2(){
        System.out.println("test 2");
    }

    @Test
    void test3(){
        System.out.println("test 3");
    }
    @BeforeClass
    void baslangic(){
        System.out.println("başlangıç işlemi yapılıyor");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        //driver = new ChromeDriver();
        //driver = new SafariDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }

    @AfterClass
    void bitis(){
        System.out.println("bitiş işlemi yapılıyor");

        MyFunctions.Bekle(5);
        driver.quit();
    }
}
