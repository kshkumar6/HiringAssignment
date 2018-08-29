package assignmentPlivo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods extends Elements{
	
	static WebDriver driver = new FirefoxDriver();
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	static Actions act=new Actions(driver);	
	
	public static void loginUI() {
		driver.get(getBaseURL());
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(getLOC_RESET_PASSWORD())));
		System.out.println("UI LAUNCHED AND NAVIGATION TO URL SUCCESS");
	}

	public static void createApp() {
		driver.findElement(By.id(getLOC_CREATE_APP())).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(getLOC_GET_STARTED())));
		System.out.println("CREATED APP SUCCESSFULLY");
	}
	
	public static void clickGetStarted() {
		driver.findElement(By.xpath(getLOC_GET_STARTED())).click();
		System.out.println("CLICKED ON GET STARTED BUTTON");
	}
	
	public static void addPage() {
		driver.findElement(By.id(getLOC_ADD_PAGE())).click();
		driver.findElement(By.cssSelector(getLOC_PAGE_NAME())).sendKeys("TEST"+Math.random());
		driver.findElement(By.xpath(getLOC_PAGE_CREATE())).click();
		System.out.println("ADDED THE NEW PAGE SUCCESSFULLY");
	}
	
	public static void clickTabs(String TabText, String Validate) {
		driver.findElement(By.linkText(TabText)).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Validate)));
		System.out.println("EXPANDED THE TAB SUCCESSFULLY");
	}
	public static void dragAndDropTiles(String frm,int x, int y) {
		WebElement From=driver.findElement(By.xpath(frm));						
	    act.dragAndDropBy(From, x, y).build().perform();	
	    System.out.println("DROPPED THE TILE TO SPECIFIED LOCATION SUCCESSFULLY");
	}
	
	public static void linkNodeReceptor(String frmArrow, String ToArrow) {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ToArrow)));
		List<WebElement> receptor = driver.findElements(By.cssSelector(ToArrow));
		WebElement toArrow = receptor.get(receptor.size()-1); 
		WebElement fromArrow = driver.findElement(By.cssSelector(frmArrow));
	    act.dragAndDrop(fromArrow, toArrow).build().perform();
	    System.out.println("LINKED NODE AND RECEPTOR SUCCESSFULLY");
	}
	
	public static void linkNodeReceptorStart(String frmArrow, String ToArrow) {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(ToArrow)));
		List<WebElement> receptor = driver.findElements(By.cssSelector(ToArrow));
		WebElement toArrow = receptor.get(receptor.size()-1); 
		WebElement fromArrow = driver.findElement(By.xpath(frmArrow));
	    act.dragAndDrop(fromArrow, toArrow).build().perform();
	    System.out.println("LINKED THE START NODE AND SMS RECEPTOR SUCCESSFULLY");
	}
	
	public static void enterSMSDetails() {
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(getLOC_SMS_NUMBER())));
		driver.findElement(By.cssSelector(getLOC_SMS_NUMBER())).sendKeys("9999999");
	    driver.findElement(By.cssSelector(getLOC_SMS_TEXT())).sendKeys("Hello World");
	    System.out.println("ENTERED SMS DETAILS SUCCESSFULLY");
	}
	public static void enterEmailDetails() {
	    driver.findElement(By.cssSelector(getLOC_SMTP_URL())).sendKeys("smtp.gmail.com");
	    driver.findElement(By.cssSelector(getLOC_SMTP_PORT())).sendKeys("465");
	    driver.findElement(By.cssSelector(getLOC_SMTP_UNAME())).sendKeys("abc@gmail.com");
	    driver.findElement(By.cssSelector(getLOC_SMTP_PWD())).sendKeys("Test@123");
	    driver.findElement(By.cssSelector(getLOC_EMAIL_FRM())).sendKeys("abc@gmail.com");
	    driver.findElement(By.cssSelector(getLOC_EMAIL_TO())).sendKeys("xyz.gmail.com");
	    driver.findElement(By.cssSelector(getLOC_EMAIL_SUB())).sendKeys("SMS not sent");
	    
	    List<WebElement> messgPhrase = driver.findElements(By.cssSelector("textarea[class='syn-autoexpand syn-constant syn-autogrow']"));
	    messgPhrase.get(messgPhrase.size()-1).sendKeys("SMS to phone number 12345 not sent");
	    System.out.println("ENTERED MAIL DETAILS SUCCESSFULLY");
	}	
	
	public static void closeDriver() {
		System.out.println("CLOSING DRIVER");
	driver.close();
	}
	}

