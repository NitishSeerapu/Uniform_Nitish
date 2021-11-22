package stepDefinition;

import java.io.InvalidObjectException;
import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObject.LoginMarketing;
import pageObject.Marketing;
import pageObject.Reports1;
import resources.Base;


    public class StepDefinitions extends Base {
    @Given("^login with admin creditials$")
    public void login_with_admin_creditials() throws Throwable {
        
	 
	driver =initializeDriver();
	driver.get("http://uniformm1.upskills.in/admin/");
	
	driver.manage().window().maximize();
	LoginMarketing l=new LoginMarketing(driver);
	l.getAdmin().sendKeys("admin");
	l.getPassword().sendKeys("admin@123");
	l.getSubmit().click();

}
    @And("^Click on menu button and then Marketing$")
    //Click on Menu Option
    //Click on Marketing
    public void click_on_menu_button_and_then_marketing() throws Throwable {
    	LoginMarketing l=new LoginMarketing(driver);
    	l.getMenu().click();
    	l.getMarketing().click();
    	
    }
    
    //Marketings
    
    @When("^Click on Marketing$")
    public void click_on_marketing() throws Throwable {
    	//Marketing options
    Marketing m=new Marketing(driver);
    m.getMarketing().click();
    }

    @Then("^Navigate to Marketing page$")
    public void navigate_to_marketing_page() throws Throwable {
      String s=driver.getTitle(); 
      //It will Navigate to Marketing Tracking Page
      Assert.assertEquals("Marketing Tracking",s);
    }
    
    //Affiliates

    @When("^Click on Affiliates$")
    public void click_on_affiliates() throws Throwable {
    	//Click on Affiliates
    	LoginMarketing l=new LoginMarketing(driver);
    	l.getAffiliates().click();
    }

    @Then("^Naviagte to Affiliates page$")
    public void naviagte_to_affiliates_page() throws Throwable {
    	//It will Navigate to Affiliates Page
    	String t=driver.getTitle();
    	Assert.assertEquals("Affiliates",t);
    }
    
    //Coupons
    
    @When("^click on Coupons$")
    public void click_on_coupons() throws Throwable {
    	//Click on Coupons
    	LoginMarketing l=new LoginMarketing(driver);
    	l.getCoupons().click();

    }

    @Then("^Navigate to Coupons page$")
    public void navigate_to_coupons_page() throws Throwable {
    	//It will Naviate to Coupons Page
        String t1=driver.getTitle();
        Assert.assertEquals("Coupons",t1);
        
    }
    
    //Mail
    
    @When("^Click on Mail$")
    public void click_on_mail() throws Throwable {
    	//Click on Mail Option
    	LoginMarketing l=new LoginMarketing(driver);
    	l.getMail().click();
    }

    @Then("^Navigate to Mail page$")
    public void navigate_to_mail_page() throws Throwable {
    	//It will Navigate to Mail Page
    	  String t2=driver.getTitle();
    	  Assert.assertEquals("Mail",t2);
    }
    

   @When("^Click on Marketing option$")
   public void click_on_marketing_option() throws Throwable {
	   //Campaign Name in Marketing
    Marketing m=new Marketing(driver);
    m.getMarketing().click();
   }

    @Then("^enter the Campaign Name in the campaign Name text box$")
    public void enter_the_campaign_name_in_the_campaign_name_text_box() throws Throwable {
    	//Enter the Campaign Name in the Text Box.
        LoginMarketing l=new LoginMarketing(driver); 
        l.getCampaignname().sendKeys("jhgfds");
    }

    @Then("^Click on Filter$")
    public void click_on_filter() throws Throwable {
    	//Click on Filtering
        LoginMarketing l=new LoginMarketing(driver); 
        l.getFilter().click();
    	
    }
    

    
    @When("^Click on Add Button$")
    public void click_on_add_button() throws Throwable {
    	   //Add campaign name and Tracking Code in Tracking option
    	 Marketing m=new Marketing(driver);
    	 m.getAddButton().click();
    }

    @Then("^Enter the Name in the Campaign text Box$")
    public void enter_the_name_in_the_campaign_text_box() throws Throwable {
    	//Click on Campaign Text in the Text Box
        Marketing m=new Marketing(driver);
        m.getCampaign().sendKeys("nitish");
    }

 
    @Then("^Enter the Code in the Tracking code box$")
    public void enter_the_code_in_the_tracking_code_box() throws Throwable {
    	   //Add Tracking code
    	 Marketing m=new Marketing(driver);
    	 m.getTracking().sendKeys("7395926362");
    }

    @And("^Click on Save Button$")
    public void click_on_save_button() throws Throwable {
        //Click on Save Button
    	 Marketing m=new Marketing(driver);
    	 m.getSave().click();
       }
       
  
    @When("^Click on Affiliated$")
    public void click_on_affiliated() throws Throwable {
    	 //Click on Affilates option in marketing dropdown
   	 Marketing m=new Marketing(driver);
	 m.getAffiliates().click();
    }
        
    @Then("^Enter the Name in the Affiliated name text box$")
    public void enter_the_name_in_the_affiliated_name_text_box() throws Throwable {
    	//Enter the Affiliate name in the Text Box
        Marketing m=new Marketing(driver);
        m.getAffiliatedname().sendKeys("Chinu patil");
    }
       
    @Then("^Enter Mail in the Emails Text Box$")
    public void enter_mail_in_the_emails_text_box() throws Throwable {
    	 //Enter the Mail in the Text Box
    	Marketing m=new Marketing(driver);
   	 m.getEmail().sendKeys("chinmaya@gmail.com");
    }
    
    @And("^Click on Filtering$")
    public void click_on_filtering() throws Throwable {
    	//Click on Filtering Option
    	Marketing m=new Marketing(driver);
    	m.getFilter().click();
    }
  
    @When("^Click on Affiliate option$")
    public void click_on_affiliate_option() throws Throwable {
    	   //Click on Affiliates Option
    	Marketing m=new Marketing(driver);  
    	m.getAffiliateoption().click();
    }

    @Then("^Select the Check Box$")
    public void select_the_check_box() throws Throwable {
        //Select the Check Box
    	Marketing m=new Marketing(driver);
    	m.getCheckbox().click();
    }
    
    @And("^click on Deletebutton$")
    public void click_on_deletebutton() throws Throwable {
    	//delete the option By using Delete option
    	Marketing m=new Marketing(driver);
    	m.getDeletebutton().click();
    }
     //Click on Accept Button For Accepting
    @And("^Click on Accept$")
    public void click_on_accept() throws Throwable {
    			driver.switchTo().alert().accept();
    }
    
    @When("^Click on Couponsoptions$")
    public void click_on_couponsoptions() throws Throwable {
    	Marketing m=new Marketing(driver);
    	////Click on Option
    	m.getCouponsoption().click();
    }
        
    @Then("^Click On Add Symbol$")
    public void click_on_add_symbol() throws Throwable {
    	//Click on ADD Option
    	Marketing m=new Marketing(driver);
    	m.getAddsymbol().click();
      
    }

    @Then("^Click on Coupon Name$")
    public void click_on_coupon_name() throws Throwable {
    	//Click on Coupon Name
    	Marketing m=new Marketing(driver);
    	m.getCouponsname().sendKeys("nitisha");
    }

    @Then("^Click on Code$")
    public void click_on_code() throws Throwable {
    	//Click on Code option
    	Marketing m=new Marketing(driver);
    	m.getCode().sendKeys("739592");
    }

    @And("^Click on Save Option$")
    public void click_on_save_option() throws Throwable {
    	//	Click on Save Option
    	Marketing m=new Marketing(driver);
    	m.getSaveoption().click();
    }
    @And("^Click on Back option$")
    public void click_on_back_option() throws Throwable {
    	//Click on Back Option
        Marketing m=new Marketing(driver);
        m.getBack().click();
    }
    
    @Then("^Select the checkbox option$")
    public void select_the_checkbox_option() throws Throwable {
    	//Click on Check Box
    	Marketing m=new Marketing(driver);
    	m.getcheckboxoption().click();
    }

    @And("^Click on DeleteButton option$")
    public void click_on_deletebutton_option() throws Throwable {
    	//Click on Delete option
    	Marketing m=new Marketing(driver);
    	m.getDeleteButtonoption().click();
    }
   
    @And("^Click on Accept option$")
    public void click_on_accept_option() throws Throwable {
    	  //Click on Accept Option
    	driver.switchTo().alert().accept();
    	System.out.println("Delete is Done");
    }

    @When("^Click on Mail option$")
    public void click_on_mail_option() throws Throwable {
        //Click on The Mail option in the Marketing Dropdown
    	Marketing m=new Marketing(driver);
    	m.getMailoption().click();
    }

    @Then("^Enter the Details in the From option$")
    public void enter_the_details_in_the_from_option() throws Throwable {
        //Enter the From Adress
    	Marketing m=new Marketing(driver);
    	m.getFromoption().click();
    }
      
    @And("^Enter the Subject$")
    public void enter_the_subject() throws Throwable {
    	//Click On Subject to enter the Subject
    	Marketing m=new Marketing(driver);
    	m.getSubject().sendKeys("Regarding the Order");
    	System.out.println("Enter the Subject");
    }


    @And("^Click Mail Symbol$")
    public void click_mail_symbol() throws Throwable {
        //Click on Mail Symbol for Sending the Mail
    	Marketing m=new Marketing(driver);
    	m.getMailsymbol().click();
    }
     
    @And("^click on Home$")
    public void click_on_home() throws Throwable {
    	//Click on Home
        //It will show the Menu
    	Marketing m=new Marketing(driver);
    	m.getHome().click();
    }
  
    @When("^click on reportsdropdown$")
    public void click_on_reportsdropdown() throws Throwable {
    	  //Click on Reports Dropdown
    	Reports1 r=new Reports1(driver);
    	r.getreportsdown().click();
        
    }
    

    @Then("^Click on Sales$")
    public void click_on_sales() throws Throwable {
    	//click on Sales in Report Dropdown
    	Reports1 r=new Reports1(driver);
    	r.getSales().click();
    }
   
    @Then("^Click on Orders option$")
    public void click_on_orders_option() throws Throwable {
    	//Click on Orders in Sales
    	Reports1 r=new Reports1(driver);
    	r.getOrdersoption().click();
    }
  
    @Then("^Navigate to Sales Report Page$")
    public void navigate_to_sales_report_page() throws Throwable {
    	////Then it navigate to Sales Report Page
    	Reports1 r=new Reports1(driver);
    	 String r1=driver.getTitle(); 
         Assert.assertEquals("Sales Report",r1);
    }


    @When("^Click on Tax option$")
    public void click_on_tax_option() throws Throwable {
        //Click on Tax option
    	Reports1 r=new Reports1(driver);
    	r.getTaxoption().click();
    }
    
    @Then("^Navigate to Tax Report Page$")
    public void navigate_to_tax_report_page() throws Throwable {
    	//Then it Navigate to Reports Page
    	 Reports1 r=new Reports1(driver);
    	String r2=driver.getTitle(); 
        Assert.assertEquals("Tax Report",r2);
    	
    }
   
    @Then("^Click on Shipping$")
    public void click_on_shipping() throws Throwable {
    	// //Click on shipping
        Reports1 r=new Reports1(driver);
        r.getShipping().click();
    }
    
    @And("^Navigate to Shipping Report$")
    public void navigate_to_shipping_report() throws Throwable {
      //Navigate to Shipping Reports
    	 Reports1 r=new Reports1(driver);
    	 String r3=driver.getTitle();
    	 Assert.assertEquals("Shipping Report",r3);
    }
    
    @When("^Click on Returns option$")
    public void click_on_returns_option() throws Throwable {
    	//Click on Returns Option
        Reports1 r=new Reports1(driver);
        r.getReturnsoption().click();
    }
       
    @Then("^Navigate to Returns Report$")
    public void navigate_to_returns_report() throws Throwable {
    	//Then it Navigate to Returns Reports Page
    	  Reports1 r=new Reports1(driver);
    	  String r4=driver.getTitle();
    	  Assert.assertEquals("Returns Report",r4);
        
    }

    @When("^Click on Coupons option$")
    public void click_on_coupons_option() throws Throwable {
        //Click on Coupons Option
        Reports1 r=new Reports1(driver);
        r.getCouponsoption().click();
    }

    @Then("^Navigate to Coupons Report$")
    public void navigate_to_coupons_report() throws Throwable {
        //Naviagte to Coupons Page
        Reports1 r=new Reports1(driver);
        String r5=driver.getTitle();
  	  Assert.assertEquals("Coupons Report",r5);
    }
    
    @When("^Click on Products$")
    public void click_on_products() throws Throwable {
    	//Click on Products
    	 Reports1 r=new Reports1(driver);
    	  r.getProductsoption().click();
    }
     
    @Then("^Click on Viewed$")
    public void click_on_viewed() throws Throwable {
    	//Click on Viewed Option in the Sales dropdown
    	 Reports1 r=new Reports1(driver);
    	  r.getViewedoption().click();
    }
      
    @And("^Navigate to products Viewed Reports$")
    public void navigate_to_products_viewed_reports() throws Throwable {
    	//It will Navigate to Product Viewed Reports Page
    	 Reports1 r=new Reports1(driver);
    	  String r6=driver.getTitle();
      	  Assert.assertEquals("Products Viewed Report",r6);
      	  System.out.println("It will Show Products Viewed Report");
    }
  
    
}


