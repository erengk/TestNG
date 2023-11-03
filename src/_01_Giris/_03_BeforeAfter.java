package _01_Giris;

import Utility.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _03_BeforeAfter {
    @Test(priority = 1)
    void Test1(){
        System.out.println("Test 1");
    }

    @Test(enabled = false)
    void Test2(){
        System.out.println("Test 2");
    }

    @Test(priority = 2)
    void Test3(){
        System.out.println("Test 3");
    }
    public static WebDriver driver;

    @BeforeClass
    void baslangicIslemleri(){
        System.out.println("başlangıç işlemleri yapıldı");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }

    @AfterClass
    void bitisIslemleri(){
        System.out.println("bitiş işlemleri yapıldı");
        MyFunctions.Bekle(3);
        driver.quit();
    }
}
