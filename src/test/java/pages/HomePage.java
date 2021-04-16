package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_definitions.Base;

public class HomePage extends Base {
    By search = By.xpath("//input[@type='search']");

    public WebElement getSearch(){
        return driver.findElement(search);
    }
}
