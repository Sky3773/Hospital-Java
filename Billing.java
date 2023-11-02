package hospital;

public class Billing {

	private int transaction_id;
	private int patient_id;
	private String billing_date;
	private float bill_amount;
	
	public Billing(int transaction_id, int patient_id, String billing_date, float bill_amount) {
		super();
		this.transaction_id = transaction_id;
		this.patient_id = patient_id;
		this.billing_date = billing_date;
		this.bill_amount = bill_amount;
	}

	public Billing() {
		super();
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getBilling_date() {
		return billing_date;
	}

	public void setBilling_date(String billing_date) {
		this.billing_date = billing_date;
	}

	public float getBill_amount() {
		return bill_amount;
	}

	public void setBill_amount(float bill_amount) {
		this.bill_amount = bill_amount;
	}
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input Billing details: ");
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Billing Information: ");
	}

}
