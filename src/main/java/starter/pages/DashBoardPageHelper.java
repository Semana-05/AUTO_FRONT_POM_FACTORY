package starter.pages;

import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class DashBoardPageHelper {

    private final DashBoardPage dashBoardPage;

    public DashBoardPageHelper(DashBoardPage dashBoardPage) {
        this.dashBoardPage = dashBoardPage;
    }

    public List<String> getDisplayedPriorities() {
        return dashBoardPage.getTicketPriorityElements()
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .filter(text -> !text.isEmpty())
                .collect(Collectors.toList());
    }
}