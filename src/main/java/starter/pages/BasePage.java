package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("http://localhost:80/dashboard")
public class BasePage extends PageObject {

    public void initPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}