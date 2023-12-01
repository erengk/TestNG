package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _25_WishListPOM extends BaseDriver {

    @Test
    @Parameters("item")
    public void addItemToWishList(String itemName){
        _24_WishListElements wishListElements = new _24_WishListElements();
        _21_PlaceOrder plcOrder = new _21_PlaceOrder();

        plcOrder.searchBox.sendKeys(itemName);
        plcOrder.searchButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(wishListElements.addToWishList)).click();
        wait.until(ExpectedConditions.elementToBeClickable(wishListElements.wishListLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(wishListElements.itemLink)).click();

        Assert.assertTrue(wishListElements.itemLink.getText().toLowerCase().contains(itemName));


    }
}
