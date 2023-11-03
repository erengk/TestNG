package _01_Giris;

import org.testng.annotations.Test;

public class _01_Giris {
    /*
    public static void main(String[] args) {
        sewSitesiniAc();
        loginIslemleriniYap();
        driveriKapat();
    }

    @Test //JUnit
    public void Test1(){
        sewSitesiniAc();
        loginIslemleriniYap();
        driveriKapat();
    }
     */

    @Test(priority = 1)
    public void webSitesiniAc(){
        System.out.println("driver tanımladı ve web sitesi açıldı");
    }

    @Test(priority = 2)
    public void loginIsleminiYap(){
        System.out.println("Login Test işlemleri gerçekleştirildi");
    }

    @Test(priority = 2)
    public void aloginIsleminiYap2(){
        System.out.println("Login 2 Test işlemleri gerçekleştirildi");
    }

    @Test(priority = 3)
    public void driveriKapat(){
        System.out.println("driver kapatıldı");
    }
}
