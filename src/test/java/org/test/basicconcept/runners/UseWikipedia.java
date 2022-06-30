package org.test.basicconcept.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/use_wikipedia.feature",
        glue = "org.test.basicconcept.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class UseWikipedia {
}
