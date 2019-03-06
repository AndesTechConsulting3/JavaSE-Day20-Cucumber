package org.andestech.learning.rfb19.g3;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"src/test/resources/features"},
 glue =  "org.andestech.learning.rfb19.g3",
 plugin = {"pretty", "html:target/cuckes-report-html",
 "json:target/cickes-report.json"}
 //,tags = "@logintest"

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
