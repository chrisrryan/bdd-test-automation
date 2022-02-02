package cucumber;

import base.BaseTests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"cucumber.stepdefs"},
        features = {"src/test/java/cucumber/features"})

public class CucumberTestOptions {

    @BeforeClass
    public static void setUp() {
        BaseTests.launchApplication();
    }

    @AfterClass
    public static void tearDown() {
        BaseTests.closeBrowser();
    }
}