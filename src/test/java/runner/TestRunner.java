package runner;
//WE HAVE ONLY ONE TEST RUNNER CLASS IN EACH PROJECT AND THE ONLY THING CHANGE IS TAGS THAT SHOWS WHICH SCENARRIO SHOULD BE RUN 
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

	
	//we will use cucumber options to setup our TestRunner class
	//feature : we can add the path to our feature files here
	//glue : we add the path to our stepDefinitions where (we are gluing features to steps)
	//tags : by adding the tags we will specify which feature(s), scenario(s) or scenario outline should be executed
	//dryRun : if set to true, it will check and make sure we have stepDefinition methods for each step in feature file
			//if set to false, it will execute the test case for us
	//monochrome : will help us to print the stepDefinition methods in clean formate in the console so that we can use it 
	//strick will mark our scenarios as failed if there is not stepDefinition methods available
	//in our stepDefinition class
	//plugin : we can add plugin(s) here to generate reports
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "classpath:features",//instead of path we put like this is better because in other computer it will work
	glue = "stepDefinitions",// it glue test runner to step definition class
	tags = "@Regression",//@Laptop ,@Desktop , ,@Retail,Home , @Regression
	dryRun = false,//it should be false to run and true for only check
	strict = true,// true means please check if there is step deff for each scenario
    	monochrome = true,
	plugin = {//we need this log in for having report
			"pretty",//report be in prettyform
			"html:target/site/cucumber-pretty",//html report in target folder
			"json:target/cucumber.json"//report be in jason format in target
	},
	publish = true// yes publish report
	)
	
public class TestRunner {

	
		
		

		@AfterClass
		public static void generateReport() {//we need create CucumberReportingConfig class in src/main/utilities class
			CucumberReportingConfig.reportConfig();
		}


}

