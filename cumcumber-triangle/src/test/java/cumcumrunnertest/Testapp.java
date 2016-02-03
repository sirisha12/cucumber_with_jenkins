
package cumcumrunnertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testapp {
	private WebDriver driver;

	@Given("^user navigating to Test Triangle App$")
	public void user_navigating_to_Test_Triangle_App() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/sirisha/");
	}

	@When("^user tick on the check Box$")
	public void user_tick_on_the_check_Box() throws Throwable {
		driver.findElement(By.id("checkbox")).click();
	}

	@When("^user click on next button$")
	public void user_click_on_next_button() throws Throwable {
		driver.findElement(By.id("next")).click();   
	}

	@Then("^user should be taken to singUp page$")
	public void user_should_be_taken_to_singUp_page() throws Throwable {
	 System.out.println(" User Suceesfully Enters SignUp Page ");
	  
	}

	@Then("^user enters all the details in signup page$")
	public void user_enters_all_the_details_in_signup_page() throws Throwable {
		driver.findElement(By.id("forenames")).sendKeys("sirisha");
 		Thread.sleep(1000);
		driver.findElement(By.id("surename")).sendKeys("nalam");
		Thread.sleep(1000);
		driver.findElement(By.id("radiof")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("address1")).sendKeys("kphb");
		Thread.sleep(1000);
		driver.findElement(By.id("address2")).sendKeys("jntu");
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.id("postalcode")).sendKeys("500001");
		Thread.sleep(1000);
		driver.findElement(By.id("telephone")).sendKeys("9087654321");
		Thread.sleep(1000);
		Select sel1=new Select(driver.findElement(By.name("country")));
	    sel1.selectByVisibleText("India");
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		 driver.findElement(By.xpath("//input[@id='submit']")).click();
	 
	}

	@Then("^user should be taken to filght booking page$")
	public void user_should_be_taken_to_filght_booking_page() throws Throwable {
		 System.out.println(" User Suceesfully Enters Filght Booking Page ");
	}

	@Then("^user book the fight ticket$")
	public void user_book_the_fight_ticket() throws Throwable {
		
		Select sel2=new Select(driver.findElement(By.name("depart")));
	    sel2.selectByVisibleText("London");
	    driver.findElement(By.id("datepicker")).sendKeys("29/9/2015");
	    Select sel3=new Select(driver.findElement(By.name("arrive")));
	    sel3.selectByVisibleText("Paris");
	    Thread.sleep(1000);
	    driver.findElement(By.id("datepicker1")).sendKeys("01/10/2015");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(".//*[@id='passengers']/input")).sendKeys("2");
	    driver.findElement(By.id("tripcheckbox")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("window")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("first")).click();
	    Thread.sleep(1000); 
	   
	}

	@Then("^user click on confirm button$")
	public void user_click_on_confirm_button() throws Throwable {
		 driver.findElement(By.id("confirm")).click();
	}

	@Then("^user should be taken to payment gateway$")
	public void user_should_be_taken_to_payment_gateway() throws Throwable {
		 System.out.println(" User Suceesfully Enters payment gateway ");
	    
	}

	@Then("^user provide all the details in payment page$")
	public void user_provide_all_the_details_in_payment_page() throws Throwable {
	  
		    driver.findElement(By.id("ccnum")).sendKeys("5765443333");
		    driver.findElement(By.id("ccname")).sendKeys("sirisha");
			Select sel4=new Select(driver.findElement(By.id("ccmonth")));
		    sel4.selectByVisibleText("March");
		    Select sel5=new Select(driver.findElement(By.id("ccyear")));
		    sel5.selectByVisibleText("2018");
		    driver.findElement(By.id("ccvc")).sendKeys("155");
	}

	@Then("^use click on paynow button$")
	public void use_click_on_paynow_button() throws Throwable {
		 driver.findElement(By.id("paynow")).click(); 
	  
	}

	@Then("^Message displayed payment was Successfully$")
	public void message_displayed_payment_was_Successfully() throws Throwable {
		 System.out.println(" Message displayed payment was Successfully ");
		 driver.quit();
	}



}
