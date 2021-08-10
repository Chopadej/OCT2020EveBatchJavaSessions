package WebDriverTool;

public interface WebDriver {
	
	public void launchURL(String url);
	
	public String getTitle();

	public void click (String element);
	
	public void sendKeys(String element, String value);
	
	public void closeBrowser();
	

}
