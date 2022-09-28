package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

      String firstName = "Foma",
            lastName = "Kiniaev",
            email = "FKiniaev@gmail.com",
            phone = "9995771202",
            day = "21",
            month = "August",
            year = "1969";

    @BeforeAll
    static void configuration() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
}
}
