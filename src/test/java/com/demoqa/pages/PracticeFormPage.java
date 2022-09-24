package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ResultsTableComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    private final CalendarComponent calendarComponent = new CalendarComponent();
    private final ResultsTableComponent resultsTableComponent =new ResultsTableComponent();
   private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderSelect = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            birthDateInput = $("#dateOfBirthInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            subjectsInput = $("#subjectsInput"),
            pictureUpload = $("#uploadPicture"),
            adressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitButton = $("#submit");

    public PracticeFormPage openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('#RightSide_Advertisement').remove()");

        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

//    public PracticeFormPage clearFirstName(String value) {
//        firstNameInput.clear();
//
//        return this; - для очисти поля ввода
    public PracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }
    public PracticeFormPage setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }
    public PracticeFormPage setGender(String value) {
        genderSelect.$(byText(value)).click();

        return this;
    }

    public PracticeFormPage setNumber(String value) {
        numberInput.setValue(value);

        return this;
    }
    public PracticeFormPage setBirthDate(String day, String month,String year) {
        birthDateInput.click();
        calendarComponent.setDate(day,month,year);

        return this;


    }
    public PracticeFormPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();

        return this;

    }
    public PracticeFormPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();

        return this;

    }
    public PracticeFormPage setUploadPicture(String fileName) {
        pictureUpload.uploadFromClasspath(fileName);

        return this;

    }
    public PracticeFormPage setAddress(String value) {
        adressInput.setValue(value);

        return this;

    }
    public PracticeFormPage setState(String state) {
            $(stateInput).setValue(state).pressEnter();

            return this;

    }
    public PracticeFormPage setCity(String city) {
        $(cityInput).setValue(city).pressEnter();

        return this;

    }
    public void setSubmit() {
        submitButton.click();

    }
    public PracticeFormPage checkResultsTableVisible() {
       resultsTableComponent.checkVisible();

        return this;

    }
    public PracticeFormPage checkResult(String key, String value) {
        resultsTableComponent.checkResult(key, value);

        return this;

    }

}

