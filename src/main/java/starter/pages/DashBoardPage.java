package starter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DashBoardPage extends BasePage {

    @FindBy(id = "filter-priority")
    private WebElement prioritySelect;

    @FindBy(css = "td:nth-child(5) span")
    private List<WebElement> ticketPriorityLabels;

    public void selectPriority(String priority) {
        waitFor(prioritySelect).waitUntilClickable();
        new Select(prioritySelect).selectByValue(priority);
    }

    public List<WebElement> getTicketPriorityElements() {
        waitForRenderedElementsToBePresent(
            org.openqa.selenium.By.cssSelector("td:nth-child(5) span")
        );
        return ticketPriorityLabels;
    }
}