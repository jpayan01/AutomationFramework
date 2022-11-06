package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class LoginFeatures_steps {

    public static WebDriver driver;
    HomePage home = new HomePage();
    String dynamicid = "test";

    @Given("^I navigate to \"([^\"]*)\" demo page$")
    public void user_navigates_to_rahul_practice_page(String url) {
        HomePage.getDriver().get(url);
    }

    @When("^I Search for \"([^\"]*)\" in input box")
    public void user_searches_for_country(String value) {
        home.getSelectCountriesInput().sendKeys(value);
    }

    @Then("^I should be able to select \"([^\"]*)\" from the auto suggestion list")
    public void select_country_from_auto_suggest(String country) {
        System.out.println("selecting country" + country);
        home.selectCountryFromAutoSuggestionList(country).click();
    }







//    @Given("^User searches \"([^\"]*)\" in vegetables section$")
//    public void user_searches_for_vegetables(String item) {
//        System.out.println("searching for vegetables");
//        home.getSearch().sendKeys(item);
//
//    }
//
//    @When("User adds item to the cart$")
//    public void user_adds_item_to_cart() {
//        driver.findElement(By.xpath("//button[text() = 'ADD TO CART']")).click();
//    }
//
//    @Then("^User sees \"([^\"]*)\" on screen$")
//    public void user_sees_message_on_screen(String message) {
//        System.out.println("the login message is " + message);
//    }

}
