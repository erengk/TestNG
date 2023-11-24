package _01_Giris;

import Utility.BaseDriver;
import Utility.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
       Senaryo;
       1- Siteyi açınız. https://opencart.abstracta.us/index.php?route=account/login
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En sondan 2. adresi siliniz.
 */
public class _09_AddressFunctionality extends BaseDriver {
    @Test
    void addAddress(){
        Assert.fail();
        WebElement addressBookLink = driver.findElement(By.linkText("Address Book"));
        addressBookLink.click();

        WebElement newAddressLink = driver.findElement(By.linkText("New Address"));
        newAddressLink.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("gokhan");

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("eren");

        WebElement address1 = driver.findElement(By.id("input-address-1"));
        address1.sendKeys("Ankara-Çankaya");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Ankara");

        WebElement postCode = driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("06100");



        WebElement country = driver.findElement(By.id("input-country"));
        //wait.until(ExpectedConditions.elementToBeClickable(country));

        Select select = new Select(country);
        wait.until(ExpectedConditions.elementToBeClickable(country));
        country.click();
        country.click();
        select.selectByIndex(10);
        //select.selectByValue("3518");
        //select.selectByVisibleText("Turkey");




        WebElement zone = driver.findElement(By.id("input-zone"));
        //wait.until(ExpectedConditions.stalenessOf(zone));
        zone.click();
        zone.click();
        Select select1 = new Select(zone);
        select1.selectByIndex(3);

        WebElement defaultAddress = driver.findElement(By.xpath("(//input[@name='default'])[1]"));
        defaultAddress.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        MyFunctions.successMessageValidation();
    }

    @Test(dependsOnMethods = {"addAddress"}, alwaysRun = true)
    void deleteAddress(){
        WebElement addressBookLink = driver.findElement(By.linkText("Address Book"));
        addressBookLink.click();

        WebElement deleteLink = driver.findElement(By.xpath("(//a[text()='Delete'])[1]"));
        deleteLink.click();

        MyFunctions.successMessageValidation();
    }
}
