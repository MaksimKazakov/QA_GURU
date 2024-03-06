import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestExamle {
    @Test
    public void serchGoogle() {

        Configuration.holdBrowserOpen = true;
        open("https://google.com");


    }
}
