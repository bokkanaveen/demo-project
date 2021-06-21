package com.MyCucumber_Demo.testRunners;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bokka\\NewWork_Space\\com.MyCucumber_Demo\\src\\test\\resources\\Features\\Login.feature",
glue= {"stepDefinition"},monochrome=true,plugin= {"pretty","html:target/htmlReports/login.html","json:target/jsonReports/login.json","junit:target/junitReports/login.xml"}
,tags="")
public class Login_TestRunner    {
	
	
}
