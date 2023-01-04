package cucumberproject.cucumber001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	public static WebDriver driver;
	public static WebDriver BrowserLaunch(String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			return driver;
		
	}
	public static void Url(String url) {
		driver.get(url);
		
	}
	public static void Maximize() {
		driver.manage().window().maximize();
	}
	public static void ImplicityWait(long time,TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);
	}
	public static void InputValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void Click(WebElement element) {
		element.click();
	}
	public static String TextOfElement(WebElement element) {
		String text = element.getText();
		return text;
	
	}
	public static String pageTitle() {
		return driver.getTitle();
		
	}
	public static Select select(WebElement element) {
		Select s = new Select(element);
		return s;
	}
	
	public static void LocationDropDown(WebElement location) {
	     location.toString();
		
	}
	public static void HotelsDropDown(WebElement hotels) {
	      hotels.toString();
		
	}
	public static void RoomtypeDropDown(WebElement roomtype) {
	      roomtype.toString();
		
	}
	public static void NumberofroomsDropDown(WebElement numberofrooms) {
	      numberofrooms.toString();
		
	}
	public static void Clear(WebElement element) {
		element.clear();
	}
	public static void Adultperroom(WebElement adultperroom) {
	     adultperroom.toString();
		
	}
	public static void ChildrenperRoom(WebElement childrenperroom) {
	     childrenperroom.toString();
		
	}
	public static void CreditcardType(WebElement creditcardtype) {
	     creditcardtype.toString();
		
	}
	public static void CCexpirymonth(WebElement ccexpirymonth) {
	     ccexpirymonth.toString();
		
	}
	public static void CCExpiryyear(WebElement ccexpiryyear) {
	     ccexpiryyear.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
