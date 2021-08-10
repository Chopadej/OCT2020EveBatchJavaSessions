package OOP_Interface;

public class FortisHospital extends UNHC implements USMedical, UKMedical,IndianMedical {

	//US
	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");	
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");	
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH---emergencySerices");
	}

	@Override
	public void services_911() {
		System.out.println("FH---services_911");	
	}
	
	@Override
	public String getPatientDetails() {
		System.out.println("FH---getPatientDetails");
		return "Some patient details";
	}

	//UK
	@Override
	public void radiologyServices() {
		System.out.println("FH----radiologyServices");	
	}

	@Override
	public void ENTServices() {
		System.out.println("FH----ENTServices");
	}
	
	@Override
	public void radiologyServices(int doctorCounts) {
		System.out.println("FH---radiologyServices with" +doctorCounts);
		
	}

	//IndianMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");	
	}

	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");	
	}

	@Override
	public void orthoServices() {
		System.out.println("FH---orthoServices");	
	}
	
	//FH:
	public void medicalInsurance() {
		System.out.println("FH--medicalInsurance");
	}
	
	public void medicalTraining() {
		System.out.println("FH--medicalTraining");
	}

	@Override
	public void covid19Test() {
		System.out.println("FH---covid19Test");
		
	}
	public static void billing() {
		System.out.println("FH--billing system");
		//super keyword we can't use in static method
	}
	
	@Override
	public void ambulanceServices() {
		System.out.println("FH---ambulanceServices" +400);
	}


}
