package hospital;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient patient = new Patient();
		Doctors doctor = new Doctors();
		Department department = new Department();
		Admissions admission = new Admissions();
		Billing billing = new Billing();
		
		patient.input();
		patient.display();
		
		doctor.input();
		doctor.display();
		
		department.input();
		department.display();
		
		admission.input();
		admission.display();
		
		billing.input();
		billing.display();	
	}

}
