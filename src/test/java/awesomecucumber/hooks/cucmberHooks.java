package awesomecucumber.hooks;

import io.cucumber.java.AfterAll;
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
}
