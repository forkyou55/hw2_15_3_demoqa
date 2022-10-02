package com.demoqa.tests;

import com.github.javafaker.Faker;
import utils.FakerUtils;

public class TestFakerData extends com.demoqa.tests.TestBase {

        private static final Faker faker = new Faker();
        public static String firstName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = faker.internet().emailAddress(),
                number = String.valueOf(faker.phoneNumber().subscriberNumber(10)),
                gender = faker.demographic().sex(),
                hobby = "Sports",
                subject = "English",
                address = String.valueOf(faker.address().fullAddress()),
                state = "NCR",
                city = "Delhi",
                day = String.valueOf(faker.number().numberBetween(1, 31)),
                month = String.valueOf(FakerUtils.getRandomMonth()),
                year = String.valueOf(faker.number().numberBetween(1969, 2022)),
                date = day + " " + month + "," + year;
    }

