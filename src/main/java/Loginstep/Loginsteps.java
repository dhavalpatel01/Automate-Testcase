package Loginstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Loginsteps {

	
	
	WebDriver driver;
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	
	  //System.out.println("this will execute First");
		System.setProperty("webdriver.chrome.driver","E:\\Alljar\\Driver\\chromedriver_win32\\chromedriver.exe");					
	    driver= new ChromeDriver();					
	    driver.manage().window().maximize();			
	    driver.get("https://ledgerleopardtest.azurewebsites.net/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='Submit']")).click();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
			
	  // System.out.println("second this will execute");
		 Thread.sleep(3000);
		 WebElement Username=driver.findElement(By.xpath("//input[@name='Username or email address']"));
		 Username.sendKeys("newifouradmin@gmail.com");
		 WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
		 Password.sendKeys("ifour@1234");
	}
    @Then("^Redirect to the homepage$")
	public void reset_the_credential() throws Throwable {
	  
    //	System.out.println("Third this will execute");
    	WebElement Loginbtn=driver.findElement(By.xpath("//button[@id='next']"));
		Loginbtn.click();
	}
    @Then("^Verfy the Title of the page$")
    public void verfy_the_Title_of_the_page() throws Throwable {
    	Thread.sleep(2000);
    	driver.navigate().refresh();
    	String j = driver.getTitle();
		System.out.println("Your page title Is : "+j);
	    Assert.assertEquals("Dashboard",j);
	}
    @Then("^Userclick on the MyLogg$")
    public void userclick_on_the_MyLogg() throws Throwable {
    //  System.out.println("This is the fourth page");
        WebElement lnkMenulog=driver.findElement(By.xpath("//div/ul/li[@id='MyLoggMenu']"));
        lnkMenulog.click();
        Thread.sleep(2000);
        WebElement btnAddlog=driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/div/div/div/div/div/div/a[@class='dt-button btn btn-primary']"));
        btnAddlog.click();
        System.out.println("This Link clicked successfully");
    }
    @Given("^User already on the Home Page$")
    public void user_already_on_the_Home_Page() throws Throwable {
    	System.out.println("User Already on the Login page");
    }
    @When("^User select the Subject$")
    public void user_select_the_Subject() throws Throwable {
    	System.out.println("This two is execute");
        Thread.sleep(5000);
        Select drpsub=new Select(driver.findElement(By.xpath("//div/div/div/div/form/div/div/div/div/a[@class='chosen-single']")));
        drpsub.selectByVisibleText("Toegekende uren");
    }
    @Then("^User Enter the Text Description$")
    public void user_Enter_the_Text_Description() throws Throwable {
    	System.out.println("This third is execute");
    }
    @Then("^User Clicked on the Create button$")
    public void user_Clicked_on_the_Create_button() throws Throwable {
    	/*System.out.println("This fourth is execute");
    	Thread.sleep(2000);
    	WebElement btncreate=driver.findElement(By.xpath("//div/div/div/button[@type='submit']"));
    	btncreate.click();*/
    }
    @Then("^verify that Log added successfully message shows or not\\.$")
    public void verify_that_Log_added_successfully_message_shows_or_not() throws Throwable {
    	 System.out.println("This fifth is execute");
    }

	
}
