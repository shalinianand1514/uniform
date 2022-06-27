package stepdefinition;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

public class program {
	
	WebDriver driver = hooksclass.driver;
	
	/*@Given("User is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();  //open my browser
		System.out.println("webdriver is initialized");
		
		
		driver.get("http://uniformm1.upskills.in/admin/index.php?route=sale/order/add&token=VKG3Eh9mx94VO4IXbyayDbZVybOo4pkz");
	    
	    
	}

	@When("User enter value in user name field")
	public void user_enter_value_in_user_name_field1() {
		driver.findElement(By.name("username")).sendKeys("admin");
			
	    
	}

	@When("user enter value in password field")
	public void user_enter_value_in_password_field1() {
		driver.findElement(By.name("password")).sendKeys("Admin@123");
	    
	}

	@Then("Login button enabled")
	public void login_button_enabled1() {
		driver.findElement(By.tagName("button")).click();
		 
	}*/
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver = new ChromeDriver();  //open my browser
		System.out.println("webdriver is initialized");
		
		driver.get("http://uniformm1.upskills.in/admin/index.php?route=sale/order/add&token=VKG3Eh9mx94VO4IXbyayDbZVybOo4pkz");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		driver.findElement(By.tagName("button")).click();
	    
	}

	@When("user logged in")
	public void user_logged_in() {
	    
	}

	@Then("navigate to specific pages")
	public void navigate_to_specific_pages() {
	    
	}

@When("user customer enter value in store")
public void user_customer_enter_value_in_store() {
	WebElement drop = driver.findElement(By.name("store_id"));
    Select obj = new Select(drop);
    obj.selectByVisibleText("Default");
    }

@When("user customer enter value in currency")
public void user_customer_enter_value_in_currency() {
	WebElement drop = driver.findElement(By.name("currency"));
    Select obj = new Select(drop);
    obj.selectByVisibleText("Indian Rupee");
	}

@When("user customer enter value in customer")
public void user_customer_enter_value_in_customer() {
	driver.findElement(By.name("customer")).sendKeys("Shalini");
	}
    
@When("user customer enter value in customer group")
public void user_customer_enter_value_in_customer_group() {
	
	WebElement drop = driver.findElement(By.name("customer_group_id"));
    Select obj = new Select(drop);
    obj.selectByVisibleText("Default");
    }

@When("user customer enter value in First Name")
public void user_customer_enter_value_in_First_Name() {
	driver.findElement(By.name("firstname")).sendKeys("shalini");
    
}

@When("user customer enter value in Last Name")
public void user_customer_enter_value_in_Last_Name() {
	driver.findElement(By.name("lastname")).sendKeys("A");
    
}

@When("user customer enter value in E-mail")
public void user_customer_enter_value_in_E_mail() {
	driver.findElement(By.name("email")).sendKeys("shinny123@gmail.com");
    
}

@When("user customer enter value in Telephone")
public void user_customer_enter_value_in_Telephone() {
	driver.findElement(By.name("telephone")).sendKeys("8200980786");
    
}

@When("user customer enter value in fax")
public void user_customer_enter_value_in_fax() {
	driver.findElement(By.name("fax")).sendKeys("nice");
    
}

@Then("continue button enabled")
public void continue_button_enabled() {
	driver.findElement(By.id("button-customer")).click();
    
}

@When("user customer  choose product")
public void user_customer_choose_product() {
	 WebElement drop=driver.findElement(By.name("product"));
	 Select obj = new Select(drop);
     obj.selectByIndex(3);
   }

@When("user enter quantity")
public void user_enter_quantity() {
	driver.findElement(By.name("quantity")).sendKeys("1");
	
   
}

@Then("navigate to voucher tag")
public void navigate_to_voucher_tag() {
	driver.findElement(By.linkText("Vouchers")).click();
	
   
}

@When("user customer enter Recipient name")
public void user_customer_enter_Recipient_name() {
	driver.findElement(By.name("to_name")).sendKeys("shalu");
    
}

@When("user customer enter Recipient E-mail")
public void user_customer_enter_Recipient_E_mail() {
	driver.findElement(By.name("to_email")).sendKeys("shalu12@gmail.com");
    
}

@When("user customer enter Sender name")
public void user_customer_enter_Sender_name() {
	driver.findElement(By.name("from_name")).sendKeys("shinny");
    
}

@When("user customer enter Sender E-mail")
public void user_customer_enter_Sender_E_mail() {
	driver.findElement(By.name("from_email")).sendKeys("shinny342gmail.com");
    
}

@When("user customer enter Gift Certificate Theme")
public void user_customer_enter_Gift_Certificate_Theme() {
	WebElement drop=driver.findElement(By.name("voucher_theme_id"));
	 Select obj = new Select(drop);
     obj.selectByIndex(3);
    
}

@When("user customer enter message")
public void user_customer_enter_message() {
	driver.findElement(By.name("message")).sendKeys("very nice");
    
}

@When("user customer enter amount")
public void user_customer_enter_amount() {
	driver.findElement(By.name("amount")).sendKeys("1000");
}
@Then("user navigate to payment page")
public void user_navigate_to_payment_page() {
	driver.findElement(By.id("button-cart")).click();
    
}

@When("user customer enter choose address")
public void user_customer_enter_choose_address() {
	driver.findElement(By.name("payment_address")).sendKeys("abc");
}

@When("user customer enter First Name")
public void user_customer_enter_First_Name() {
	driver.findElement(By.name("firstname")).sendKeys("shalini");    
}

@When("user customer enter Last Name")
public void user_customer_enter_Last_Name() {
	driver.findElement(By.name("lastname")).sendKeys("A");
}

@When("user customer enter company")
public void user_customer_enter_company() {
	driver.findElement(By.name("company")).sendKeys("IBM");
}

@When("user customer enter Address{int}")
public void user_customer_enter_Address(Integer int1) {
	driver.findElement(By.name("address_1")).sendKeys("1000");
}

@When("user customer enter city")
public void user_customer_enter_city() {
	driver.findElement(By.name("city")).sendKeys("1000");
}

@When("user customer enter Postalcode")
public void user_customer_enter_Postalcode() {
	driver.findElement(By.name("postcode")).sendKeys("1000");
}

@When("user customer enter country")
public void user_customer_enter_country() {
	WebElement drop=driver.findElement(By.name("country_id"));
	Select obj = new Select(drop);
    obj.selectByIndex(3);
}

@When("user customer enter Region\\/state")
public void user_customer_enter_Region_state() {
	WebElement drop=driver.findElement(By.name("zone_id"));
	Select obj = new Select(drop);
    obj.selectByIndex(3);
}

@Then("user navigate to shipping details")
public void user_navigate_to_shipping_details() {
	driver.findElement(By.id("button_payment_address")).click();
}

@When("user customer enter shipping method")
public void user_customer_enter_shipping_method() {
	driver.findElement(By.name("shipping_method")).sendKeys("home");
}

@When("user customer enter payment method")
public void user_customer_enter_payment_method() {
	WebElement drop=driver.findElement(By.name("payment_method"));
	Select obj = new Select(drop);
	obj.selectByVisibleText("Cash On Delivery");
}

@When("user customer enter coupon")
public void user_customer_enter_coupon() {
	driver.findElement(By.name("coupon")).sendKeys("sha");
}

@When("user customer enter voucher")
public void user_customer_enter_voucher() {
	driver.findElement(By.name("voucher")).sendKeys("qwe");
}

@When("user customer enter Reward")
public void user_customer_enter_Reward() {
	driver.findElement(By.name("reward")).sendKeys("good");
}

@When("user customer enter order status")
public void user_customer_enter_order_status() {
	WebElement drop=driver.findElement(By.name("order_status_id"));
	Select obj = new Select(drop);
	obj.selectByVisibleText("Processing");
	
}

@When("user customer enter comment")
public void user_customer_enter_comment() {
	driver.findElement(By.name("comment")).sendKeys("nice");
}

@When("user customer enter Affiliate")
public void user_customer_enter_Affiliate() {
	driver.findElement(By.name("affiliate")).sendKeys("1000");
}

@Then("user navigate to totals")
public void user_navigate_to_totals() {
	driver.findElement(By.id("button_save")).click();
}

@When("customer click on the delete button")
public void customer_click_on_the_delete_button() {
	driver.findElement(By.name("button_delete_599")).click();
	
    
}

@When("customer click ok or cancel button")
public void customer_click_ok_or_cancel_button() {
	Alert obj = driver.switchTo().alert();
	
	obj.accept();
}

@When("customer edit value in store")
public void customer_edit_value_in_store() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("Store_id")).sendKeys("B2567895");
}

@When("customer edit value in currency")
public void customer_edit_value_in_currency() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("currency")).sendKeys("Indian Rupee");
}

@When("customer edit value in customer")
public void customer_edit_value_in_customer() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("customer")).sendKeys("shinny");
}

@When("customer edit value in customer group")
public void customer_edit_value_in_customer_group() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("code")).sendKeys("B2567895");
}

@When("customer edit value in First Name")
public void customer_edit_value_in_First_Name() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("firstname")).sendKeys("shalini");
}

@When("customer edit value in Last Name")
public void customer_edit_value_in_Last_Name() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("lastname")).sendKeys("A");
}

@When("customer edit value in E-mail")
public void customer_edit_value_in_E_mail() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("email")).sendKeys("shaku5@gamil.com");
}

@When("customer edit value in Telephone")
public void customer_edit_value_in_Telephone() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("telephone")).sendKeys("9752567895");
}

@When("customer edit value in fax")
public void customer_edit_value_in_fax() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("fax")).sendKeys("good");
}

@When("customer  edit choose product")
public void customer_edit_choose_product() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("Choose_product"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
}

@When("customer edit enter quantity")
public void customer_edit_enter_quantity() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("quantity")).sendKeys("1");
}

@When("customer edit Recipient name")
public void customer_edit_Recipient_name() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("to_name")).sendKeys("roshini");
}

@When("customer edit Recipient E-mail")
public void customer_edit_Recipient_E_mail() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("to_email")).sendKeys("roshini2gamil.com");
}

@When("customer edit Sender name")
public void customer_edit_Sender_name() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("from_name")).sendKeys("anand");
}

@When("customer edit Sender E-mail")
public void customer_edit_Sender_E_mail() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("from_email")).sendKeys("anand@gmail.com");
}

@When("customer edit Gift Certificate Theme")
public void customer_edit_Gift_Certificate_Theme() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("voucher_theme_id")).sendKeys("abishek");
}

@When("customer edit message")
public void customer_edit_message() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("message")).sendKeys("good");
}

@When("customer edit amount")
public void customer_edit_amount() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("amount")).sendKeys("12340");
}

@Then("navigate to payment page")
public void navigate_to_payment_page() {
	driver.findElement(By.id("button_id")).click();
    
}

@When("customer edit choose address")
public void customer_edit_choose_address() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("payment_address"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
    
}

@When("customer edit First Name")
public void customer_edit_First_Name() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("firstname")).sendKeys("shalini");
   
}

@When("customer edit Last Name")
public void customer_edit_Last_Name() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("lastname")).sendKeys("shalu");
	
}

@When("customer edit company")
public void customer_edit_company() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("company")).sendKeys("infy");
}

@When("customer edit Address{int}")
public void customer_edit_Address(Integer int1) {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("address_1")).sendKeys("abvf");
}

@When("customer edit city")
public void customer_edit_city() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("city")).sendKeys("vellore");
}

@When("customer edit Postalcode")
public void customer_edit_Postalcode() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("postcode")).sendKeys("632301");
}

@When("customer edit country")
public void customer_edit_country() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("Country"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
    
}

@When("customer edit Region\\/state")
public void customer_edit_Region_state() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("state"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
}

@Then("navigate to shipping details")
public void navigate_to_shipping_details() {
	driver.findElement(By.id("button_payment_address")).click();
    
}

@When("customer edit shipping method")
public void customer_edit_shipping_method() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("shipping_method"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
    
}

@When("customer edit payment method")
public void customer_edit_payment_method() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("payment_method"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
}

@When("customer edit coupon")
public void customer_edit_coupon() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("coupon")).sendKeys("shal098");
    
}

@When("customer edit voucher")
public void customer_edit_voucher() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("voucher")).sendKeys("shalini987");
}

@When("customer edit Reward")
public void customer_edit_Reward() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("customer edit order status")
public void customer_edit_order_status() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("reward")).sendKeys("nice product");
}

@When("customer edit comment")
public void customer_edit_comment() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("comment")).sendKeys("nice quality");
}

@When("customer edit Affiliate")
public void customer_edit_Affiliate() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("affiliate")).sendKeys("ecfg");
}

@Then("navigate to totals")
public void navigate_to_totals() {
	driver.findElement(By.id("button_save")).click();
    
}

@When("customer enter value in order ID")
public void customer_enter_value_in_order_ID() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("filter_order_id"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
	
}

@When("customer enter value in customer field")
public void customer_enter_value_in_customer_field() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("filter_customer"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
}

@When("customer enter value in order status")
public void customer_enter_value_in_order_status() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("filter_order_status"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
    
}

@When("customer enter value in totals")
public void customer_enter_value_in_totals() {
	driver.findElement(By.name("code")).clear();
	WebElement drop=driver.findElement(By.name("filter_totals"));
	Select obj = new Select(drop);
	obj.selectByIndex(3);
	
    
}

@When("customer enter value in Date added")
public void customer_enter_value_in_Date_added() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("filter_date_added")).sendKeys("22/06/2022");
   
}

@When("customer enter value in Date modified")
public void customer_enter_value_in_Date_modified() {
	driver.findElement(By.name("code")).clear();
	driver.findElement(By.name("filter_date_modified")).sendKeys("22/06/2022");
    
}

@Then("filter button enabled")
public void filter_button_enabled() {
	driver.findElement(By.id("button_filter")).click();
    
}







    
}



