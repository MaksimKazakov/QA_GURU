import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeWork_03 {
    //https://demoqa.com/automation-practice-form
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.browserPosition = "0x0";
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");

    }

    @Test
    void PracticeForm() {

        $("#firstName").setValue("Maxim");
        $("#lastName").setValue("Kazakov");
        $("#userEmail").setValue("info@kazakovms.ru");
        $("#gender-radio-2").parent().click();
        $("#userNumber").setValue("79000265003");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1980");
        $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Intro");
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src\\test\\resources\\1.jpg"));
        $("#currentAddress").setValue("Kazancevo");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Maxim Kazakov"));
        $("#closeLargeModal").click();
    }

    @AfterAll
    static void afterAll() {
        Configuration.holdBrowserOpen = true;
    }
}
