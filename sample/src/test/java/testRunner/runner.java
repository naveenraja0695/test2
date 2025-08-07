package testRunner;

import io.cucumber.testng.CucumberOptions;

//@RunWith(cucumber.class)

@CucumberOptions(features= {"src\\test\\resources\\feature"},
glue= {"src\\test\\java\\stepDefinitions"})
public class runner {

}
