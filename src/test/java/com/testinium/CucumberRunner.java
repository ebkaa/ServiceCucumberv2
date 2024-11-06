package com.testinium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:features",
        plugin = { "pretty", "junit:target/surefire-reports/junitreports/testNGReport.xml" },
        monochrome = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
