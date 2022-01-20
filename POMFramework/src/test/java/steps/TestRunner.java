package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features="src/test/java/features",
glue = "steps",
plugin = {"html: reports"},
tags = {"@wip"},
snippets = SnippetType.CAMELCASE)

public class TestRunner extends AbstractTestNGCucumberTests {
	

}
