package _01_Giris;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _16_SearchItem extends BaseDriverParameter {
    @Test
    @Parameters("items")
    void searchFunctionality(String item){
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(item);

        WebElement searchButton = driver.findElement(By.cssSelector("span[class='input-group-btn']"));
        searchButton.click();

        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(item));

    }
}
