package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _14_ContactUs extends BaseDriver {
    @Test
    public void contactUsMessage(){
        WebElement link = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        link.click();
        WebElement textArea = driver.findElement(By.id("input-enquiry"));
        textArea.click();
        textArea.sendKeys("Merhaba bu bir test mesajıdır");

        WebElement submitButton = driver.findElement(By.cssSelector("input[value='Submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("success"));
    }
}
