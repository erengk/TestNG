package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Ornek extends BaseDriver {

    @Test
    void loginTest(){
        System.out.println("Login Test Başladı");

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("carlosSantana@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();

        WebElement myAccount = driver.findElement(By.cssSelector("div#content > h2"));


        //Assert.assertTrue(myAccount.getText().toLowerCase().contains("account"),"WebElement account kelimesini içermiyor");
        //Assert.assertEquals(driver.getTitle(), "My Account", "Sayfa açılamadı");
        Assert.assertTrue(driver.getCurrentUrl().contains("gokhan"));
        /*
        carlosSantana@gmail.com
        1234
         */
    }

}
