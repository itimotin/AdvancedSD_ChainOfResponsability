package lab;

public class Order {
	private String number;
	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public boolean isInternational() {
		return international;
	}


	public void setInternational(boolean international) {
		this.international = international;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	private double amount;
	private boolean international;
	private Customer customer;
	
	
	public Order(String number, double amount, boolean international,
			Customer customer) {
		this.customer = customer;
		this.number = number;
		this.international = international;
		this.amount = amount;
	}
	
	
}
