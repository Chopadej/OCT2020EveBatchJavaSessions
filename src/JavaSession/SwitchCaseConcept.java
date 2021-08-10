package JavaSession;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser = "Chrome";
		switch (browser) {
		
		case "Chrome":
			System.out.println("launch chrome");
			break;

		case "Firefox":
			System.out.println("launch FF");
			break;
		case "IE":
			System.out.println("launch IE");
			break;
		case "Safari":
			System.out.println("launch Safari");
			break;
		default:
			System.out.println("Please pass the correct browser name" +browser);
			break;

	}

		int marks = 40;
		switch (marks) {
		case 90:
			System.out.println("Grade A");
			break;
		case 80:
			System.out.println("Grade B");
			break;
		case 60:
			System.out.println("Grade C");
			break;
		default:
			System.out.println("Fail...."+marks);
			break;
		}
}
}
