package _01_Giris;

import org.testng.annotations.*;

public class _02_Annotations {

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class çalıştırıldı");
    }

    @Test
    public void Test1(){
        System.out.println("test1 çalıştırıldı");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method çalıştırıldı");

    }

    @Test
    public void Test3(){
        System.out.println("test3 çalıştırıldı");

    }
    @Test
    public void Test2(){
        System.out.println("test2 çalıştırıldı");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method çalıştırıldı");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class çalıştırıldı");

    }
}

/*
@BeforeClasss --> Class ın başında çalışır (class işlemleri öncesinde) driver oluşturma işlemleri
    @BeforeMethod --> Her method öncesinde çalışır
        @Test --> testlerin yazılı olduğu method
    @AfterMethod --> Her method sonrasında çalışır
    @BeforeMethod --> Her method öncesinde çalışır
        @Test --> testlerin yazılı olduğu method
    @AfterMethod --> Her method sonrasında çalışır
    @BeforeMethod --> Her method öncesinde çalışır
        @Test --> testlerin yazılı olduğu method
    @AfterMethod --> Her method sonrasında çalışır
@AfterClass --> Class sonunda çalışır (class işlemleri sonrasında) driver kapatma işlemleri tanımlanır
 */
