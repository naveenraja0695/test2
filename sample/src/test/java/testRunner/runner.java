package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src\\test\\resources\\feature"},
glue= {"src\\test\\java\\stepDefinitions"}, plugin = {"pretty", "html:target/reports.html"}, monochrome = true)
public class runner {

}
