package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _23_WishList extends BaseDriver {
    @Test
    @Parameters("item")
    public void addItemToWishList(String itemName){
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(itemName);

        WebElement searchButton = driver.findElement(By.cssSelector("span.input-group-btn"));
        searchButton.click();

        WebElement addToWishList = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-original-title='Add to Wish List']")));
        addToWishList.click();

        WebElement wishListLink = wait.until(ExpectedConditions.elementToBeClickable(By.id("wishlist-total")));
        wishListLink.click();

        WebElement itemLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Canon EOS 5D")));

        Assert.assertTrue(itemLink.getText().toLowerCase().contains(itemName));
    }
}
