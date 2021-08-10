package OOP_Encapsulation;

public class BrowserLaunch {
	
	public void launchBrowser() {
		System.out.println("chrome browser is getting launch");
		checkOSVersion();
		checkRAMSPace();
		checkOSCompatible();
		
		System.out.println("chrome is launched");
	}
	
	private void checkOSVersion() {
		System.out.println("Checking OS version");
	}

	private void checkRAMSPace() {
		System.out.println("Checking RAMSpace");
	}
	
	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}
	

}
