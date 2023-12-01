package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _24_WishListElements {
    public _24_WishListElements(){
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "button[data-original-title='Add to Wish List']")
    public WebElement addToWishList;
    @FindBy(id = "wishlist-total")
    public WebElement wishListLink;
    @FindBy(linkText = "Canon EOS 5D")
    public WebElement itemLink;
}
