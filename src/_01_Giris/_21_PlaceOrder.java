package _01_Giris;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _21_PlaceOrder {
    public _21_PlaceOrder(){
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;
    @FindBy(css = "span.input-group-btn")
    public WebElement searchButton;
    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    public WebElement shoppingCard;
    @FindBy(linkText = "Checkout")
    public WebElement checkOut;
    @FindBy(id = "button-payment-address")
    public WebElement continueButton1;
    @FindBy(id = "button-shipping-address")
    public WebElement continueButton2;
    @FindBy(id = "button-shipping-method")
    public WebElement continueButton3;
    @FindBy(name = "agree")
    public WebElement agreeButton;
    @FindBy(id = "button-payment-method")
    public WebElement continueButton4;
    @FindBy(id = "button-confirm")
    public WebElement continueButton5;


}
