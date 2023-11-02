package hospital;

public class Doctors {

	private int doctor_id;
	private String doctor_name;
	private int department_id;
	private String role;
	private String availability;
	
	public Doctors(int doctor_id, String doctor_name, int department_id, String role, String availability) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.department_id = department_id;
		this.role = role;
		this.availability = availability;
	}

	public Doctors() {
		super();
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input Doctor details: ");
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Doctor Information: ");
	}
}
