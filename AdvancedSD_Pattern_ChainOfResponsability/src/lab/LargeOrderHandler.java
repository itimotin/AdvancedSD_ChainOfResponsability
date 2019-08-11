package lab;

public class LargeOrderHandler extends OrderHandler {

	public LargeOrderHandler() {
		
	}
	
	
	
	@Override
	public void handlerOrder(Order order) {
		// TODO Auto-generated method stub
		if (order.getAmount() >= 30000.0) {
			System.out.println("LargeOrderHandler for order: "+ order.getNumber());
		}
		else {
			nextHandler.handlerOrder(order);
		}
	}

}
