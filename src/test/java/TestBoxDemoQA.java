import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.clipboard.Content;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
@Tag("simple")
public class TestBoxDemoQA {
    //https://demoqa.com/text-box

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillForm() {
        open("https://mail.ru");
        // open("https://demoqa.com/text-box");
//        Configuration.holdBrowserOpen = true;

//        $("#userName").setValue("Maxim Kazakov");
//        $("#userEmail").setValue("info@kazakovms.ru");
//        $("#currentAddress").setValue("First adress");
//        $("#permanentAddress").setValue("Second adress");
//        $("#submit").click();
//
//        $("#output").shouldHave(text("Maxim Kazakov"), text("info@kazakovms.ru"), text("First adress"),
//                text("Second adress"));


    }

    //@AfterAll
    //static void settingProg() {
      //  Configuration.holdBrowserOpen = true;
    //}
}
