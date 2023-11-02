package hospital;

public class Admissions {

	private int admissions_id;
	private int patient_id;
	private int department_id;
	private String admission_date;
	private String room_selection;
	
	public Admissions(int admissions_id, int patient_id, int department_id, String admission_date,
			String room_selection) {
		super();
		this.admissions_id = admissions_id;
		this.patient_id = patient_id;
		this.department_id = department_id;
		this.admission_date = admission_date;
		this.room_selection = room_selection;
	}

	public Admissions() {
		super();
	}

	public int getAdmissions_id() {
		return admissions_id;
	}

	public void setAdmissions_id(int admissions_id) {
		this.admissions_id = admissions_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getAdmission_date() {
		return admission_date;
	}

	public void setAdmission_date(String admission_date) {
		this.admission_date = admission_date;
	}

	public String getRoom_selection() {
		return room_selection;
	}

	public void setRoom_selection(String room_selection) {
		this.room_selection = room_selection;
	}
	
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input Admission details: ");
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Admission Information: ");
	}
}
