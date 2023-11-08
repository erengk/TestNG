package _01_Giris;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
  3- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
  4- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.
 */
public class _07_Ornek extends BaseDriver {
    By link = By.linkText("Newsletter");

    By subYes = By.xpath("(//input[@name='newsletter'])[1]");

    By subNo = By.xpath("(//input[@name='newsletter'])[2]");

    By continueBtn = By.xpath("//input[@value='Continue']");

    @Test(priority = 1)
    public void subscribeYes(){
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement subscribeYes = driver.findElement(subYes);
        subscribeYes.click();

        WebElement continueButton = driver.findElement(continueBtn);
        continueButton.click();

        MyFunctions.successMessageValidation();
    }

    @Test(priority = 2)
    public void subscribeNo(){
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement subscribeNo = driver.findElement(subNo);
        subscribeNo.click();

        WebElement continueButton = driver.findElement(continueBtn);
        continueButton.click();

        MyFunctions.successMessageValidation();
    }
}
