package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class _22_PlaceOrder_POM extends BaseDriver {
    @Test
    public void Test(){
        _21_PlaceOrder element = new _21_PlaceOrder();

        element.searchBox.sendKeys("ipod");
        element.searchButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.shoppingCard)).click();
        element.checkOut.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.checkOut)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.continueButton1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.continueButton2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.continueButton3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.agreeButton)).click();
        element.continueButton4.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.continueButton5)).click();



    }
}
