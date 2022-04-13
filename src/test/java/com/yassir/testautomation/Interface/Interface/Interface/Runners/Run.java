package com.yassir.testautomation.Interface.Interface.Interface.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/themoviedb.feature",
        glue = ("StepDefinitions")
)
public class Run extends AbstractTestNGCucumberTests{

}
