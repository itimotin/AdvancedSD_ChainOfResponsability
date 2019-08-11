package lab;

import java.util.ArrayList;
import java.util.Collection;

public class MostFavoredCustomerHandler extends OrderHandler   {
	private Collection<Customer> mostFavoredCustomerList =
			new ArrayList<>();
	
	public MostFavoredCustomerHandler() {
		this.mostFavoredCustomerList.add(new Customer("Ion Timorin"));
		this.mostFavoredCustomerList.add(new Customer("Emma Timotin"));
	}
	
	
			
	@Override
	public void handlerOrder(Order order) {
		// TODO Auto-generated method stub
		boolean found = false;
		
		for(Customer customer : this.mostFavoredCustomerList) {
			if (order.getCustomer().getName().equals(customer.getName())) {
				found = true;
				System.out.println("MostFavoredCustomerHandler for order: " + order.getNumber());
			}
		}
		
		if (found == false) {
			nextHandler.handlerOrder(order);
		}
	}

}
