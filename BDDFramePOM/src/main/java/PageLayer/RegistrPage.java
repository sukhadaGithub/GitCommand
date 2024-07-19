package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;

public class RegistrPage extends BaseClass 
{
	
	HandleDropDown hd=new HandleDropDown();
	@FindBy(name="ctl00$ContentPlaceHolder1$txtFName")
	private WebElement name;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement address;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlState")
	private WebElement state;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlDistrict")
	private WebElement district;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")
	private WebElement country;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;
	
    @FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email;
    
    @FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")
   	private WebElement mobile;
    
    @FindBy(id="ctl00_ContentPlaceHolder1_ddlQuestions")
   	private WebElement question;
    
    @FindBy(name="ctl00$ContentPlaceHolder1$txtAnswer")
   	private WebElement answer;
    
    @FindBy(name="ctl00$ContentPlaceHolder1$txtUserId")
   	private WebElement username;
    
    @FindBy(name="ctl00$ContentPlaceHolder1$txtPassword")
   	private WebElement password;
    
    @FindBy(name="ctl00$ContentPlaceHolder1$txtConfirmPwd")
   	private WebElement conpass;
    
    @FindBy(name="ctl00$ContentPlaceHolder1$btnSubmit")
   	private WebElement submit;
    
    public RegistrPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterDetails(String name1,String add1,String State1,String country1,String city1,String email1,String mob1)
    {
    	
    	UtilityLayer.Wait.sendKeys(name,name1);
    	UtilityLayer.Wait.sendKeys(address, add1);
    	hd.selectByVisibleText(state, State1);
    	hd.selectByVisibleText(country, country1);
    	UtilityLayer.Wait.sendKeys(city, city1);
    	UtilityLayer.Wait.sendKeys(email, email1);
    	UtilityLayer.Wait.sendKeys(mobile, mob1);
    	
    
    }
    
    public void enterQuestion(String question1,String ans1)
    {
    	hd.selectByVisibleText(question, question1);
    	UtilityLayer.Wait.sendKeys(answer, ans1);
    }
    public void enterUsername(String user1,String pass1,String cpass1)
    {
    	UtilityLayer.Wait.sendKeys(username, user1);
    	UtilityLayer.Wait.sendKeys(password, pass1);
    	UtilityLayer.Wait.sendKeys(conpass, cpass1);
    }
    public void clickSubmit()
    {
    	
    	UtilityLayer.Wait.click(submit);
    }
    
    
    
    
	
	
	
	
	
	

}
