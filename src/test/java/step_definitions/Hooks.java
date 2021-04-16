package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void beforeValidation(){
        System.out.println("Running only failed scenario");
    }

    @After
    public void afterValidation() throws InterruptedException {
        System.out.println("Running after all the test");
        Thread.sleep(3000);
        Base.quitDriver();
    }

//    @After("@LoginSuccess")
//    public void afterValidation2(){
//        System.out.println("Running after all the test");
//        Base.getDriver().quit();
//    }
}
