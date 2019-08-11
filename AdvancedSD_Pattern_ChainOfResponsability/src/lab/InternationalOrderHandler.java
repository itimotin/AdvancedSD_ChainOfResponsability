package lab;

public class InternationalOrderHandler extends OrderHandler{
public InternationalOrderHandler() {
	
}
	
	
	@Override
	public void handlerOrder(Order order) {
		boolean found = false;
		
		if(order.isInternational()) {
			found = true;
			System.out.println("InternationalOrderHandler for order: "+order.getNumber());
		}else {
			nextHandler.handlerOrder(order);
		}
	}
	
}
