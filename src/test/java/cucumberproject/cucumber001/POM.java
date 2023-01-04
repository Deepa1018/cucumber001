package cucumberproject.cucumber001;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM {
	
		
	@FindBy(id="username")
	public static WebElement username;
	@FindBy(id="password")
	public static WebElement password;
	@FindBy(id="login")
	public static WebElement login;
	
	@FindBy(id="location")
	public static WebElement location;
	@FindBy(id="hotels")
	public static WebElement hotels;
	@FindBy(id="room_type")
	public static WebElement roomtype;
	@FindBy(id="room_nos")
	public static WebElement numberofrooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	public static WebElement datain;
	@FindBy(xpath="//input[@name='datepick_out']")
	public static WebElement dateout;
	@FindBy(id="adult_room")
	public static WebElement adultperroom;
	@FindBy(id="child_room")
	public static WebElement childrenperroom;
	@FindBy(name="Submit")
	public static WebElement search;
	@FindBy(id="radiobutton_0")
	public static WebElement radiobutton;
	@FindBy(name="continue")
	public static WebElement continue1;
	
	@FindBy(name="first_name")
	public static WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	public static WebElement lastname;
	@FindBy(id="address")
	public static WebElement address;
	@FindBy(name="cc_num")
	public static WebElement creditcardnumber;
	@FindBy(id="cc_type")
	public static WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	public static WebElement ccexpirymonth;
	@FindBy(id="cc_exp_year")
	public static WebElement ccexpiryyear;
	@FindBy(name="cc_cvv")
	public static WebElement ccvnumber;
	
	@FindBy(id="book_now")
	public static WebElement booknow;

}
