package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
public class _20_PlaceOrder extends BaseDriver {
    @Test
    public void Test1() {
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod");

        WebElement searchButton = driver.findElement(By.cssSelector("span.input-group-btn"));
        searchButton.click();

        WebElement shoppingCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Add to Cart'])[1]")));
        shoppingCard.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();
        WebElement continueButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continueButton1.click();
        WebElement continueButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continueButton2.click();
        WebElement continueButton3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continueButton3.click();
        WebElement agreeButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("agree")));
        agreeButton.click();
        WebElement continueButton4 = driver.findElement(By.id("button-payment-method"));
        continueButton4.click();
        WebElement continueButton5 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-confirm")));
        continueButton5.click();

        WebElement content = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
        String urlAddress = driver.getCurrentUrl();
        Assert.assertTrue(urlAddress.toLowerCase().contains("success"));

    }
}