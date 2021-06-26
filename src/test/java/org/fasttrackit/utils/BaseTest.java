package org.fasttrackit.utils;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.RandomStringGenerator;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;
import java.util.Random;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximize(){
        driver.manage().window().maximize();
    }


}

