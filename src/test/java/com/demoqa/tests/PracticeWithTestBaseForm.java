package com.demoqa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeWithTestBaseForm extends TestBase {

    @Test
    void fillTestes() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('#RightSide_Advertisement').remove()");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#uploadPicture").uploadFromClasspath("John Doe.jpeg");
        $("#currentAddress").setValue("Lubyanka Street");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
  //      $(".table-responsive").shouldHave(text("firstName lastName"),
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(email),
                text("Male"),
                text(phone),
                text(day + " " + month + "," + year),
                text("English"),
                text("Sports"),
                text("John Doe.jpeg"),
                text("Lubyanka Street"),
                text("NCR Delhi"));
    }
}
