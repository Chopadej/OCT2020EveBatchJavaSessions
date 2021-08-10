package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh= new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.dentalServices();
		System.out.println(fh.getPatientDetails());
		
		fh.medicalInsurance();
		fh.medicalTraining();
		
		fh.medicalFunds();
		fh.worldMedicalPolicies();
		
		System.out.println(USMedical.min_fees);
		USMedical.billing();
		FortisHospital.billing();
		
		fh.ambulanceServices();
		
		
		
		//Top casting: child class object can be reffered by parent interface reference variable
		// so, method available in the USMedical Interface only accessed by USMedical reference variable

		USMedical us =new FortisHospital();
		
		us.cardioServices();
		us.getPatientDetails();
		us.emergencyServices();
		us.services_911();
		us.physioServices();
		
		//Very very important concept
		//down casting: parent interface object can be reffered by child class reference variable
		//BUT Object itself not allowed to create in interface
		
	//	FortisHospital fs= new USMedical();
		
	}

}
