package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_step_definitions extends Base {

    @Given("^User navigates to Green cart landing page$")
    public void user_navigates_to_greenCart_page(){
        Base.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

}
