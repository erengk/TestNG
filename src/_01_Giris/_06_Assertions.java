package _01_Giris;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_Assertions {

    @Test
    void equalsExample(){
        String s1 = "Merhaba";
        String s2 = "Merhaba1";
        String s3 = "Merhaba";

        //Assert.assertEquals(s1,s2, "eşitlik sağlanamadı");
        Assert.assertEquals(s1,s3, "eşitlik sağlanamadı");
    }

    @Test
    void notEqualsExample(){
        int x = 10;
        int y = 12;

        Assert.assertNotEquals(x,y, "bu sayılar eşit");
    }

    @Test
    void trueExample(){
        double a = 10.2;
        double b = 10.2;

        Assert.assertTrue(a == b, "Sayılar eşit değil");
    }

    @Test
    void nullExample(){
        String s1 = null;
        s1 = "selam";
        //Assert.assertNull(s1,"s1 ifadesi null değildir");
        Assert.assertNotNull(s1);
    }

    @Test
    void direktFailExample(){
        int a = 50;

        if (a == 50){
            Assert.fail();
        }
    }
}
