package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import starter.pages.DashBoardPageHelper;
import starter.pages.DashBoardPage;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class FilterTicketsSteps {

    DashBoardPage dashBoardPage = new DashBoardPage();
    DashBoardPageHelper dashBoardPageHelper;

    @Given("the operator is in view ticket window")
    public void theOperatorIsInViewTicketWindow() {
        dashBoardPage.initPage(ThucydidesWebDriverSupport.getDriver());
        dashBoardPageHelper = new DashBoardPageHelper(dashBoardPage);
        dashBoardPage.open();
    }

    @When("select priority {string}")
    public void selectPriority(String priority) {
        dashBoardPage.selectPriority(priority);
    }

    @Then("only show tickets from priority {string}")
    public void onlyShowTicketsFromPriority(String priority) {
        List<String> displayed = dashBoardPageHelper.getDisplayedPriorities();
        assertThat(displayed)
                .isNotEmpty()
                .allSatisfy(p -> assertThat(p).isEqualToIgnoringCase(priority));
    }
}