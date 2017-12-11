package com.collegeboard.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin= {"html:target/cucumber", "json:target/report.json"},

//All feature
features="./src/test/resources/com/collegeboard/features", 

//RegisterForClepExamFeature
//features="./src/test/resources/com/collegeboard/features/RegisterForClepExams.feature",

//SearchInstitutionPolicyFeature
//features="./src/test/resources/com/collegeboard/features/SearchInstitutionPolicies.feature",

//TestCenterSearchPageFeature
//features="./src/test/resources/com/collegeboard/features/TestCenterSearchPage.feature",

//LoginFeature
//features="./src/test/resources/com/collegeboard/features/Login.feature",

glue="com.collegeboard.step_defs",
tags= {"@Regression", "~@Regression2","~@Smoke", "~@Login"},
//tags="@Regression, ~@Smoke",
dryRun=false
)

public class CukesRunner {
	


}
