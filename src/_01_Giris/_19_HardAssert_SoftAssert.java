package _01_Giris;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _19_HardAssert_SoftAssert {
    @Test
    void hardAssert(){
        String message1 = "Merhaba Dünya1";

        System.out.println("Assert Öncesi");
        Assert.assertEquals("Merhaba", message1, "Tanımlanan ile girilen mesajlar aynı değil");
        System.out.println("Assert Sonrası");
        Assert.assertEquals("Merhabalar", message1, "Tanımlanan ile girilen mesajlar aynı değil");


    }

    @Test
    void softAssert(){
        String message2 = "merhaba dünya2";
        String message3 = "merhaba dünya3";
        String message4 = "merhaba dünya4";

        SoftAssert _softAssert = new SoftAssert();
        _softAssert.assertEquals("merhaba", message2);
        System.out.println("softAssert 1");

        _softAssert.assertEquals("merhaba dünya", message3);
        System.out.println("softAssert 2");

        _softAssert.assertEquals("merhaba dünya4", message4);
        System.out.println("softAssert 4");

        _softAssert.assertEquals("merhaba dünyalar", message4);
        System.out.println("softAssert 3");

        _softAssert.assertAll();
        System.out.println("softAssertAll sonuçları");
    }
}
