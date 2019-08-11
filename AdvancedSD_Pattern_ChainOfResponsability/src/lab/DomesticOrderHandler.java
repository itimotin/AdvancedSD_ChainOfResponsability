package lab;

public class DomesticOrderHandler extends OrderHandler {

	public DomesticOrderHandler() {}
	
	
	@Override
	public void handlerOrder(Order order) {
		System.out.println("DomesticOrderHandler for order: "+order.getNumber());
	}
}
