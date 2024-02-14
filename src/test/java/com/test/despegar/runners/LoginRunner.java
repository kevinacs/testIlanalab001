package com.test.despegar.runners;

import com.test.despegar.pages.BasePage;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscarVuelos.feature",
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "json:target/serenity-reports/login/cucumber.json",
                "html:target/serenity-reports/login/serenity-html-report.html",
                "rerun:target/serenity-reports/login/rerun.txt"
        }
)
public class LoginRunner {
        @AfterClass
        public static void cleanDriver(){
                BasePage.closeBrowser();
        }
}