package WebDriverTool;

public class AmazonTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		//cross browser testing: chrome, ff, safari
		
		String browser= "chrome";
		
		if(browser.equals("chrome")) {
			//top casting 
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			//top casting 
			driver= new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			//top casting 
			driver= new SafariDriver();
		}
		else {
			System.out.println("No browser found, please pass the correct browser name");
		}
		
		driver.launchURL("http://www.amazon.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.sendKeys("search text", "macbook");
		driver.click("search button");
		driver.closeBrowser();


	}

}
