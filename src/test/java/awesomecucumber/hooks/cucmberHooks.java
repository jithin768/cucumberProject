package awesomecucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class cucmberHooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("\n BeforeAll\n");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("\n AfterAll\n");
    }

    @Before (order=1)
    public static void beforeorder1(){
        System.out.println("\n In Before order1\n");
    }

    @Before(order=0)
    public static void beforeorder0(){
        System.out.println("\n In Before order0 Test\n");
    }

    @After(order=1)
    public static void afterorder1(){
        System.out.println("\n In After order1\n");
    }
    @After(order=0)
    public static void afterorder0(){
        System.out.println("\n In After order0\n");
    }
}
