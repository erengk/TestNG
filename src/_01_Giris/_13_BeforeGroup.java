package _01_Giris;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class _13_BeforeGroup {

    @Test(groups = {"SmokeTest"})
    public void Test1(){
        System.out.println("Test1");
    }
    @Test(groups = {"RegressionTest"})
    public void Test2(){
        System.out.println("Test2");
    }
    @Test(groups = {"SmokeTest"})
    public void Test3(){
        System.out.println("Test3");
    }
    @Test(groups = {"RegressionTest"})
    public void Test4(){
        System.out.println("Test4");
    }
    @Test(groups = {"SmokeTest"})
    public void Test5(){
        System.out.println("Test5");
    }
    @AfterGroups(groups = {"RegressionTest"})
    public void Test6(){
        System.out.println("After Group");
    }
    @BeforeGroups
    public void Test7(){
        System.out.println("Before Group");
    }
    @Test
    public void Test8(){
        System.out.println("Test8");
    }
}
