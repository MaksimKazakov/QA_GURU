import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSearch {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = ("https://github.com/");
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        //Configuration.reportsFolder = "test-result/reports";
    }

    @Test
    void gitHubSearchSelenide(){
        open("");
        $("[placeholder='Search or jump to...']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("a[href='/selenide/selenide']").click();
        //$("a[href='/selenide/selenide']").shouldHave(text("selenide"));

        //$("a[href=\"https://github.com/asolntsev\"]").hover();
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("h2").sibling((0)).$$("li").first().hover();

        //setInterval(function () {debugger}, 4000); писать в консоле для заморозки, если не работает F8
        $(".Popover").shouldHave(text("Andrei Solntsev"));
        //Configuration.reportsFolder = "test-result/reports";
        //screenshot("scren_01");
    }
    @AfterAll
    static void afterAll(){

        Configuration.holdBrowserOpen = true;
    }

}
