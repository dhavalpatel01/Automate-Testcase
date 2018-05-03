package TestRunner;
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="D:\\AutomationProject\\DemoPro\\src\\main\\java\\LoginFeature",
glue={"Loginstep"},
monochrome=true)



public class Runner {
	
}
