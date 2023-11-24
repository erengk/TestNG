package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _15_ContactParameter extends BaseDriver {
    @Test
    @Parameters("text")
    public void contactUsMessage(String mesaj){
        WebElement link = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        link.click();
        WebElement textArea = driver.findElement(By.id("input-enquiry"));
        textArea.click();
        textArea.sendKeys(mesaj);

        WebElement submitButton = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("success"));
    }
}
