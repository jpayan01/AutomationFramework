package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_definitions.Base;

public class HomePage extends Base {
    By search = By.xpath("//input[@type='search']");
    By selectCountries = By.xpath("//input[@id='autocomplete']");


    public WebElement getSearch(){
        return driver.findElement(search);
    }

    public WebElement getSelectCountriesInput(){
        return driver.findElement(selectCountries);
    }

    public WebElement selectCountryFromAutoSuggestionList(String country){
        return driver.findElement(By.xpath("//li/div[text()=\""+country+"\"]"));
    }
}
