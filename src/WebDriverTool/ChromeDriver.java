package WebDriverTool;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("lauch google chrome");
	}

	@Override
	public void launchURL(String url) {
		System.out.println("launching url"+ url);
		
	}

	@Override
	public String getTitle() {
		String title= "some title";
		return title;
		
		
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element:" +element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("sending the value in: "+element+ "and value="+value);
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close browser");
		
	}

}
