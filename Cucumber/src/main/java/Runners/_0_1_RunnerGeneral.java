package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java"},
        glue = {"stepDefination"},
        dryRun = false

)



public class _0_1_RunnerGeneral extends AbstractTestNGCucumberTests {


}
