package hospital;

public class Patient {

	private int patient_id;
	private String patient_name;
	private String birthday;
	private String email;
	private String gender;
	
	public Patient(int patient_id, String patient_name, String birthday, String email, String gender) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.birthday = birthday;
		this.email = email;
		this.gender = gender;
	}

	public Patient() {
		super();
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void input() {
			// TODO Auto-generated method stub
			System.out.println("Input Patient details: ");
		}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Patient Information: ");
	}

	
	

}
