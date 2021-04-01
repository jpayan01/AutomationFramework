package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature {

    //BACKGROUND SETUP
    @Given("^User validates the browser$")
    public void user_validates_browser(){
        System.out.println("User validates browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered(){
        System.out.println("Browser is triggered...");
    }

    @Then("^Check browser is displayed$")
    public void check_browser_isDisplayed(){
        System.out.println("Browser Chrome is now displayed");
    }


    @Given("^User navigates to homepage$")
    public void user_navigates_to_homePage(){

    }

    @When("^User provides \"([^\"]*)\" credentials$")
    public void user_provides_loginInfo_to_homePage(String loginInfo) {
        System.out.println("Login info is: " + loginInfo);

    }

    @Then("^User sees \"([^\"]*)\" on screen$")
    public void user_sees_message_on_screen(String message){
        System.out.println("the login message is " + message);
    }



}
