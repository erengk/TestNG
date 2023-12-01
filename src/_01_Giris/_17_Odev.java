package _01_Giris;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/*
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun lerde (bütün ürünlerde indirim var mı, eski fiyat yeni fiyat var mı)
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
   5- Yukarıdaki işlemi 2 farklı browserda ve paralel şekilde test ediniz.
*/

public class _17_Odev extends BaseDriverParameter {

    @Test
    public void test1(){
        WebElement specials = driver.findElement(By.linkText("Specials"));
        specials.click();

        List<WebElement> newPrice = driver.findElements(By.cssSelector("span.price-new"));
        List<WebElement> oldPrice = driver.findElements(By.cssSelector("span.price-old"));

        Assert.assertTrue(newPrice.size() == oldPrice.size(), "İndirim yapılmamış");

        for (int i = 0; i < newPrice.size(); i++) {
            double newPricei = Double.parseDouble(newPrice.get(i).getText().replaceAll("[^0-9.,]", ""));
            double oldPricei = Double.parseDouble(oldPrice.get(i).getText().replaceAll("[^0-9.,]", ""));

            System.out.println(newPricei + " " + oldPricei);
            Assert.assertTrue(newPricei < oldPricei, "Yeni fiyat indirim uygulanmamış");
        }
    }
}
