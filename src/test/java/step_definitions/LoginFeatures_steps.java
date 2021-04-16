package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class LoginFeatures_steps {

    public static WebDriver driver;
    HomePage home = new HomePage();

    //BACKGROUND SETUP
    @Given("^User validates the browser$")
    public void user_validates_browser(){
        System.out.println("Starting the browser...");
        driver = Base.getDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered(){
        System.out.println("Browser is triggered... in the background setup");
    }

    @Then("^Check browser is displayed$")
    public void check_browser_isDisplayed(){
        System.out.println("Browser Chrome is now displayed... in the background setup");
    }

    @Given("^User navigates to Green cart landing page$")
    public void user_navigates_to_greenCart_page(){
        Base.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User searches \"([^\"]*)\" in vegetables section$")
    public void user_searches_for_vegetables(String item) {
        System.out.println("searching for vegetables");
        home.getSearch().sendKeys(item);

    }

    @Then("^User sees \"([^\"]*)\" on screen$")
    public void user_sees_message_on_screen(String message){
        System.out.println("the login message is " + message);
    }



}
