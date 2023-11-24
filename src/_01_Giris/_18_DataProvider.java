package _01_Giris;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _18_DataProvider {
    @Test(dataProvider = "messageList")
    public void dataTest(String message){
        System.out.println("message = " + message);
    }

    @DataProvider
    Object[] messageList(){
        Object[] myList = {"macbook", "samsung", "iphone", "tablet"};

        return myList;
    }

    @Test(dataProvider = "sayilar")
    public void dataTest2(int sayi){
        System.out.println("sayi = " + sayi);
    }

    @DataProvider(name = "sayilar")
    Object[] getData(){
        Object[] data = {1,2,3,4,5,6,7,8,9,10};

        return data;
    }
}
