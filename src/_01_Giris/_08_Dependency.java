package _01_Giris;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _08_Dependency {

    @Test
    void startCar() {
        System.out.println("Araba çalıştırıldı");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driverCar() {
        //Assert.fail();
        System.out.println("sürüş başladı");
    }

    @Test(dependsOnMethods = {"startCar", "driverCar"})
    void parkCar() {
        System.out.println("park tamamlandı");

    }
    @Test(dependsOnMethods = {"startCar", "driverCar", "parkCar"})
    void controlCarArround() {
        System.out.println("etrafı kontrol etti");

    }
    @Test(dependsOnMethods = {"startCar", "driverCar"})
    void parkCar2() {
        System.out.println("park tamamlandı");

    }
    @Test(dependsOnMethods = {"startCar", "driverCar", "parkCar"})
    void controlCarArround2() {
        System.out.println("etrafı kontrol etti");

    }
    @Test(dependsOnMethods = {"startCar", "driverCar"})
    void parkCar3() {
        System.out.println("park tamamlandı");

    }
    @Test(dependsOnMethods = {"startCar", "driverCar", "parkCar"})
    void controlCarArround3() {
        System.out.println("etrafı kontrol etti");

    }
    @Test(dependsOnMethods = {"startCar", "driverCar", "parkCar", "controlCarArround", "controlCarArround2", "parkCar2", "controlCarArround3", "parkCar3"} ,alwaysRun = true)
    void stopCar() {
        System.out.println("kontakt kapatıldı");

    }
}
