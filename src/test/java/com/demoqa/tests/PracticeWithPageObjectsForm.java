package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.PracticeFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeWithPageObjectsForm {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    @BeforeAll
    static void configuration() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    @DisplayName("Полное заполнение регистрационной формы")
    void fillTestes() {
        practiceFormPage.openPage()
        .setFirstName("Foma")
        .setLastName("Kiniaev")
        .setEmail("FKiniaev@gmail.com")
        .setGender("Male")
        .setNumber("9995771202")
        .setBirthDate("21","August","1969" )
        .setHobbies("Sports")
        .setSubjects("English")
        .setUploadPicture("John Doe.jpeg")
        .setAddress("Lubyanka Street")
        .setState("NCR")
        .setCity("Delhi")
        .setSubmit();

        practiceFormPage.checkResultsTableVisible()
                .checkResult("Student Name","Foma Kiniaev")
                .checkResult("Student Email","FKiniaev@gmail.com")
                .checkResult("Gender","Male")
                .checkResult("Mobile","9995771202")
                .checkResult("Date of Birth","21 August,1969")
                .checkResult("Subjects","English")
                .checkResult("Hobbies","Sports")
                .checkResult("Picture","John Doe.jpeg")
                .checkResult("Address","Lubyanka Street")
                .checkResult("State and City","NCR Delhi");

    }

    @Test
    @DisplayName("Минимальное заполнение регистрационной формы")
    void fillFormWithMunimumTestes() {
        practiceFormPage.openPage()
                .setFirstName("Foma")
                .setLastName("Kiniaev")
                .setEmail("FKiniaev@gmail.com")
                .setGender("Male")
                .setNumber("9995771202")
                .setSubmit();
        practiceFormPage.checkResultsTableVisible()
                .checkResult("Student Name","Foma Kiniaev")
                .checkResult("Student Email","FKiniaev@gmail.com")
                .checkResult("Gender","Male")
                .checkResult("Mobile","9995771202");

    }
}

