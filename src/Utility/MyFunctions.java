package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyFunctions {
    public static void Bekle(int s) {
        try {
            Thread.sleep(1000*s);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void successMessageValidation(){
        WebElement message = BaseDriver.driver.findElement(By.xpath("//div[contains(@class, 'alert')]"));
        Assert.assertTrue(message.getText().toLowerCase().contains("success"));
    }
}
