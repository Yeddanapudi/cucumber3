package Step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/project1/project1/features"},glue= {"Step_definition"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports/reports.html"})
public class test_runner {

}
