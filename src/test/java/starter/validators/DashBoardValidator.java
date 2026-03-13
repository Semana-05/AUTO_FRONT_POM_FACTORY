package starter.validators;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class DashBoardValidator {

    public void assertAllPrioritiesMatch(List<String> displayed, String expected) {
        assertThat(displayed)
                .isNotEmpty()
                .allSatisfy(p -> assertThat(p).isEqualToIgnoringCase(expected));
    }
}